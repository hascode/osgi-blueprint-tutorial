package com.hascode.tutorial.hascode_blueprint_bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.hascode.tutorial.hascode_osgi_service.api.SampleService;

public class Activator implements BundleActivator {

	public void start(final BundleContext context) throws Exception {
		System.out.println("blueprint bundle activator called");
	}

	public void stop(final BundleContext context) throws Exception {
	}

	public void onBindService(final SampleService sampleService) {
		if (sampleService == null) {
			System.out.println("sample service is null");
		} else {
			System.out.println("greet: " + sampleService.getGreeting("bob"));
		}
	}

	public void onUnbindService(final SampleService sampleService) {
		System.out.println("service unbound");
	}
}
