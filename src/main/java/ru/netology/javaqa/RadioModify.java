package ru.netology.javaqa;

public class RadioModify {
    private int stationQuantity = 10;
    private int currentStation;
    private int currentVolume;

    public RadioModify() {
    }

    public RadioModify(int stationQuantity) {
        this.stationQuantity = stationQuantity;
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public int getStationQuantity() {

        return stationQuantity;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < stationQuantity) {
            this.currentStation = station;
        }
    }

    public void nextStation() {
        if (currentStation == stationQuantity - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationQuantity - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int volume) {

        if (volume < 0 || volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}