package com.test.www.services.weather.test;

import com.sun.tools.ws.processor.model.java.JavaArrayType;
import com.test.www.services.weather.ws.WeatherService;
import com.test.www.services.weather.ws.stub.*;


import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: kirillgo
 * Date: 03.02.12
 * Time: 7:29
 * To change this template use File | Settings | File Templates.
 */
public class TestMain {
	public static void main(String[] args) {

		WeatherService ws = new WeatherService();

		GetWeatherRequestParams weatherParam = new GetWeatherRequestParams();
		weatherParam.setLocation( "Saint-Petersburg" );
		weatherParam.setProvider( Provider.Gismeteo );

		Date[] dates = new Date[3];
		dates[0] = new Date( System.currentTimeMillis() );
		dates[1] = new Date( System.currentTimeMillis() + 86400000);
		dates[2] = new Date( System.currentTimeMillis() + 86400000 + 86400000);
		Dates_type0 dates0 = new Dates_type0();
		dates0.setDate(dates);
		weatherParam.setDates( dates0 );

		GetWeatherRequestParamsE weatherParamE = new GetWeatherRequestParamsE();
		weatherParamE.setGetWeatherRequestParams(weatherParam);

		try {
			GetWeatherResponseParamsE responseE = ws.getWeather( weatherParamE );
			GetWeatherResponseParams response = responseE.getGetWeatherResponseParams();
			Weather[] weathers = response.getWeather();

			for(int i = 0; i < weathers.length; i++) {
				System.out.println(
						"Location: " +  weathers[i].getLocation()
			       	+ "\n Date: " + weathers[i].getDate().toString()
					+ "\n Weather: " + weathers[i].getWeather() );
			}


		} catch (Exception e) {}


	}
}
