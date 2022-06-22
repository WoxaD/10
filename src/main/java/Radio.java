public class Radio {
    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int borderedCurrentRadioStationNumber) {
        if (borderedCurrentRadioStationNumber < 0) {
            currentRadioStationNumber = 0;
        } else if (borderedCurrentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else currentRadioStationNumber = borderedCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber < 9) {
            currentRadioStationNumber += 1;
        } else currentRadioStationNumber = 0;
    }

    public void prev() {
        if (currentRadioStationNumber > 0 && currentRadioStationNumber <= 9) {
            currentRadioStationNumber -= 1;
        } else currentRadioStationNumber = 9;
    }

    public int soundVolume;

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

    public void increase() {
        if (soundVolume >= 0 && soundVolume < 10) {
            soundVolume += 1;
        } else soundVolume = 0;
    }

    public void decrease() {
        if (soundVolume > 0 && soundVolume <= 10) {
            soundVolume -= 1;
        } else soundVolume = 10;
    }
}
