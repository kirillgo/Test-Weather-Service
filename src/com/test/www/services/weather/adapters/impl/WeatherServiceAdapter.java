package com.test.www.services.weather.adapters.impl;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 03.02.12
 * Time: 10:35
 * To change this template use File | Settings | File Templates.
 */
public interface WeatherServiceAdapter {

	public String[] getWeather(String location, Date[] date);
}
