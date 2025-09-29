package com.test;

public abstract class Cricket implements ICricket {
    private String batsman;
    private String stadium;
    private int runsScored;

    // Constructor
    public Cricket(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    // Implement interface methods
    @Override
    public String getBatsman() {
        return batsman;
    }

    @Override
    public String getStadium() {
        return stadium;
    }

    @Override
    public int getRunsScored() {
        return runsScored;
    }
}
