package com.company;
import javafx.scene.control.Tab;

import java.util.Scanner;

public class Player {

    Tabla t;
    Tabla.Symbol role;

    public Player(Tabla t, Tabla.Symbol role)
    {
        this.t = t;
        this.role = role;
    }



    public void nextMove()
    {
        int a=readValidIndex();
        int b=readValidIndex();
        t.completeaza(a,b,role);
    }
    public static int readValidIndex()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        while(true) {
            a = sc.nextInt();
            if (a >= 0 && a <= 2)
                break;
        }
        return a;
    }
}
