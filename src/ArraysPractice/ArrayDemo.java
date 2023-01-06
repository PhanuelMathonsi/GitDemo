package ArraysPractice;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        double generatedPrice,tenPercent;
        double[] price = new double[10];

        for (int i = 0; i < price.length; i++) {
            generatedPrice = 10;
            price [i]= generatedPrice;
            System.out.println(price[i]);
        }

        for(int i= 0; i<price.length;i++){
            tenPercent = price[i] +(price[i]*0.1);
            System.out.println("Original amount= "+price[i]+"\nTen percent(10%) Increase= "+tenPercent);
        }
    }
}
