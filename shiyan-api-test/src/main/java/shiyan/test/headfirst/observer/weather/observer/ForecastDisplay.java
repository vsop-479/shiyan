package shiyan.test.headfirst.observer.weather.observer;

import shiyan.test.headfirst.observer.weather.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/11/11.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;


    public ForecastDisplay(Observable o){
        this.observable = o;
        o.addObserver(this);
    }

    public ForecastDisplay(){}

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: temperature= " + temperature + " and humidity=" + humidity);
    }
}
