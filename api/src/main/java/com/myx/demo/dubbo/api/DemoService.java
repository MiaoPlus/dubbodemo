package com.myx.demo.dubbo.api;

/**
 * @Author: Yuxiang Miao
 * @Description：
 * @Date: Created in 9:13 2019/9/30
 * @Modified By：
 */
public interface DemoService {
    /**
     * 测试方法，在用户名后面添加一个字符串
     *
     */
    String changeUsername(String username);

}
