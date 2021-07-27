import java.util.Scanner;

public class NumberCalculator {

    public double add(double first, double second){
       
        return first + second;

    }
    public double multiply(double first, double second){
       
        return first * second;

    } public double subtract(double first, double second){
       
        return first - second;

    }
    public double divide(double first, double second){
       
        return first - second;
    }
    
    public static void main(String[] args){
        NumberCalculator calc = new NumberCalculator();
        
        char operator;
        Double firstNumber, secondNumber, result;
        //creating an object of scanner class
        Scanner scan = new Scanner(System.in);
        //Ask for input here
        System.out.println("Choose and operator: +, -, *,/");
        operator = scan.next().charAt(0);
        if(operator != '+'&& operator != '-'&&operator != '*'&&operator != '/')

            {
            System.out.println("invalid operator");
             System.exit(0);}
            

        //ask for the first number to calculate
        System.out.println("Enter first Number!");
        firstNumber = scan.nextDouble();
        System.out.println("Enter second Number!");
        secondNumber = scan.nextDouble();

        switch(operator){
            case '+':
            result = calc.add(firstNumber, secondNumber);//firstNumber + secondNumber;
            System.out.println(firstNumber + " + "+secondNumber+ " = " +result);
            break;
            case '-':
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - "+secondNumber+ " = " +result);
            break;
            case '*':
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * "+secondNumber+ " = " +result);
            break;
            case '/':
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / "+secondNumber+ " = " +result);
            break;
            
           


        }


    }
}
