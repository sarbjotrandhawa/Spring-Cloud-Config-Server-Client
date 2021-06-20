package com.configuration.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

	@Autowired
	private Dbsettings dbsettings;

	@Value("${my.greetings}")
	private String greetingMessage;

	@GetMapping("/greetings")
	public String greetings() {
		return greetingMessage + " " + dbsettings.getConnection() + " " + dbsettings.getHost() + " "
				+ dbsettings.getPort();
	}

}
