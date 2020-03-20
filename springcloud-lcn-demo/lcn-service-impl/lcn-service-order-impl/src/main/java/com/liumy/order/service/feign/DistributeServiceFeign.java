package com.liumy.order.service.feign;

import com.liumy.distribute.api.DistributeService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author liumingyu
 * @Description //TODO
 * @Date 2020/3/4 11:44 上午
 * @Param
 * @return
 **/
@FeignClient("lcn-distribute")
public interface DistributeServiceFeign extends DistributeService {

}
