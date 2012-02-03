package com.test.www.services.weather.adapters.impl;

/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 03.02.12
 * Time: 10:35
 * To change this template use File | Settings | File Templates.
 */
public interface WeatherServiceAdapter {

	public String[] getWeather(String location, java.util.Date[] date)
			throws ProviderInternalErrorFaultException,
					UnknownLocationFaultException,
					ProviderNotAvailableFaultException;
}

class ProviderInternalErrorFaultException extends Exception {
}

class UnknownLocationFaultException extends Exception {
}

class ProviderNotAvailableFaultException extends Exception {
}
