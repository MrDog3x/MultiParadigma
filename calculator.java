import java.util.Scanner;

public class calculator {
    public static void main(String[] args) 
    {
    int numOne;
    int numTwo;
    String operationSign;


    Scanner inputReader = new Scanner(System.in);

    System.out.println("please enter the first number");
    numOne = inputReader.nextInt();

    System.out.println("please enter the second number");
    numTwo = inputReader.nextInt();

    System.out.println("Please enter operation");
    operationSign = inputReader.next();
    switch(operationSign){
        case "+":
        System.out.println("The result is " + (numOne + numTwo));
        break;
        case "-":
        System.out.println("The result is " + (numOne - numTwo));
        break;
        case "*":
        System.out.println("The result is " + (numOne * numTwo));
        break;
        case "/":
        System.out.println("The result is " + (numOne / numTwo));
        break;
    }
}
}