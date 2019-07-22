package com.springboot.mapper;

import com.springboot.entity.Lotterydata;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface LotterydataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lotterydata record);

    int insertSelective(Lotterydata record);

    Lotterydata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lotterydata record);

    int updateByPrimaryKey(Lotterydata record);

    List<Lotterydata> findLotteryList(@Param("qihao")String keywords);

}