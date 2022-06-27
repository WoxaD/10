import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio receiver = new Radio();
    Radio vol = new Radio();

    @Test
    public void shouldSetRadioStationAfterConstructor() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStationNumber(15);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetNextRadioStationAboveMaxAfterConstructor() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStationNumber(19);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetPrevRadioStationBelowMinAfterConstructor() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.prev();

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetRadioStation() {

        receiver.setCurrentRadioStationNumber(5);

        Assertions.assertEquals(5, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetSoundVolume() {

        vol.setSoundVolume(5);

        Assertions.assertEquals(5, vol.getSoundVolume());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {

        receiver.setCurrentRadioStationNumber(12);

        Assertions.assertEquals(0, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {

        receiver.setCurrentRadioStationNumber(-3);

        Assertions.assertEquals(0, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetNextRadioStation() {

        receiver.setCurrentRadioStationNumber(4);
        receiver.next();

        Assertions.assertEquals(5, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldSetPrevRadioStation() {

        receiver.setCurrentRadioStationNumber(5);
        receiver.prev();

        Assertions.assertEquals(4, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetNextRadioStationAboveMax() {

        receiver.setCurrentRadioStationNumber(10);
        receiver.next();

        Assertions.assertEquals(0, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetPrevRadioStationBelowMin() {

        receiver.setCurrentRadioStationNumber(0);
        receiver.prev();

        Assertions.assertEquals(10, receiver.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {

        vol.setSoundVolume(12);

        Assertions.assertEquals(0, vol.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {

        vol.setSoundVolume(-3);

        Assertions.assertEquals(0, vol.getSoundVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume() {

        vol.setSoundVolume(4);
        vol.increase();

        Assertions.assertEquals(5, vol.getSoundVolume());
    }

    @Test
    public void shouldDecreaseSoundVolume() {

        vol.setSoundVolume(5);
        vol.decrease();

        Assertions.assertEquals(4, vol.getSoundVolume());
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {

        vol.setSoundVolume(10);
        vol.increase();

        Assertions.assertEquals(0, vol.getSoundVolume());
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowMin() {

        vol.setSoundVolume(0);
        vol.decrease();

        Assertions.assertEquals(10, vol.getSoundVolume());
    }
}
