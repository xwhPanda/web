package com.xwh.demo.service.impl;

import com.xwh.demo.entity.Star;
import com.xwh.demo.dao.StarMapper;
import com.xwh.demo.service.StarService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Bean
 * @since 2019-01-30
 */
@Service
public class StarServiceImpl extends ServiceImpl<StarMapper, Star> implements StarService {

    @Override
    public List<Star> getAllStar() {
        return baseMapper.getAllStar();
    }

    @Override
    public List<Star> getAllStarByName(String name) {
        return baseMapper.getAllStarByName(name);
    }
}
