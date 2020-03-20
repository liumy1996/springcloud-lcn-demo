package com.liumy.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.liumy.order.entity.OrderEntity;
import com.liumy.order.mapper.OrderMapper;
import com.liumy.order.service.feign.DistributeServiceFeign;
import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: springcloud-lcn-demo
 * @description: 订单service
 * @author: liumingyu
 * @date: 2020-03-04 11:41
 **/
@RestController
public class OrderServiceImpl {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DistributeServiceFeign distributeServiceFeign;

    /**
     * @Author liumingyu
     * @Description //TODO 插入订单记录，调用派单服务
     * @Date 2020/3/4 2:20 下午
     * @Param [age]
     * @return java.lang.String
     **/
    @RequestMapping("/insertOrder")
    @LcnTransaction
    @Transactional
    public String insertOrder(int age) {
        String orderId = System.currentTimeMillis() + "";
        OrderEntity newOrder = createOrder(orderId);
        // 1.向订单数据库表插入数据
        int result = orderMapper.addOrder(newOrder);
        if (result < 0) {
            return "插入订单失败";
        }

        // 2.调用派单服务，实现对该笔订单派单 远程调用派单接口
        String resultDistribute = distributeServiceFeign.distributeOrder(orderId);
//      if (!"200".equals(resultDistribute)){
//          执行抛异常等操作。。。
//      }
        // 调用订单接口失败的代码...
        int j = 1 / age;
        return resultDistribute;
    }

    public OrderEntity createOrder(String orderId) {
        OrderEntity orderEntity = new OrderEntity();
        String uuid = System.currentTimeMillis() + "";
        orderEntity.setName("LCN解决分布式事务某书籍,编号"+uuid);
        orderEntity.setOrderCreatetime(new Date());
        // 价格是300元
        orderEntity.setOrderMoney(300d);
        // 状态为 未支付
        orderEntity.setOrderState(0);
        Long commodityId = 30L;
        // 商品id
        orderEntity.setCommodityId(commodityId);
        orderEntity.setOrderId(orderId);
        return orderEntity;
    }
}
