package com.xwh.demo.controller;


import com.xwh.demo.entity.Star;
import com.xwh.demo.service.StarService;
import com.xwh.demo.utils.Result;
import com.xwh.demo.utils.ReturnEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Bean
 * @since 2019-01-30
 */
@Controller
@RequestMapping("/star")
public class StarController {
    @Autowired
    private StarService starService;

    @RequestMapping("/getAllStar")
    @ResponseBody
    public Result<Star> getAllStar(){
        Result result = new Result(ReturnEnum.SUCCESS);
        result.setData(starService.getAllStar());
        return result;
    }
}

