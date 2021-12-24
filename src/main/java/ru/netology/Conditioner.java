package ru.netology;

public class Conditioner {

    public int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature (int newCurrentTemperature) {
        if (newCurrentTemperature < 0) {
            return;
        }
        if (newCurrentTemperature > 30) {
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

}



