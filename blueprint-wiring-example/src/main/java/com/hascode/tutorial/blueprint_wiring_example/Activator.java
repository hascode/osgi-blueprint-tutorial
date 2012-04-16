package com.hascode.tutorial.blueprint_wiring_example;

import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(final BundleContext context) throws Exception {
	}

	public void stop(final BundleContext context) throws Exception {
	}

	public void onRegisterService(final TimeGreetService service,
			final Map properties) {
		System.out.println("TimeGreetService registered - output: "
				+ service.print());
	}

	public void onUnregisterService(final TimeGreetService service,
			final Map properties) {

	}
}
