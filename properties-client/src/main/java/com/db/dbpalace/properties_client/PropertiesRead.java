package com.db.dbpalace.properties_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class PropertiesRead {

	@Value("${user.user}")
	String token;

	@Value("${user.pass}")
	private String port;

	@GetMapping("/status/check")
	public String status() {
		return "Working on port " + port + " with token " + token;
	}

}