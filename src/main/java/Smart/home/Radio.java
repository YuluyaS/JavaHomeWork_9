package Smart.home;

public class Radio {

    private int currentVolume;

    private int minStation = 0;
    private final int maxStation;
    private final int countStations;
    private int currentStation;

    public Radio() {
        this.countStations = 10;
        this.maxStation = countStations - 1;
        this.minStation = minStation;
    }

    public Radio(int countStations) {
        this.countStations = countStations;
        this.maxStation = countStations - 1;
        this.minStation = minStation;
    }

    public int getCountStations() {
        return countStations;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            //return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >= 1) {
            this.currentVolume -= 1;
        } else {
            this.currentVolume = 0;
        }
    }
}