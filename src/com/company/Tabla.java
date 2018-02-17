package com.company;

import java.util.Random;

public class Tabla {


    public static enum Symbol {SX, SO, S_}

    public static final String RED = "\033[0;91m";
    public static final String BLUE = "\033[0;34m";
    public static final String RESET = "\033[0;0m";
    private Symbol[][] t;


    public Tabla() {
        t = new Symbol[3][3];
        init();

    }

    void init() {
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 3; ++j)
                t[i][j] = Symbol.S_;

    }

    void showTable() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j)
                switch (t[i][j]) {
                    case SX:
                        System.out.print(RED + 'x' + RESET);
                        break;
                    case SO:
                        System.out.print(BLUE + '0' + RESET);
                        break;
                    default:
                        System.out.print('_' + " ");
                        break;
                }
            System.out.println();
        }

    }


    public boolean isDraw() {
        return t[0][0] != Symbol.S_ && t[0][1] != Symbol.S_ && t[0][2] != Symbol.S_ &&
                t[1][0] != Symbol.S_ && t[1][1] != Symbol.S_ && t[1][2] != Symbol.S_ &&
                t[2][0] != Symbol.S_ && t[2][1] != Symbol.S_ && t[2][2] != Symbol.S_;
    }

    public int checkWinningState() {
        if (t[0][0] == Symbol.SO && t[0][1] == Symbol.SO && t[0][2] == Symbol.SO ||
                t[1][0] == Symbol.SO && t[1][1] == Symbol.SO && t[1][2] == Symbol.SO ||
                t[2][0] == Symbol.SO && t[2][1] == Symbol.SO && t[2][2] == Symbol.SO ||
                t[0][0] == Symbol.SO && t[1][0] == Symbol.SO && t[2][0] == Symbol.SO ||
                t[0][1] == Symbol.SO && t[1][1] == Symbol.SO && t[2][1] == Symbol.SO ||
                t[0][2] == Symbol.SO && t[1][2] == Symbol.SO && t[2][2] == Symbol.SO ||
                t[0][0] == Symbol.SO && t[1][1] == Symbol.SO && t[2][2] == Symbol.SO ||
                t[0][2] == Symbol.SO && t[1][1] == Symbol.SO && t[2][0] == Symbol.SO) {
            return 0;
        }

        if (t[0][0] == Symbol.SX && t[0][1] == Symbol.SX && t[0][2] == Symbol.SX ||
                t[1][0] == Symbol.SX && t[1][1] == Symbol.SX && t[1][2] == Symbol.SX ||
                t[2][0] == Symbol.SX && t[2][1] == Symbol.SX && t[2][2] == Symbol.SX ||
                t[0][0] == Symbol.SX && t[1][0] == Symbol.SX && t[2][0] == Symbol.SX ||
                t[0][1] == Symbol.SX && t[1][1] == Symbol.SX && t[2][1] == Symbol.SX ||
                t[0][2] == Symbol.SX && t[1][2] == Symbol.SX && t[2][2] == Symbol.SX ||
                t[0][0] == Symbol.SX && t[1][1] == Symbol.SX && t[2][2] == Symbol.SX ||
                t[0][2] == Symbol.SX && t[1][1] == Symbol.SX && t[2][0] == Symbol.SX) {
            return 1;
        }
        return 5;
    }
    public void completeaza(int a, int b, Symbol role) {
        t[a][b]=role;
    }
}
