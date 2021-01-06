package com.example.models;

import com.example.controllers.RandomHelper;

import java.util.ArrayList;

public class Soldier {

    private double life;
    private int id;
    private Gun gun;
    private ArrayList<Soldier> list;


    public Soldier() {
        this.life = 1.00;
        this.id=RandomHelper.nextInt(100);
        list=new ArrayList<>();
        boolean b = RandomHelper.nextBoolean();
        if (b) {
            this.gun = new AssaultRifle();
        } else {
            this.gun = new SniperRifle();
        }
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getLife() {
        return life;
    }

    public int getId() {
        return id;
    }

    public Gun getGun() {
        return gun;
    }
    public void addList(int number){
        for (int i = 0; i <number ; i++) {
            list.add(new Soldier());

        }
    }
    public void showList(){
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
    }
    public ArrayList getList(){
       return new ArrayList<Soldier>(list);
    }

    @Override
    public String toString() {
        return "Soldier{" +

                ", id=" + id +
                ", gun=" + this.getGun() +

                '}';
    }
}