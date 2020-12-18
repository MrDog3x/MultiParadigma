import java.util.Scanner;

public class calculator {
    public static void main(String[] args) 
    {
    int numOne;
    int numTwo;
    String operationSign;


    Scanner inputReader = new Scanner(System.in);

    System.out.println("First number:");
    numOne = inputReader.nextInt();

    System.out.println("Second number:");
    numTwo = inputReader.nextInt();

    System.out.println("Enter the operation");
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