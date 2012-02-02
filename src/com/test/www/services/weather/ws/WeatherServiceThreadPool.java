package com.test.www.services.weather.ws;

import org.omg.CORBA.PolicyListHelper;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 02.02.12
 * Time: 12:38
 * To change this template use File | Settings | File Templates.
 */
public class WeatherServiceThreadPool {
	private static WeatherServiceThreadPool pool = null;
	private Scheduler scheduler;
	private SchedulerFactory sf;

	WeatherServiceThreadPool() {
		try {
			sf = new StdSchedulerFactory();
			scheduler = sf.getScheduler();

		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}

	public static WeatherServiceThreadPool getPool() {
		if( pool == null ) {
			pool = new WeatherServiceThreadPool();
		}
		return pool;
	}

	public Scheduler getScheduler() {
		return scheduler;
	}
}
