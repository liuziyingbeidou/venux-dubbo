package com.venux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: ZJS 
 * @ClassName: DubboConsumerApp 
 * @Description: Dubbo 消费
 * @author liuzy
 * @date 2018年11月13日 下午10:38:25
 */
@SpringBootApplication(scanBasePackages = "com.venux.controller")
public class DubboConsumerApp {
	
    public static void main( String[] args ){
    	SpringApplication.run(DubboConsumerApp.class,args);
    }
}
