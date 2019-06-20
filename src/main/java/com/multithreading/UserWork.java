package com.multithreading;

public class UserWork implements Runnable {

	private User user;

	public UserWork(User user) {
		this.user = user;
	}

	@Override
	public void run() {
		// Please add your businees logic here
	}

}
