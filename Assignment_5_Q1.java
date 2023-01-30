package ITER;
import java.util.Scanner;
public class Assignment_5_Q1 {
    public static void main(String[] args) {
        int sum=0;
        int sum1 =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        for (int i=1;i<=a/2;i++){
            if (a%i==0){
                sum+=i;
            }
        }
        for (int i=1;i<=b/2;i++) {
            if (b % i == 0) {
                sum1 += i;
            }
        }
        if(sum==b && sum1==a){
            System.out.println(a+" and "+b+" are amicable numbers");
        }
        else{
            System.out.println(a+" and "+b+" are not amicable numbers");
        }
    }
}
