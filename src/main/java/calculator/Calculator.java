package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator{

    private static final Logger logger= LogManager.getLogger(Calculator.class);



    public Calculator(){
    }

    public double Sqrt(double num){
        logger.info("[square root] - " + num);
        double resSqrt = Math.sqrt(num);
        logger.info("[result of square root] - " + resSqrt);
        return resSqrt;
    }

    public double factorial(double num){
        logger.info("[factorial] - " + num);
        double pdt = 1;
        for(double l=1; l<=num; l++){
            pdt *= l;
        }
        
        logger.info("[result of factorial] - " + pdt);
        return pdt;
    }

    public double natLog(double num){
        logger.info("[natural log] - " + num);
        double natlog = 0;

        if(num<0){
            natlog = Double.NaN;
            System.out.println("natural logarithm is undefined for negative numbers");
        }
        else {
            natlog = Math.log(num);
        }

        logger.info("[result of natural log] - " + natlog);

        return natlog;
    }

    public double power(double num, double exponentNum){
        logger.info("[power] - " + num);
        double resPower = Math.pow(num, exponentNum);
        logger.info("[result of power] - " + resPower);
        return resPower;
    }


    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;
        while(true){
            int choice;
            System.out.println("Calculator program starting...\n Type your choice of operation\n" +  
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
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("square root of " + num1 + " = " + calculator.Sqrt(num1));
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("factorial of " + num1 + " = " + calculator.factorial(num1));
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("natural logarithm of " + num1 + " = " + calculator.natLog(num1));
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("Enter first number base number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter second number (power): ");
                    num2 = sc.nextDouble();
                    System.out.println(num1 + " raised to the power of " + num2 + " = " + calculator.power(num1, num2));
                    System.out.println("\n");
                    break;
                
                default:
                    System.out.println("Program stopping...\n");
                    return;
            }
        }

        return;
    }
}