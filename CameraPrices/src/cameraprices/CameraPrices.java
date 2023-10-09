/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameraprices;

/**
 *
 * @author lab_services_student
 */
public class CameraPrices {
    public static void main(String[] args) {
        // list of the cameras manufacturers and their camera prices for both DSLR and Mirrorless
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] prices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };

        // Calculate the price difference and find the manufacturer with the greatest difference
        int greatestDifference = Integer.MIN_VALUE;
        String greatestDifferenceManufacturer = "";

        // table header
        System.out.println("Manufacturer\tMirrorless Price\tDSLR Price\tPrice Difference");

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = prices[i][0];
            int dslrPrice = prices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            // Display manufacturer and camera prices
            System.out.print(manufacturer + "\t\t" + mirrorlessPrice + "\t\t" + dslrPrice + "\t\t");

            // Display price difference
            if (priceDifference >= 2500) {
                System.out.print(priceDifference + "\t\t***");
            } else {
                System.out.print(priceDifference);
            }

            System.out.println();

            // Check if this manufacturer has the greatest price difference
            if (priceDifference > greatestDifference) {
                greatestDifference = priceDifference;
                greatestDifferenceManufacturer = manufacturer;
            }
        }

        // Display the manufacturer with the greatest price difference
        System.out.println("\nManufacturer with Greatest Price Difference is: " + greatestDifferenceManufacturer);
    }
}