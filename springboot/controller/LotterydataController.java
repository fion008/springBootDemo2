package com.springboot.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.common.PageParam;
import com.springboot.entity.Lotterydata;
import com.springboot.service.LotterydataService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
@RequestMapping("/lotterydata")
public class LotterydataController {


    @Resource
    private LotterydataService lotterydataService;

    /**
     * 分页查询
     *
     * @param pageParam
     * @param keywords
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/pagelist")
    public PageInfo select(@ModelAttribute("pageParam") PageParam pageParam, String keywords) throws Exception {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getNumPerPage());
        List<Lotterydata> list = lotterydataService.findLotteryList(keywords);
        PageInfo<Lotterydata> appsPageInfo = new PageInfo<>(list);
        return appsPageInfo;
    }

    /**
     * 通过主键查询一条记录
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/byid")
    @ResponseBody
    public Lotterydata byId(HttpServletRequest request, int id) {
        Lotterydata lotterydata = lotterydataService.getLotteryById(id);
        return lotterydata;
    }

    /**
     * 新增与修改
     *
     * @param request
     * @param lotterydata
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public int update(HttpServletRequest request, @ModelAttribute("lotterydata") Lotterydata lotterydata) {
        int result = lotterydataService.updateLottery(lotterydata);
        return result;
    }

}
