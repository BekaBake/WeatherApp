package kg.itrun.weatherapp;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CurrentWeatherResponse {
    @SerializedName("data")
    private List<CurrentWeatherItem> data;
    @SerializedName("count")
    private int count;

    public List<CurrentWeatherItem> getData() { //Список или масив который должен вернуть
        return data;
    }

    public int getCount() { //Нужен для проверки данных на их наличие
        return count;
    }
}