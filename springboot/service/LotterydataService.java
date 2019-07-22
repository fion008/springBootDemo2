package com.springboot.service;

import com.springboot.entity.Lotterydata;

import java.util.List;

public interface LotterydataService {
    public Lotterydata getLotteryById(int id);

    public List<Lotterydata> findLotteryList(String keywords);

    public int updateLottery(Lotterydata lotterydata);
}
