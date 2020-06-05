package com.example.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Administrator on 2020/6/4.
 */

@WebService
public interface hello {
    @WebMethod
    String sayHello(@WebParam(name="name")String name);
}
