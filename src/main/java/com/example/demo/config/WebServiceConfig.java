package com.example.demo.config;

import com.example.demo.webService.hello;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2020/6/4.
 */
@Configuration
public class WebServiceConfig {
    @Autowired
    private hello hello;

    /**
     * 注入servlet  bean name不能dispatcherServlet 否则会覆盖dispatcherServlet
     * @return
     */
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/webservice/*");
    }


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * 注册WebServiceDemoService接口到webservice服务
     * @return
     */
    @Bean(name = "hello")
    public javax.xml.ws.Endpoint sweptPayEndpoint() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new org.apache.cxf.jaxws.EndpointImpl(springBus(), hello);
        endpoint.publish("/hello");
        return endpoint;
    }

    /**
     * 注册WebServiceDemoService接口到webservice服务
     * @return
     */
    @Bean(name = "aaa")
    public javax.xml.ws.Endpoint ss() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new org.apache.cxf.jaxws.EndpointImpl(springBus(), hello);
        endpoint.publish("/aaa");
        return endpoint;
    }
}
