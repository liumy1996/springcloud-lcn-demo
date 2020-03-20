package com.liumy.distribute;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springcloud-lcn-demo
 * @description: 派单启动类
 * @author: liumingyu
 * @date: 2020-03-04 10:32
 **/
@SpringBootApplication
@MapperScan("com.liumy.distribute.impl.mapper")
@EnableDistributedTransaction
public class DistributeApp {

    public static void main(String[] args) {
        SpringApplication.run(DistributeApp.class,args);
    }
}
