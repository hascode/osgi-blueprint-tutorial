package com.hascode.tutorial.blueprint_service_export;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTimeServiceImpl implements SimpleTimeService {

	public String getTime() {
		return String.format("the time is: %s",
				new SimpleDateFormat("hh:mm:ss").format(new Date()));
	}
}
