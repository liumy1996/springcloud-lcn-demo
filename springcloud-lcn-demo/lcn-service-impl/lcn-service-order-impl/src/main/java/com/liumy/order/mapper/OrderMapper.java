package com.liumy.order.mapper;

import com.liumy.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @program: springcloud-lcn-demo
 * @description: 简单实现mapper层
 * @author: liumingyu
 * @date: 2020-03-04 10:55
 **/
public interface OrderMapper {
    @Insert(value = "INSERT INTO `order_info` VALUES (#{id}, " +
            "#{name}, #{orderCreatetime}, #{orderMoney}, #{orderState}, #{commodityId},#{orderId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int addOrder(OrderEntity orderEntity);


    @Select("SELECT * from order_info where orderId=#{orderId};")
    public OrderEntity findOrderId(@Param("orderId") String orderId);
}
