package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void louder() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void quiet() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            return;
        }
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0)
            return;
        if (currentStation > 9)
            return;
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0)
            return;
        if (currentVolume > 100)
            return;
        this.currentVolume = currentVolume;
    }
}
