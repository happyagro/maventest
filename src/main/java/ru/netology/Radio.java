package ru.netology;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
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

    public void nextCurrentStation(int currentStation) {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevCurrentStation(int currentStation) {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void remoteCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        } else
        if (currentStation < minStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation;
        }
    }
}
