public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;
    private final int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 10;
        maxVolume = 100;
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
        } else if (boardedSoundVolume > maxVolume) {
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
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void decrease() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
