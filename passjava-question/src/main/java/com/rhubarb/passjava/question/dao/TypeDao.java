package com.rhubarb.passjava.question.dao;

import com.rhubarb.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author rhubarb
 * @email sunxunchn@163.com
 * @date 2021-09-27 23:39:28
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
