package com.multithreading;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PostMapping("/users")
	public void Add(@RequestBody List<User> users) throws Exception {
		/**
		 * Here we are rotating user's list and assigning each and every user into a
		 * separate worker thread, so that work will be done parallely
		 */
		for (User user : users) {
			try {
				ThreadManager.execute(new UserWork(user));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
