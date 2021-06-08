package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;

    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
       }
        return currentVolume;

    }

    public int decreaseVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int getCurrentStation(){
        return currentStation;
    }

    public int getMaxStation(){
        return maxStation;
    }

    public int getMinStation(){
        return minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;

        return currentStation;

    }

    public int decreaseStation() {
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }

        return currentStation;
    }
}