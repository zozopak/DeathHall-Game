package com.example.models;

import com.example.controllers.RandomHelper;

public class AssaultRifle implements Gun {
    private final String type="assaultRifle";
    private  double collisionRate;
    private  double damageRate;
    private Bullet bullet;

    public AssaultRifle ( ) {

        boolean b= RandomHelper.nextBoolean();
       if(b) {
          this.bullet = Bullet.HIGH;
           this.collisionRate = 0.40;
           this.damageRate = 0.20;
       }else{
           this.bullet=Bullet.LOW;
           this.collisionRate = 0.65;
           this.damageRate = 0.10;
       }


    }

    public String getType() {
        return type;
    }
    @Override
    public double getCollisionRate() {
        return collisionRate;
    }




    @Override
    public double getDamageRate() {
        return damageRate;
    }



    public Bullet getBullet() {
        return bullet;
    }



    @Override
    public boolean getZoom() {
        return false;
    }
}
