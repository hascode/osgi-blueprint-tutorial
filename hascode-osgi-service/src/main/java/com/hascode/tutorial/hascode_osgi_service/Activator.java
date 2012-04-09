package com.hascode.tutorial.hascode_osgi_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.hascode.tutorial.hascode_osgi_service.api.SampleService;
import com.hascode.tutorial.hascode_osgi_service.api.SampleServiceImpl;

public class Activator implements BundleActivator {
	private ServiceRegistration serviceRegistration;

	public void start(final BundleContext context) throws Exception {
		serviceRegistration = context.registerService(
				SampleService.class.getName(), new SampleServiceImpl(), null);
	}

	public void stop(final BundleContext context) throws Exception {
		serviceRegistration.unregister();
	}

}
