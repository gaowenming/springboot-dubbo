package com.test;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.smart.consumer.Application;
import com.smart.model.User;
import com.smart.service.IUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: gaowenming
 * Description:
 * Date: Created in 8:17 2017/7/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ConsumerTest {

    @DubboConsumer
    private IUserService userService;

    @Test
    public void testConsumer() throws Exception {
        System.out.println("######################################################################");
        User user = userService.getUserById(8);
        System.out.println(user);
    }
}
