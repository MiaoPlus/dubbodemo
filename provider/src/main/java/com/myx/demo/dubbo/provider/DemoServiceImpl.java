package com.myx.demo.dubbo.provider;

import com.myx.demo.dubbo.api.DemoService;

/**
 * @Author: Yuxiang Miao
 * @Description：
 * @Date: Created in 9:28 2019/9/30
 * @Modified By：
 */
public class DemoServiceImpl implements DemoService {

    /**
     * 测试方法，在用户名后面添加一个字符串
     */
    @Override
    public String changeUsername(String username){
        return username + "is changed!";
    }
}
