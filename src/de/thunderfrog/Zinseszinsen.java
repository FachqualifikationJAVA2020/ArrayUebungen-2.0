package de.thunderfrog;

public class Zinseszinsen {
    public static void main(String[] args) {

        // Größe 11 weil 1x Startwert und dann 10 Jahre
        double[] guthaben = new double[11];
        // Start Guthaben
        guthaben[0] = 20000;
        System.out.println("Start Guthaben: " + guthaben[0]);

        for(int i = 1; i < guthaben.length; i++){
            // Rechnung: Guthaben = Guthaben aktuelles Jahr * 1.03
            guthaben[i] = guthaben[i - 1] * 1.03;
            System.out.println("Guthaben nach " + i + " Jahren: " + guthaben[i]);
        }
    }
}
