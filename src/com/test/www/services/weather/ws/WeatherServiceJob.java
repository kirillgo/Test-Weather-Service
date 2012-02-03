package com.test.www.services.weather.ws;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.test.www.services.weather.ws.stub.GetWeatherRequestParams;


/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 02.02.12
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
public class WeatherServiceJob implements Job{

	private static Logger _log = LoggerFactory.getLogger(WeatherServiceJob.class);

	WeatherServiceJob() {

	}

	public void execute(JobExecutionContext context)
			throws JobExecutionException {

		JobDataMap data = context.getJobDetail().getJobDataMap();
		GetWeatherRequestParams wsParams = (GetWeatherRequestParams)data.get("IN");

	}

}
