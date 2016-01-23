package com.javapapers.webservices.rest.jersey;

import java.util.HashMap;
import java.util.Map;

public enum WeatherDao {
	instance;

	private Map<String, WeatherObservation> weatherMap = new HashMap<String, WeatherObservation>();

	private WeatherDao() {

		//pumping-in some default data
		WeatherObservation weather = new WeatherObservation("342", "7.266666666666667", 
				"DNAA 121200Z 13004KT 080V220 CAVOK 35/M01 Q1012 NOSIG",
				"DNA", "cloud OK","0", "CAOK","20160114","NG","25","10","LAGOS","n/a","130",
				"1012","03","7");
		weatherMap.put("1", weather);
		
		
	

	}

	public Map<String, WeatherObservation> getWeather() {
		return weatherMap;
	}

}
