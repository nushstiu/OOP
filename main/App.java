package HW.main;

import HW.converter.TempConverter;
import HW.converter.Calculator;
import HW.converter.NumbersComparator;

import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static void main(String[] args){

       TempConverter conv = new TempConverter();
       Calculator calc = new Calculator();
       NumbersComparator comp = new NumbersComparator();

       Scanner scanner = new Scanner(System.in);

        out.println("What would you like to do? (TempConvertor=1, Calculator=2,  NumbersComparator=3) ");
        int sarcina = scanner.nextInt();

        switch (sarcina){
            case 1:{
                out.println("Enter your Celcius Value:");
                double celsiusValue = scanner.nextDouble();
                double fahrResult = conv.convertToFahr(celsiusValue);
                out.println(celsiusValue + " Celsius = " + fahrResult + " Fahr");

                out.println("Enter your Fahrenheit Value:");
                double fahrValue = scanner.nextDouble();
                double celsiusResult = conv.convertToCelsius(fahrValue);
                System.out.println(fahrValue + " Fahrenheit =  " + celsiusResult + " Celsius");
                break;
            }
            case 2:{
                out.println("Enter first number: ");
                int firstNumber = scanner.nextInt();
                out.println("Enter second number: ");
                int secondNumber = scanner.nextInt();
                out.println("Choose operation (+ - * /)");
                char operation = scanner.next().charAt(0);
                switch (operation) {
                    case '+':
                        calc.adunare(firstNumber, secondNumber);
                        break;
                    case '-':
                        calc.scadere(firstNumber, secondNumber);
                        break;
                    case '*':
                        calc.inmultire(firstNumber, secondNumber);
                        break;
                    case '/':
                        calc.impartire(firstNumber, secondNumber);
                        break;
                    default:
                        System.out.println("Invalid operation");

                        break;
                }
                 break;
                }
            case 3:{
                out.println("Enter first number: ");
                int firstNumberComp = scanner.nextInt();
                out.println("Enter second number: ");
                int secondNumberComp = scanner.nextInt();
                out.println("The minimal number: ");
                comp.minim(firstNumberComp, secondNumberComp);
                out.println("The maximal number: ");
                comp.maxim(firstNumberComp, secondNumberComp);

                break;
            }
        }
    }
}
