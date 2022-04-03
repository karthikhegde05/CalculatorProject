package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator{
    public Calculator(){
    }

    public double Sqrt(double num){
        return Math.sqrt(num);
    }

    public double factorial(double num){
        double pdt = 1;
        for(double l=1; l<=num; l++){
            pdt *= l;
        }
        
        return pdt;
    }

    public double natLog(double num){
        double result = 0;
        try {
            if(num<0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else{
                result = Math.log(num);
            }
        }catch(ArithmeticException error){
            System.out.println("[EXCEPTION LOG] - Cannot find  log of negative numbers " + error.getLocalizedMessage());
        }

        return result;
    }

    public double power(double num, double exponent){
        return Math.pow(num, exponent);
    }


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;
        do{
            int choice;
            System.out.println("Welcome to Calculator interface...\n Type your choice of operation\n" +  
            "Press 1 for finding square root\nPress 2 for finding factorial\nPress 3 for finding natural logarithm\n"
            + "Press 4 for finding power of a base raised to given exponent\n");
            

            try{
                choice = sc.nextInt();

            }catch(InputMismatchException error){
                System.out.println("Error in input");
                break;
            }

            
            switch(choice){
                case 1:
                    // square root
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Square root of " + num1 + " = " + calculator.Sqrt(num1));
                    System.out.println("\n");
                    break;

                case 2:
                    // factorial
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Factorial of " + num1 + " = " + calculator.factorial(num1));
                    System.out.println("\n");
                    break;

                case 3:
                    // natural log
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Natural logarithm of " + num1 + " = " + calculator.natLog(num1));
                    System.out.println("\n");
                    break;

                case 4:
                    // power
                    System.out.println("Enter first number (base number): ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second number (power): ");
                    num2 = sc.nextDouble();
                    System.out.println(num1 + " raised to the power of " + num2 + " = " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                
                default:
                    System.out.println("Exiting...\n");
                    return;
            }
        }while(true);

        return;
    }
}