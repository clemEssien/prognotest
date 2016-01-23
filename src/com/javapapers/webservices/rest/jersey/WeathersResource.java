package com.javapapers.webservices.rest.jersey;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/weather")
public class WeathersResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	WeatherService weatherService;

	public WeathersResource() {
		weatherService = new WeatherService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<WeatherObservation> getWeather() {
		return weatherService.getWeatherAsList();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<WeatherObservation> getWeatherAsHtml() {
		return weatherService.getWeatherAsList();
	}

	// URI: /rest/weather/count
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		return String.valueOf(weatherService.getWeatherCount());
	}

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createWeather(@FormParam("lat") String lat,
			@FormParam("lng") String lng,
			@FormParam("username") String username,
			@Context HttpServletResponse servletResponse) throws IOException {
		WeatherObservation weather = new WeatherObservation(lat, lng, username);
		weatherService.createWeather(weather);
		servletResponse.sendRedirect("./weather/");
	}

	/*@Path("{weather}")
	public WeatherResource getWeather(@PathParam("weather") String id) {
		return new WeatherResource(uriInfo, request, id);
	}*/

}