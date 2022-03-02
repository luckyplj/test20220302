package com.ttbank.flep.core.service;

import com.ttbank.flep.core.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lucky
 * @since 2022-02-22
 */
public interface IStudentService extends IService<Student> {

    void insertOneStu();
}
