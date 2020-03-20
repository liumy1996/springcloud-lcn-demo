package com.liumy.distribute.api;

import feign.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liumingyu
 * @Description //TODO 派单接口api
 * @Date 2020/3/4 10:25 上午
 * @Param
 * @return
 **/
public interface DistributeService {

    /**
     * @Author liumingyu
     * @Description //TODO 根据orderId实现派单
     * @Date 2020/3/4 10:25 上午
     * @Param [orderId]
     * @return java.lang.String
     **/
    @PostMapping("/distributeOrder")
    String distributeOrder(@RequestParam("orderId") String orderId);
}
