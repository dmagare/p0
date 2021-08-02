import java.util.Scanner;

public class NumCalculator {


    public int add(int first, int second){

        return first + second;

    }
    public int multiply(int first, int second){

        return first * second;

    } public int subtract(int first, int second){

        return first - second;

    }
    public int divide(int first, int second){

        return first / second;

    }

    public static void main(String[] args){

        NumCalculator calc = new NumCalculator();

        char operator;
        int firstNumber;
        int secondNumber;
        int result;
        //creating an object of scanner class
        Scanner scan = new Scanner(System.in);
        //Ask for input here
        System.out.println("Please Enter Symbol \" + \" for ADDITION, ");
        System.out.println("Please Enter Symbol \" - \" for SUBTRACTION,");
        System.out.println("Please Enter Symbol \" * \" for MULTIPLICATION,");
        System.out.println("Please Enter Symbol \" / \" for DIVISION");

        operator = scan.next().charAt(0);
        if(operator != '+'&& operator != '-'&&operator != '*'&&operator != '/')

        {
            System.out.println("Oops! That symbol is invalid! please try again");
            System.exit(0);}

        //ask for the first number to calculate
        System.out.println("Enter first Number!");
        firstNumber = scan.nextInt();
        System.out.println("Enter second Number!");
        secondNumber = scan.nextInt();

        if(operator=='/' && secondNumber==0) {
            System.out.println("Division by Zero Exception, enter a non zero number");
            System.exit(0);
        }

        switch(operator){
            case '+':
                result = (int) calc.add(firstNumber, secondNumber);//firstNumber + secondNumber;
                System.out.println(firstNumber + " + "+secondNumber+ " = " +result);
                break;
            case '-':
                result = (int) calc.subtract(firstNumber, secondNumber);//firstNumber - secondNumber;
                System.out.println(firstNumber + " - "+secondNumber+ " = " +result);
                break;
            case '*':
                result = (int) calc.multiply(firstNumber, secondNumber);//
                System.out.println(firstNumber + " * "+secondNumber+ " = " +result);
                break;
            case '/':
                result = (int) calc.divide(firstNumber, secondNumber);
                System.out.println(firstNumber + " / "+secondNumber+ " = " +result);
                break;




        }


    }
}
