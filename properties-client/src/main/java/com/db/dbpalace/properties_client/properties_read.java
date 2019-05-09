package com.db.dbpalace.properties_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class properties_read {

	@GetMapping("/status/check")
	public String status() {
		return "working";
	}

}
