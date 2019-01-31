package com.xwh.demo.service;

import com.xwh.demo.entity.Star;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Bean
 * @since 2019-01-30
 */
public interface StarService extends IService<Star> {
    List<Star> getAllStar();
    List<Star> getAllStarByName(String name);
}
