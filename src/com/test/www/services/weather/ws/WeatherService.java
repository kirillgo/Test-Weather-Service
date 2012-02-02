package com.test.www.services.weather.ws;

import com.test.www.services.weather.ws.stub.ProviderInternalErrorFaultException;
import com.test.www.services.weather.ws.stub.ProviderNotAvailableFaultException;
import com.test.www.services.weather.ws.stub.UnknownLocationFaultException;
import com.test.www.services.weather.ws.stub.WeatherServiceSkeleton;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
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

				 JobDetail job = newJob(WeatherServiceJob.class)
					 .withIdentity("job1", "group1")
					 .build();

				 // Trigger the job to run on the next round minute
				 Trigger trigger = newTrigger()
					 .withIdentity("trigger1", "group1")
					 .startNow()
					 .build();

				 // Tell quartz to schedule the job using our trigger
				 try {
					 WeatherServiceThreadPool.getPool().getScheduler().scheduleJob(job, trigger);
				 } catch (SchedulerException se) {
					 se.printStackTrace();
				 }

			//TODO : fill this with the necessary business logic
			throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getWeather 12345");
	}

}
