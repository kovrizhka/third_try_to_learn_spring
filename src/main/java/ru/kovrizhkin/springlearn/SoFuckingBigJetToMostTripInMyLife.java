package ru.kovrizhkin.springlearn;

public class SoFuckingBigJetToMostTripInMyLife {
    private Voyage voyage;

    public SoFuckingBigJetToMostTripInMyLife(Voyage voyage) {
        this.voyage = voyage;
    }

    public void letsFly() {
        System.out.println("We are flying to: " + voyage.getTrip());
    }
}
