public class Radio {

    public int currentRadioStation;
    public int currentVolume;



    public void nextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;

        }
        else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;

        }
        else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation > 9) {
            return;
        }

        currentRadioStation = newRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

}
