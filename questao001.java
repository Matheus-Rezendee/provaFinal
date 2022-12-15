package br.edu.univas;

import java.util.Scanner;

public class questao001 {

    public static void main(String args[]){
        int[] vet = new int[25];

        Scanner scan = new Scanner(System.in);
        for (int gavetas = 0; gavetas!= 25;gavetas++){

            vet[gavetas]  = scan.nextInt();


        }

        int aux = 0;
        int i = 0;

        for(i = 0; i<25; i++){
            for(int j = 0; j<24; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 24; i>=0; i--){
            System.out.println(" "+vet[i]);
        }
    }
}



