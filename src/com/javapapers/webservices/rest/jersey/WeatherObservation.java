package com.javapapers.webservices.rest.jersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherObservation {

	//private String id;
	private String elevation;
	private String lng;
	private String observation;
	private String ICAO;
	private String clouds;
	private String dewPoint;
	private String cloudsCode;
	private String datetime;
	private String countryCode;
	private String temperature;
	private String humidity;
	private String stationName;
	private String weatherCondition;
	private String windDirection;
	private String hectoPascAltimeter;
	private String windSpeed;
	private String lat;
	public WeatherObservation(String lat, String lng, String user) {
       this.lat = lat;
       this.lng = lng;
       this.stationName = user;
	}

	public WeatherObservation(
			 String elevation,
			 String lng,
			 String observation,
			 String ICAO,
			 String clouds,
			 String dewPoint,
			 String cloudsCode,
			 String datetime,
			 String countryCode,
			 String temperature,
			 String humidity,
			 String stationName,
			 String weatherCondition,
			 String windDirection,
			 String hectoPascAltimeter,
			 String windSpeed,
			 String lat)
	{
		//ssuper();
		 //this.id = id;
		 this.elevation = elevation;
		 this.lng = lng;
		 this.observation = observation;
		 this.ICAO = ICAO;
		 this.clouds = clouds;
		 this.dewPoint = dewPoint;
		 this.cloudsCode = cloudsCode;
		 this.datetime = datetime;
		 this.countryCode = countryCode;
		 this.temperature = temperature;
		 this.humidity = humidity;
		 this.stationName = stationName;
		 this.weatherCondition = weatherCondition;
		 this.windDirection = windDirection;
		 this.hectoPascAltimeter = hectoPascAltimeter;
		 this.windSpeed = windSpeed;
		 this.lat = lat;

	}


	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getICAO() {
		return ICAO;
	}
	public void setICAO(String ICAO) {
		this.ICAO = ICAO;
	}
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}
	public String getClouds() {
		return clouds;
	}

	public String getdewPoint() {
		return dewPoint;
	}
	public void setdewPoint(String dewPoint) {
		this.dewPoint = dewPoint;
	}
	public String getcloudsCode() {
		return cloudsCode;
	}
	public void setcloudsCode(String cloudsCode) {
		this.cloudsCode = cloudsCode;
	}
	public String getdateTime() {
		return datetime;
	}
	public void setdateTime(String dateTime) {
		this.datetime = dateTime;
	}
	public String getcountryCode() {
		return countryCode;
	}
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getStationName() {
		return stationName;
	}
	public void setstationName(String stationName) {
		this.stationName = stationName;
	}
	public String getWeatherCondition() {
		return weatherCondition;
	}
	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWeatherDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getHectoPascAltimeter() {
		return hectoPascAltimeter;
	}
	public void setHectoPascAltimeter(String hectoPascAltimeter) {
		this.hectoPascAltimeter = hectoPascAltimeter;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
}