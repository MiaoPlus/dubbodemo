package com.myx.demo.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Yuxiang Miao
 * @Description：
 * @Date: Created in 9:54 2019/9/30
 * @Modified By：
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        // 阻塞当前进程，否则程序会直接停止
        System.in.read();
    }
}
