
//To find the factorial of a number using recursive function

class Fact
{
//     static int a;
    int factorial(int n){
        if (n==0||n==1)
            return 1;
        return n * factorial(n-1);
    }
    
}

public class FactorialMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fact f1 = new Fact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
                    
        int n = sc.nextInt();
        System.out.printf("The factorial of number %d is %d",n, f1.factorial(n));
        
    }
    
}




// TO print all the prime number within a given range

import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do{
        System.out.println("Enter the starting and ending rangegreater than 1:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        }while(n1<2 | n2<2);
        boolean flag;
        for(int i=n1;i<=n2;i++)
        {
            flag =true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag =false;
                    break;
                }
            }
            if(flag)
                System.out.println(i+"\t");
        }
    }
}
