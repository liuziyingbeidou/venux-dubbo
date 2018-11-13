package com.venux.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.venux.service.itf.DemoService;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot)";
	}

}
