package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator{

    private static final Logger logger = LogManager.getLogger(Calculator.class);



    public Calculator(){
    }

    public double Sqrt(double num){
        logger.info("[SQ ROOT] - " + num);
        double result = Math.sqrt(num);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }

    public double factorial(double num){
        logger.info("[FACTORIAL] - " + num);
        double pdt = 1;
        for(double l=1; l<=num; l++){
            pdt *= l;
        }
        
        logger.info("[RESULT - FACTORIAL] - " + pdt);
        return pdt;
    }

    public double natLog(double num){
        logger.info("[NATURAL LOG] - " + num);
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
        logger.info("[RESULT - NATURAL LOG] - " + result);

        return result;
    }

    public double power(double num, double exponent){
        logger.info("[POWER] - " + num);
        double result = Math.pow(num, exponent);
        logger.info("[RESULT - POWER] - " + result);
        return result;
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