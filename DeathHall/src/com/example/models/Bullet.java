package com.example.models;

public enum Bullet {
    HIGH(7),LOW(5);
    private int caliber;

    Bullet(int caliber) {
        this.caliber = caliber;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }
}
