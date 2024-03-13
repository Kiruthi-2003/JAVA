import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        double tax=0;
        if(income<=250000){
            System.out.println("no need to pay tax");
        }
        else if(income>250000&&income<=500000){
            tax=tax+(0.05)*(income-250000);
            System.out.println(tax);
        }
        else if(income>500000&&income<=1000000){
            tax=tax+(0.2)*(income-500000);
            System.out.println(tax);
        }
        else if(income>1000000){
            tax=tax+(0.3)*(income-100000);
            System.out.println(tax);
        }
        
    }
}