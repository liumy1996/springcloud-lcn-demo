package com.liumy.order;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springcloud-lcn-demo
 * @description:
 * @author: liumingyu
 * @date: 2020-03-04 10:37
 **/
@SpringBootApplication
@MapperScan("com.liumy.order.mapper")
@EnableFeignClients
@EnableDistributedTransaction
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
