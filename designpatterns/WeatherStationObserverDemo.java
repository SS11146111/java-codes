package com.sangita.designpatterns;

import java.util.*;

interface Observer {
    void update(float temp);
}

class Display implements Observer {
    public void update(float temp) {
        System.out.println("Updated temperature: " + temp);
    }
}

class WeatherStationObserverDemo {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer o) { observers.add(o); }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}

