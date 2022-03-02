package com.ttbank.flep.core.service.impl;

import com.ttbank.flep.core.entity.Student;
import com.ttbank.flep.core.mapper.StudentMapper;
import com.ttbank.flep.core.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lucky
 * @since 2022-02-22
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void insertOneStu() {
        Student student=new Student();
        student.setCreateTime(new Date());
        student.setName("lucky");
        student.setGender("man");
        studentMapper.insert(student);

    }
}
