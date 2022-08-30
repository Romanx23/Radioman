package ru.netology.radio;

public class Radio {
    int volume;
    int radioStation;
    private int maxVolume = 10;
    private int maxRadioStation = 9;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void nextRadioStation() {

        if (radioStation < maxRadioStation) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prevRadioStation() {

        if (radioStation > 0) {
            radioStation--;
        } else {
            radioStation = maxRadioStation;
        }
    }

}