package Smart.home;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStations;

    public Radio() {
        this.maxStations =9;
    }
    public Radio(int stationsCount) {
        this.maxStations = stationsCount -1;
    }

    public void next() {
        if (currentStation != maxStations) {
            currentStation++;
            return;
        }
        currentStation = 0;
        }

    public void prev() {
        if (currentStation !=0) {
            currentStation--;
        } else {
            currentStation = maxStations;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStations) {
            return;
        }

        this.currentStation = currentStation;
    }
}

