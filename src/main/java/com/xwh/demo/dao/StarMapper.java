package com.xwh.demo.dao;

import com.xwh.demo.entity.Star;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Bean
 * @since 2019-01-30
 */
public interface StarMapper extends BaseMapper<Star> {
    List<Star> getAllStar();
    List<Star> getAllStarByName(String name);
}
