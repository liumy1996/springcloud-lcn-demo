package com.liumy.distribute.impl.service;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.liumy.distribute.impl.entity.DispatchEntity;
import com.liumy.distribute.impl.mapper.DispatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program:
 * @description: 派单service
 * @author: liumingyu
 * @date: 2020-02-27 10:20
 **/
@RestController
public class DispatchService {

    @Resource
    private DispatchMapper dispatchMapper;

    @PostMapping("/distributeOrder")
    @LcnTransaction
    @Transactional
    public String distributeOrder(@RequestParam("orderId") String orderId){
        Long userId = Long.valueOf(1889900);
        DispatchEntity dispatchEntity = new DispatchEntity();
        dispatchEntity.setOrderId(orderId);
        dispatchEntity.setUserId(userId);
        int row = dispatchMapper.insertDistribute(dispatchEntity);
        if (row <= 0){
            return "500";
        }
        return "200";
    }
}
