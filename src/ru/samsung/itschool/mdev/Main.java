package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*  int x = 0;
        int y = 0;
        // y = x
        if(y < x) {
            // точка лежит ниже
        }
        // x = 2
        if(x < 2) {
            // точка лежит левее
        }
        // x^2 + y^2 = 4
        if(x*x + y*y > 4) {
            // точка лежит вне окружности
        }
*/
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if(y <= x && x <= 2 && x*x + y*y <= 4 && x >= 0 && y >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        double pi = Math.PI;
        double sinx = Math.sin(0); //


        int z = 0;
        switch(z) {
            case 1:
            case 2:
                // что-то
                break;
            case 3:
            case 4:
                // что-то
                break;
        }


        // лог. и - &&
        // лог. или - ||\
        // не - !


        int t = 9;

        while(t > 9) {
            // может не выполнится
        }

        do {
            // 1 раз выполнится всегда
        } while(t<9);

        int m;
        if(t == 100) {
            m = 9;
        }

        m=100;

        for(int i=0,j=0;i<100;i++,j++) {

        }

        int[] a = new int[4];
        a[0] = 100;
        // int b[] = new int[10]; - нежелательно

        ArrayList arrayList = new ArrayList(); // 20 элементов
        arrayList.add(1);
        arrayList.add(2);

        int[] g = {5,3,2,10,-1};

        int[] p;
        int f = scan.nextInt(); // 4
        p = new int[f];
        for(int i=0;i<p.length;i++) {
            p[i] = scan.nextInt(); // 6 3 1 12
        }
        for(int i=0;i<p.length;i++) {
            System.out.print(p[i] + " "); // 6 3 1 12
        }
        // foreach
        for(int q: p) {
            System.out.print(q + " "); // 6 3 1 12
        }
        System.out.println(Arrays.toString(p)); // [6,3,1,12]

        int[][] s = new int[3][4];
        s[1][2] = 4;
        for(int i=0;i<s.length;i++) {
            for(int j=0;j<s[i].length;j++){
                s[i][j] = (int)(Math.random()+100);
            }
        }

    }

}
