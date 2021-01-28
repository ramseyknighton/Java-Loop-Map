package com.tts;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Step 1. Asking for an array

        System.out.println("Please give me 5 numbers.One at a time, please.");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int myNum = scan.nextInt();
            myArrayList.add(myNum);
        }

        // Step 2. Finding the Sum.

        int sum = 0;
        for (int num : myArrayList) {
            sum = sum + num;
        }

        System.out.println("Your Sum is: " + sum);

        int firstNum = (myArrayList.isEmpty()) ? 0 : myArrayList.get(0);
        for (int num : myArrayList) {
            if (num < firstNum) {
                firstNum = num;
            }
        }


        // Step 3: Finding the Product.
        int product = 1;
        for (int num: myArrayList) {
            product = product * num;
        }

        System.out.println("Your Product is: " + product);

        //Step 4: Finding the Maximum Number.
        int max = 0;
        for (int num : myArrayList) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Your Maximum Number Is: " + max);


        //Step 5: Finding the Minimum Number.
        int min = Integer.MAX_VALUE;
        for (int num : myArrayList) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Your Minimum Number Is: " + min);


        //HashMaps

        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Kia","Soul");
        myMap.put("Jeep","Wrangler");
        myMap.put("Dodge","Ram");
        myMap.put("Toyota","Camry");
        myMap.put("Buick","LeSabre");
        myMap.put("Pontiac","Grand Prix");


        for (Map.Entry<String,String> entry: myMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }

        System.out.println("Please enter the model of the car you're looking for.");
        String modelString = scan.next();
        if (modelString.equals("kia")) {
            System.out.println(myMap.get("Kia"));
        }  if (modelString.equals("jeep")) {
            System.out.println(myMap.get("Jeep"));
        }  if (modelString.equals("dodge")) {
            System.out.println(myMap.get("Dodge"));
        }  if (modelString.equals("toyota")) {
            System.out.println(myMap.get("Toyota"));
        }  if (modelString.equals("buick")) {
            System.out.println(myMap.get("Buick"));
        }  if (modelString.equals("pontiac")) {
            System.out.println(myMap.get("Pontiac"));
        } else {
            System.out.println("I'm sorry, we don't have what you're looking for. You could try Sears...");
        }
    }
}
