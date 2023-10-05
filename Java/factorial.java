import java.util.*;
public class factorial{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int number,fact=1;
        System.out.println("Enter the number :  ");
        number = sc.nextInt();

        for(int i=number;i>1;i--)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of number is  : "+ fact);

        sc.close();
    }
}