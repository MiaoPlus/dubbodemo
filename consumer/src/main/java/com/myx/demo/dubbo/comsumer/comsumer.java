package com.myx.demo.dubbo.comsumer;

import com.myx.demo.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Yuxiang Miao
 * @Description：
 * @Date: Created in 10:02 2019/9/30
 * @Modified By：
 */
public class comsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        String username = "Miao Yuxiang ";
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.changeUsername(username));
    }
}
