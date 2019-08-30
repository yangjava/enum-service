package com.enums.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnumsTest {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testSet(){
        redisTemplate.opsForValue().set("name","yang");
        String value=(String) redisTemplate.opsForValue().get("name");
        System.out.println(value);
    }
}
