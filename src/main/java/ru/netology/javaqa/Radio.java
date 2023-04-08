package ru.netology.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        currentStation = station;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int volume) {

        if (volume < 0) {
            return;
        }

        if (volume > 100) {
            return;
        }
        currentVolume = volume;

    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume++;

        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume--;

        }
    }
}