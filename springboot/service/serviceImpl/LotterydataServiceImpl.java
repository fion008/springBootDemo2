package com.springboot.service.serviceImpl;

import com.springboot.entity.Lotterydata;
import com.springboot.mapper.LotterydataMapper;
import com.springboot.service.LotterydataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("lotterydataService")
public class LotterydataServiceImpl implements LotterydataService {


    @Resource
    private LotterydataMapper lotterydataMapper;

    @Override
    public Lotterydata getLotteryById(int id) {
        return lotterydataMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Lotterydata> findLotteryList(String keywords) {
        return lotterydataMapper.findLotteryList(keywords);
    }

    @Override
    public int updateLottery(Lotterydata lotterydata) {
        if (lotterydata.getId() != null) {
            return lotterydataMapper.updateByPrimaryKeySelective(lotterydata);
        } else {
            return lotterydataMapper.insertSelective(lotterydata);
        }
    }
}
