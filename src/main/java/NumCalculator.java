import java.text.DecimalFormat;
import java.util.Scanner;

public class NumCalculator {


    public double add(double first, double second){

        return first + second;

    }
    public double multiply(double first, double second){

        return first * second;

    } public double subtract(double first, double second){

        return first - second;

    }
    public double divide(double first, double second){

        return first / second;

    }

    public static void main(String[] args){

        NumCalculator calc = new NumCalculator();
        //DecimalFormat dc=new DecimalFormat();
        //df.setMaximumFractionDigits(2);

        char operator;
        double firstNumber;
        double secondNumber;
        double result;
        //creating an object of scanner class
        Scanner scan = new Scanner(System.in);
        /*
        Ask for input here
        System.out.println("Please Enter Symbol \" + \" for ADDITION, ");
        System.out.println("Please Enter Symbol \" - \" for SUBTRACTION,");
        System.out.println("Please Enter Symbol \" * \" for MULTIPLICATION,");
        System.out.println("Please Enter Symbol \" / \" for DIVISION");
        */

        System.out.println("Enter first Number! ");
        firstNumber = scan.nextInt();
        System.out.println("Enter second Number! ");
        secondNumber = scan.nextInt();
        System.out.println("Enter an Operator! ");
        operator = scan.next().charAt(0);
        if(operator != '+'&& operator != '-'&&operator != '*'&&operator != '/')

        {
            System.out.println("Oops! That symbol is invalid! please try again");
            System.exit(0);}


        if(operator=='/' && secondNumber==0) {
            System.out.println("Division by Zero Exception, enter a non zero number");
            System.exit(0);
        }

        switch(operator) {
            case '+':
                result = (double) calc.add(firstNumber, secondNumber);//firstNumber + secondNumber;
                System.out.println(firstNumber + " + "+secondNumber+ " = " +result);
                break;
            case '-':
                result = (double) calc.subtract(firstNumber, secondNumber);//firstNumber - secondNumber;
                System.out.println(firstNumber + " - "+secondNumber+ " = " +result);
                break;
            case '*':
                result = (double) calc.multiply(firstNumber, secondNumber);//
                System.out.println(firstNumber + " * "+secondNumber+ " = " +result);
                break;
            case '/':
                result = (double) calc.divide(firstNumber, secondNumber);
                System.out.println(firstNumber + " / "+secondNumber+ " = " +result);
                break;
        }
                //System.out.println(firstNumber+" "+ operator+ " "+ secondNumber+ " "+ result);




        }


    }

