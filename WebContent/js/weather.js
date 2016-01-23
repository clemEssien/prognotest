try	
{
	
  
	$(function()
	 {
		 
		init();
    	}
	);
	} 
catch (e)
{
	alert("*** jQuery not loaded. ***");
}
function init()
{	
	
	$('#lat').val(localStorage.latitude) ;
	$('#lng').val(localStorage.longitude) ;
	$('#username').val(localStorage.username) ;
	
	console.log(localStorage.name);
  $("#spinner").hide();
  
   $("#check").click
   (function()
   {
	   $("#spinner").show();
		localStorage.latitude = $('#lat').val();
		localStorage.longitude = $('#lng').val();
		localStorage.username = $('#username').val();
			
	   $.ajax({
			  url: "http://api.geonames.org/findNearByWeatherJSON",
			  data: {
			    lat: $('#lat').val(),
			    lng:$('#lng').val(),
			    username:$('#username').val()
			  },
			  success: function( data ) {
				  
				  $("#spinner").hide();
				$("#myTable").css({"border": "1px solid #336699"});
				
			    $( "#caption" ).html( "<strong>Weather Information</strong>" );
			    $("#tableBody").html("<tr><th>Elevation</th><th>Longitude</th><th>Latitude</th><th>Observation</th><th>Dew point</th>" +
			    	                  "<th>Cloud Code</th><th>Datetime</th><th>Country code</th><th>Temperature</th><th>Humidity</th><th>Station Name</th>+" +
			    	                  "<th>Wind speed</th></tr>"+  


			    	             	 "<tr><td>"+data.weatherObservation.elevation+"</td><td>"+parseFloat(data.weatherObservation.lng).toFixed(2)+"</td><td>"+parseFloat(data.weatherObservation.lat).toFixed(2)+"</td><td>"+data.weatherObservation.observation+"</td><td>"+data.weatherObservation.dewPoint+"</td>" +
			    	             			    	                  "<td>"+data.weatherObservation.cloudsCode+"</td><td>"+data.weatherObservation.datetime+"</td><td>"+data.weatherObservation.countryCode +"</td><td>"+data.weatherObservation.temperature+"</td><td>"+data.weatherObservation.humidity+"</td><td>"+data.weatherObservation.stationName+"</td>"+
			    	             			    	                  "<td>"+data.weatherObservation.windSpeed+"</td></tr>"
			    	             			    		       
			    	                  );
				 
			  }
			});

   });
   
   $("#lat").keydown(function (e) {
       if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
           (e.keyCode == 65 && ( e.ctrlKey === true || e.metaKey === true ) ) || 
           (e.keyCode >= 35 && e.keyCode <= 40)) {
                return;
       }
       if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
           e.preventDefault();
       }
   });
   
   $("#lng").keydown(function (e) {
      
       if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
        
           (e.keyCode == 65 && ( e.ctrlKey === true || e.metaKey === true ) ) || 
            
           (e.keyCode >= 35 && e.keyCode <= 40)) {
          
                return;
       }
       
       if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
           e.preventDefault();
       }
   });
}