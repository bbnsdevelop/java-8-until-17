package br.com.bbnsdevelop.v2_examples.adapter.weather;

public class WeatherAdapter {
	
	public int findTemperature(int zipcode) {
		String city = findCityByzipCode( zipcode);		
		
		IWeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city);
	}
	
	
	private String findCityByzipCode(int zipcode) {
		
		String city = null;
		
		if(zipcode == 17891) {
			city = "São Paulo";
		}else if(zipcode == 17021) {
			city = "Rio";	
		}
		return city;
		
	}

}
