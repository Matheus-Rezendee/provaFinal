package br.edu.univas;

import java.util.Scanner;

public class questao002 {

    public static int x = 99;

    public static String printName(int x , String array []){
        if (x == 0){
            System.out.println(array[0]);
            return null;
        }

        System.out.println(array[x]);
        x --;
        return printName(x,array);
    }






    public static void main(String[] args) {

        String[] nomes = new String[100];
        Scanner scan = new Scanner(System.in);

        for (int gavetas = 0;gavetas!=100;gavetas++){

            nomes[gavetas] = scan.nextLine();

        }

        printName(x  ,nomes);

    }
}












