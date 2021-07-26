package com.example.springapp.service;

import com.example.hibernate.controller.dto.*;
import com.example.hibernate.service.*;
import java.util.*;
import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.runner.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class TeacherServiceTest {

    private TeacherService teacherService = new TeacherServiceImpl(null, null);

//    @Before
//    public void setDefaultValue() {
//        this.teacherService = new TeacherServiceImpl(null, null);
//    }

    @Test
    public void getTeacherList() {
        List<TeacherDto> expectedList = new ArrayList<>();
        List<TeacherDto> list = teacherService.getTeachers();
        Assert.assertArrayEquals(expectedList.toArray(), list.toArray());
    }
}
