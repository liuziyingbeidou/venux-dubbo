package com.venux;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Title: ZJS 
 * @ClassName: DubboProviderApp 
 * @Description: Dubbo 暴露服务
 * @author liuzy
 * @date 2018年11月13日 下午4:57:07
 */
@SpringBootApplication
public class DubboProviderApp 
{
    public static void main( String[] args ){
    	new SpringApplicationBuilder(DubboProviderApp.class)
    	.web(WebApplicationType.NONE)
    	.run(args);
    }
}
