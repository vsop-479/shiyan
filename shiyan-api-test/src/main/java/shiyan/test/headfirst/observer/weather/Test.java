package shiyan.test.headfirst.observer.weather;

import shiyan.test.headfirst.observer.weather.observable.WeatherData;
import shiyan.test.headfirst.observer.weather.observer.CurrentConditionDisplay;
import shiyan.test.headfirst.observer.weather.observer.ForecastDisplay;
import shiyan.test.headfirst.observer.weather.observer.StatisticsDisplay;

/**
 * Created by Administrator on 2016/11/11.
 */
public class Test {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(25.0f, 60.3f, 10.3f);
//注册观察者
        new StatisticsDisplay(weatherData);
//        注册观察者
        weatherData.addObserver(new ForecastDisplay());
        weatherData.setMeasurements(27.0f, 56.3f, 17.3f);
    }
}
