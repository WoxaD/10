import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(15);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(50);

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-2);

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStationNumber(5);
        radio.next();

        Assertions.assertEquals(6, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStationNumber(5);
        radio.prev();

        Assertions.assertEquals(4, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetNextRadioStationAboveMax() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStationNumber(19);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetPrevRadioStationBelowMin() {

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetSoundVolume() {

        radio.setSoundVolume(5);

        Assertions.assertEquals(5, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {

        radio.setSoundVolume(120);

        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {

        radio.setSoundVolume(-10);

        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume() {

        radio.setSoundVolume(10);
        radio.increase();

        Assertions.assertEquals(11, radio.getSoundVolume());
    }

    @Test
    public void shouldDecreaseSoundVolume() {

        radio.setSoundVolume(10);
        radio.decrease();

        Assertions.assertEquals(9, radio.getSoundVolume());
    }


    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {

        radio.setSoundVolume(100);
        radio.increase();

        Assertions.assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowMin() {

        radio.setSoundVolume(0);
        radio.decrease();

        Assertions.assertEquals(0, radio.getSoundVolume());
    }
}
