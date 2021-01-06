package com.example.controllers;

import com.example.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class Game {
    private int sNumber;
    private Soldier soldier1;
    private Soldier soldier2;
    List<Soldier> redSoldier;
    List<Soldier> whiteSoldier;
    private Gun gun;


    public Game() {
        this.sNumber = 0;
        this.soldier1 = new Soldier();
        this.soldier2 = new Soldier();

    }

    public void getNumber() {

        System.out.println("*Welcome to Death Hall*");
        System.out.println("Please enter the size of Hall");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            sNumber = scanner.nextInt();
            if (sNumber > 1) {
                break;
            } else {
                System.out.println("Please enter a valid Number!!");
            }


        }
          soldier1.addList(sNumber);
         redSoldier=soldier1.getList();
          soldier2.addList(sNumber);
          whiteSoldier=soldier2.getList();

        }



    public void gameIsStarting() {



        for (int i = 0; i < redSoldier.size(); i++) {
            Soldier sR = redSoldier.get(i);

            while (sR.getLife() > 0 && whiteSoldier.size()>0) {
                for (int j = 0; j < whiteSoldier.size(); j++) {
                    Soldier sW = whiteSoldier.get(j);
                    while (sW.getLife() > 0 ) {
                        Boolean b = RandomHelper.nextBoolean();

                        if (b) {

                            Gun gun = sR.getGun();
                            System.out.println("Red-Soldier's shut the Gun ");
                            System.out.println(sR);
                            double cRate = gun.getCollisionRate();
                            double rRate = RandomHelper.nextDouble();
                            double sum = rRate / cRate;
                            if (sum > 0.50) {
                                double dRate = gun.getDamageRate();
                                sW.setLife(sW.getLife() - dRate);
                                System.out.println("Boom!!!!!Hit the Target");
                            } else {
                                System.out.println("Bad luck!!! did not hit the target");
                            }


                        } else {

                            Gun gun = sW.getGun();
                            System.out.println("White-Soldier's shut the Gun ");
                            System.out.println(sW);
                            double cRate = gun.getCollisionRate();
                            double rRate = RandomHelper.nextDouble();
                            double sum = rRate / cRate;
                            if (sum > 0.50) {
                                double dRate = gun.getDamageRate();
                                sR.setLife(sR.getLife() - dRate);
                                System.out.println("Boom!!!!!Hit the Target");
                            } else {
                                System.out.println("Bad luck!!! did not hit the target");
                            }
                        }



                    }

                    whiteSoldier.remove(j);

                }
            }


            redSoldier.remove(i);
        }

        System.out.println("*The End*");
        System.out.println("Red-soldiers : " + redSoldier.size());
        System.out.println("White-soldiers : " + whiteSoldier.size());

    }
}