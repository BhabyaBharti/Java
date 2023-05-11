
//Question 1

import java.util.Scanner;
public class ASSIGNMENT4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();

        if(l==b){
            System.out.println("It is square.");
        }else{
            System.out.println("It is a rectangle.");
        }
    }
}
