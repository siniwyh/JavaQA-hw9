public class Radio {

    private int numberRadioStations = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public Radio() {

    }

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation > (getNumberRadioStations() - 1)) {
            return;
        }

        currentRadioStation = newRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }

        if (newVolume > 100) {
            return;
        }

        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentRadioStation < (getNumberRadioStations() - 1)) {
            currentRadioStation = getCurrentRadioStation() + 1;

        } else {
            setCurrentRadioStation(0);
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = getCurrentRadioStation() - 1;

        } else {
            setCurrentRadioStation(getNumberRadioStations() - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = getCurrentVolume() + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = getCurrentVolume() - 1;
        }
    }

}
