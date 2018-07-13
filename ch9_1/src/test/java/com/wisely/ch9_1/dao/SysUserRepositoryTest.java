package com.wisely.ch9_1.dao;

import com.wisely.ch9_1.Ch91Application;
import com.wisely.ch9_1.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Ch91Application.class)
@WebAppConfiguration
public class SysUserRepositoryTest {

    @Autowired
    SysUserRepository sysUserRepository;

    @Test
    public void findByUsername() {
        SysUser bbb = sysUserRepository.findByUsername("bbb");
        System.out.println(bbb.getUsername());
    }
}