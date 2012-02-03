package com.test.www.services.weather.ws;

import com.test.www.services.weather.ws.stub.*;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;



/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 02.02.12
 * Time: 9:16
 * To change this template use File | Settings | File Templates.
 */
public class WeatherService extends WeatherServiceSkeleton {



	/**
	 * Auto generated method signature
	 *
	 * @param getWeatherRequestParams
	 * @return getWeatherResponseParams
	 * @throws com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultException
	 * @throws com.test.www.services.weather.ws.stub.UnknownLocationFaultException
	 * @throws com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultException
	 */

	public com.test.www.services.weather.ws.stub.GetWeatherResponseParamsE getWeather
	(
			com.test.www.services.weather.ws.stub.GetWeatherRequestParamsE getWeatherRequestParams
	)
			throws ProviderInternalErrorFaultException,UnknownLocationFaultException,ProviderNotAvailableFaultException {

/*
		JobDetail job = newJob(WeatherServiceJob.class)
				.withIdentity("job1", "main")
				.build();

		// Trigger the job to run on the next round minute
		Trigger trigger = newTrigger()
				.withIdentity("trigger1", "main")
				.startNow()
				.build();

		// pass initialization parameters into the job
		job.getJobDataMap().put("IN", getWeatherRequestParams);

		// Tell quartz to schedule the job using our trigger
		try {
			java.util.Date dt = WeatherServiceThreadPool.getPool().getScheduler().scheduleJob(job, trigger);
			WeatherServiceThreadPool.getPool().getScheduler().start();
		} catch (SchedulerException se) {
			se.printStackTrace();
		}
*/
		//Формирование мок ответа
		String location = getWeatherRequestParams.getGetWeatherRequestParams().getLocation();
		Date[] dates = getWeatherRequestParams.getGetWeatherRequestParams().getDates().getDate();
		Weather[] weathers = new Weather[dates.length];

		for(int i = 0; i < dates.length; i++) {
			Weather weather = new Weather();
			weather.setLocation( location );
			weather.setDate( dates[i] );
			weather.setWeather( "+1" + String.format("%d", i) );
			weathers[i] = weather;
		}

		GetWeatherResponseParams response = new GetWeatherResponseParams();
		response.setWeather( weathers );
		GetWeatherResponseParamsE responseE = new GetWeatherResponseParamsE();
		responseE.setGetWeatherResponseParams(response);
		return responseE;
	}

}
