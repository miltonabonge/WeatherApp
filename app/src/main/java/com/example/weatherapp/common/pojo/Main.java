package com.example.weatherapp.common.pojo;

import com.google.gson.annotations.SerializedName;

public class Main{

	@SerializedName("temp")
	private double temp;

	@SerializedName("temp_min")
	private double tempMin;

	@SerializedName("humidity")
	private int humidity;

	@SerializedName("pressure")
	private int pressure;

	@SerializedName("temp_max")
	private int tempMax;

	public double getTemp(){
		return temp;
	}

	public double getTempMin(){
		return tempMin;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressure(){
		return pressure;
	}

	public int getTempMax(){
		return tempMax;
	}

	@Override
 	public String toString(){
		return 
			"Main{" + 
			"temp = '" + temp + '\'' + 
			",temp_min = '" + tempMin + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",temp_max = '" + tempMax + '\'' + 
			"}";
		}
}