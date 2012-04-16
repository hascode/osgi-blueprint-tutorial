package com.hascode.tutorial.blueprint_wiring_example;

import com.hascode.tutorial.blueprint_service_export.SimpleTimeService;
import com.hascode.tutorial.hascode_osgi_service.api.SampleService;

public class TimeGreetServiceImpl implements TimeGreetService {
	private final SimpleTimeService timeService;
	private final SampleService sampleService;

	public TimeGreetServiceImpl(final SimpleTimeService timeService,
			final SampleService sampleService) {
		this.timeService = timeService;
		this.sampleService = sampleService;
	}

	public String print() {
		return timeService.getTime() + ":" + sampleService.getGreeting("tim");
	}

}
