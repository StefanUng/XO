package com.company;

import java.util.Random;

public class Main {

    public static boolean isXfirst() {
        Random r = new Random();
        return r.nextBoolean();

    }

    public static void main(String args[]) {

        Tabla t = new Tabla();
        Player p = new Player(t, Tabla.Symbol.SX);
        Player h = new Player(t, Tabla.Symbol.SO);
        boolean xTurn = isXfirst();


        while (t.checkWinningState() == 5) {

            if (xTurn == true) {

                p.nextMove();

            } else h.nextMove();
            t.showTable();
            xTurn=!xTurn;
        }
        if (t.checkWinningState() == 0)
            System.out.println("A castigat O");
        else System.out.println("A castigat X");
    }
}



