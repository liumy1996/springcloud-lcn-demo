package com.liumy.distribute.impl.mapper;

import com.liumy.distribute.impl.entity.DispatchEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author liumingyu
 * @Description //TODO mapper
 * @Date 2020/3/4 2:51 下午
 * @Param
 * @return
 **/
@Repository
@Mapper
public interface DispatchMapper {

    /**
     * 新增派单任务
     */
    @Insert("INSERT into platoon values (null,#{orderId},#{userId});")
    int insertDistribute(DispatchEntity distributeEntity);


}
