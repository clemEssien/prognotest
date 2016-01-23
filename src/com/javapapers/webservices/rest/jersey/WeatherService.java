package com.javapapers.webservices.rest.jersey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WeatherService {

	WeatherDao weatherDao;

	public WeatherService() {
		weatherDao = WeatherDao.instance;
	}

	public void createWeather(WeatherObservation weatherObservation) {
		weatherDao.getWeather().put(weatherObservation.getLat(), weatherObservation);
	}

	/*public WeatherObservation getWeather(String id) {
		return weatherDao.getWeather().get(id);
	}*/

	public Map<String, WeatherObservation> getWeather() {
		return weatherDao.getWeather();
	}

	public List<WeatherObservation> getWeatherAsList() {
		List<WeatherObservation> weatherList = new ArrayList<WeatherObservation>();
		weatherList.addAll(weatherDao.getWeather().values());
		return weatherList;
	}

	public int getWeatherCount() {
		return weatherDao.getWeather().size();
	}

	public void deleteWeather(String id) {
		weatherDao.getWeather().remove(id);
	}

}
