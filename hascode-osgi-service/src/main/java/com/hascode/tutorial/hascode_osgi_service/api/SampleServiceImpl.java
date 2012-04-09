package com.hascode.tutorial.hascode_osgi_service.api;

public class SampleServiceImpl implements SampleService {

	public String getGreeting(final String name) {
		return "hello, " + name;
	}

}
