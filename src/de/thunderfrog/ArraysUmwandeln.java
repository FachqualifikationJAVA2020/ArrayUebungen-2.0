package de.thunderfrog;

import java.util.Arrays;

public class ArraysUmwandeln {

    public static void main(String[] args) {
        int[] ganzZahl = {1,2,3,4,5,6,7,8,9,10};
        float[] kommaZahl = new float[10];

        System.out.println(Arrays.toString(ganzZahl));

        for(int i = 0; i < ganzZahl.length; i++){
            kommaZahl[i] = ganzZahl[i];
        }

        System.out.println(Arrays.toString(kommaZahl));

    }
}
