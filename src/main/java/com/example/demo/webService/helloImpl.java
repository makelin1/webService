package com.example.demo.webService;

import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 2020/6/4.
 */

@Service
@WebService(
        serviceName = "hello", // 与接口中指定的name一致
        targetNamespace = "http://webService.demo.example.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.demo.webService.hello" // 接口地址
)
public class helloImpl implements hello {
    @Override
    public String sayHello(String name){
        return "hello " + name;
    }
}
