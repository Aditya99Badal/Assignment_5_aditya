package ITER;
import java.util.Scanner;
public class Assignment_5_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        int  reverse = 0;
//we have not mentioned the initialization part of the for loop
        for(int i=  a;i != 0; i=i/10)
        {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }
        int count=0;
        for (int i=2;i<=a/2;i++){
            if(a%i==0){
                count++;
            }
        }

        for (int i=2;i<=reverse/2;i++){
            if(reverse%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(a+" is a twisted prime");
        }
        else{
            System.out.println(a+" is not a twisteed prime");
        }

    }
}
