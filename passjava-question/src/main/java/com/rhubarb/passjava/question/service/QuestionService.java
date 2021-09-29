package com.rhubarb.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rhubarb.common.utils.PageUtils;
import com.rhubarb.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author rhubarb
 * @email sunxunchn@163.com
 * @date 2021-09-27 23:39:28
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

