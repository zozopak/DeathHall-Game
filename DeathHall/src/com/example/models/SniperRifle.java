package com.example.models;

import com.example.controllers.RandomHelper;

public class SniperRifle implements Gun {
    private boolean zoom;
    private final String type = "sniperRifle";
    private double collisionRate;
    private double damageRate;
    private Bullet bullet;


    public SniperRifle() {
        this.zoom=RandomHelper.nextBoolean();
        boolean b = RandomHelper.nextBoolean();

        if (b) {
            this.bullet = Bullet.HIGH;
            this.collisionRate = 0.50;
            this.damageRate = 0.30;
        } else {
            this.bullet = Bullet.LOW;
            this.collisionRate = 0.75;
            this.damageRate = 0.20;
        }
        if(zoom){
            double d = (Math.random() * (15 - 5) + 5);
            this.collisionRate = collisionRate+ d;

        }


    }

    public String getType() {
        return type;
    }

    public double getCollisionRate() {
        return collisionRate;
    }



    public double getDamageRate() {
        return damageRate;
    }



    public Bullet getBullet() {
        return bullet;
    }



    @Override
    public boolean getZoom() {
        return zoom;
    }

}




