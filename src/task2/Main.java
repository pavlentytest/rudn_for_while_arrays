package task2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[][] s = new int[3][4];
        s[1][2] = 4;


        Random rand = new Random();

        for(int i=0;i<s.length;i++) {
            for(int j=0;j<s[i].length;j++){
                //s[i][j] = (int)(Math.random()*100);
                s[i][j] = rand.nextInt(1000);
            }
        }

        for(int i=0;i<s.length;i++) {
            for(int j=0;j<s[i].length;j++){
                System.out.print(s[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
