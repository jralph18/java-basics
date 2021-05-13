package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        loops();
        maps();
    }

    static void maps() {
        HashMap<String, List<String>> dealership = new HashMap<>(){{
            put("Honda", new ArrayList<String>(List.of("Civic", "Accord", "Fit", "CRV")));
            put("Toyota", new ArrayList<String>(List.of("Corolla", "Camry", "Highlander", "Tacoma")));
            put("Ford", new ArrayList<String>(List.of("Focus", "Fusion", "Mustang", "F150")));
            put("Volkswagen", new ArrayList<String>(List.of("Golf", "Jetta", "GTI", "Tiguan")));
        }};

        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to our dealership!");
        System.out.print("What make of car are you looking for today? ");
        String make = input.next();

        if(dealership.containsKey(make)){
            System.out.printf("Ah yes! A %s! We have those right over here...", make);
            System.out.printf("As far as %ss go we have ", make);
            ArrayList<String> models = (ArrayList<String>) dealership.get(make);
            for (int i=0;i<models.size();i++){
                if(i<models.size()-1){
                    System.out.print(models.get(i) + "s, ");
                }else {
                    System.out.print("and " + models.get(i) + "s.");
                }
            }
        }
    }

    static void loops(){
        ArrayList<Integer> numbers = createList();
        System.out.println("Your numbers were: " + numbers);

        int[] sumProd = getSumAndProd(numbers);
        System.out.println("Sum: " + sumProd[0]);
        System.out.println("Product: " + sumProd[1]);

        int[] maxMin = getMaxAndMin(numbers);
        System.out.println("Max: " + maxMin[0]);
        System.out.println("Min: " + maxMin[1]);
    }

    static ArrayList createList() {
        ArrayList <Integer> numList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers would you like to enter? ");
        int count = input.nextInt();
//        int num;
        while(numList.size() < count) {
            System.out.print("Enter a number: ");
//            num = input.nextInt();
            numList.add(input.nextInt());
        }
        return numList;
    }

    static int[] getSumAndProd(ArrayList<Integer> numbers){
        int sum = 0;
        int prod = 1;
        for(Integer num : numbers){
            sum += num;
            prod *= num;
        }
        return new int[]{sum, prod};
    }

    static int[] getMaxAndMin(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        int min = numbers.get(0);
        for(int i=1;i < numbers.size();i++){
            if(numbers.get(i) > max) max = numbers.get(i);
            if(numbers.get(i) < min) min = numbers.get(i);
        }
        return new int[]{max, min};
    }
}
