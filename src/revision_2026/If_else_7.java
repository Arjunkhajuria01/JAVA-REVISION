package revision_2026;

import java.util.Scanner;
public class If_else_7 {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int a = sc.nextInt();
//    if (a>0){
//        if(a%2 == 0){
//            System.out.println("The number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//
//        if (a>= 50 && a<= 70){
//            System.out.println("The age is working ");
//        }
//        else{
//            System.out.println("The age is not working");
//        }
//        }
//    }
        // Q1 ) Check if a year is leap year
//         Hint:
//        divisible by 4
//        but not by 100
//        unless divisible by 400

        if (a%4 == 0 && a%100 != 0  ){
            if(a%400 == 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap Year");
            }
        }
    }
}

