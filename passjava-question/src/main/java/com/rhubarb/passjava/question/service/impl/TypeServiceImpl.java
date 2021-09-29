package com.rhubarb.passjava.question.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rhubarb.common.utils.PageUtils;
import com.rhubarb.common.utils.Query;

import com.rhubarb.passjava.question.dao.TypeDao;
import com.rhubarb.passjava.question.entity.TypeEntity;
import com.rhubarb.passjava.question.service.TypeService;


@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeDao, TypeEntity> implements TypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TypeEntity> page = this.page(
                new Query<TypeEntity>().getPage(params),
                new QueryWrapper<TypeEntity>()
        );

        return new PageUtils(page);
    }

}