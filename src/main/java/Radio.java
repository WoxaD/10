public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int borderedCurrentRadioStationNumber) {
        if (borderedCurrentRadioStationNumber < 0) {
            return;
        }
        if (borderedCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = borderedCurrentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int boardedSoundVolume) {
        if (boardedSoundVolume < 0) {
            soundVolume = 0;
        } else if (boardedSoundVolume > 10) {
            soundVolume = 0;
        } else soundVolume = boardedSoundVolume;
    }

    public void next() {
        if (currentRadioStationNumber < maxStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxStation;
        }
    }

    public void increase() {
        if (soundVolume < 10) {
            soundVolume++;
        } else {
            soundVolume = 0;
        }
    }

    public void decrease() {
        if (soundVolume > 0) {
            soundVolume--;
        } else {
            soundVolume = 10;
        }
    }
}
