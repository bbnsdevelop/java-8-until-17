package br.com.bbnsdevelop.v2_examples.adapter.weather;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		WeatherAdapter finder = new WeatherAdapter();
		int temperature = finder.findTemperature(zipcode);
		System.out.println("The temperature is: " + temperature);
	}
}
