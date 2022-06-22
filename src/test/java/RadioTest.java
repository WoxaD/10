import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio vol = new Radio();

        vol.setSoundVolume(5);

        int expected = 5;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(12);

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(-3);

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(4);
        receiver.next();

        int expected = 5;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(5);
        receiver.prev();

        int expected = 4;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextRadioStationAboveMax() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(9);
        receiver.next();

        int expected = 0;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevRadioStationBelowMin() {
        Radio receiver = new Radio();

        receiver.setCurrentRadioStationNumber(0);
        receiver.prev();

        int expected = 9;
        int actual = receiver.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setSoundVolume(12);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setSoundVolume(-3);

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        Radio vol = new Radio();

        vol.setSoundVolume(4);
        vol.increase();

        int expected = 5;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio vol = new Radio();

        vol.setSoundVolume(5);
        vol.decrease();

        int expected = 4;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setSoundVolume(10);
        vol.increase();

        int expected = 0;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSDecreaseSoundVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setSoundVolume(0);
        vol.decrease();

        int expected = 10;
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
