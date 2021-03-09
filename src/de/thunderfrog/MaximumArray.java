package de.thunderfrog;

import java.util.Arrays;

public class MaximumArray {

    public static void main(String[] args) {
        int[] arrayRandom = new int[10];

        int maxRandom = 100;
        int minRandom = 1;
        int rangeRandom = maxRandom - minRandom + 1;

        int maxOrt = 0;

        // Zufallszahlen
        for(int i = 0; i < arrayRandom.length; i++){
            int random = (int) (Math.random() * rangeRandom) + minRandom;
            arrayRandom[i] = random;
        }
        System.out.println("Zahlen: " + Arrays.toString(arrayRandom));

        // Maximum finden
        for(int i = 0; i < arrayRandom.length; i++){
            if(arrayRandom[i] > maxOrt){
                maxOrt = arrayRandom[i];
            }
        }
        System.out.println("Größte Zahl ist: " + maxOrt);



    }




}
