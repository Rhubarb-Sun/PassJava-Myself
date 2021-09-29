package com.rhubarb.passjava.question.dao;

import com.rhubarb.passjava.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author rhubarb
 * @email sunxunchn@163.com
 * @date 2021-09-27 23:39:28
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
