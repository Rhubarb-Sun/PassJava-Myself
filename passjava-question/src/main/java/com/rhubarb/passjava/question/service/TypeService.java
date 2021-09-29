package com.rhubarb.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rhubarb.common.utils.PageUtils;
import com.rhubarb.passjava.question.entity.TypeEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author rhubarb
 * @email sunxunchn@163.com
 * @date 2021-09-27 23:39:28
 */

public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

