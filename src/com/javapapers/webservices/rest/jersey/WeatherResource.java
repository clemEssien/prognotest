package com.javapapers.webservices.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

public class WeatherResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;

	WeatherService weatherService;

	public WeatherResource(UriInfo uriInfo, Request request) {
		this.uriInfo = uriInfo;
		this.request = request;
		weatherService = new WeatherService();
	}

/*	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public WeatherObservation getWeather() {
		WeatherObservation weather = weatherService.getWeather(id);
		return weather;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public WeatherObservation getWeatherAsHtml() {
		WeatherObservation weatherObservation = weatherService.getWeather(id);
		return weatherObservation;
	}
*/
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putAnimal(JAXBElement<WeatherObservation> weatherElement) {
		WeatherObservation weather = weatherElement.getValue();
		Response response;
		if (weatherService.getWeather().containsKey(weather.getLat())) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		weatherService.createWeather(weather);
		return response;
	}

	@DELETE
	public void deleteWeather() {
		weatherService.deleteWeather(id);
	}

}