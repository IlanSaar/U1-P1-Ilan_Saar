import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Setting our variables and asking for values
        System.out.print("Type in your subtotal: ");
        double subTotal = scan.nextDouble();
        System.out.println();
        System.out.print("Type in the tip percentage you would like to give: ");
        double tipPercent = scan.nextDouble();
        System.out.println();
        System.out.print("How many people are there: ");
        int numPeople = scan.nextInt();

        //Calculations
        double tipValue = (subTotal * (tipPercent / 100));
        double tipPerPerson = (tipValue / numPeople);
        double finalTotal = (subTotal + tipValue);
        double totalPerPerson = (finalTotal / numPeople);

        // Rounding to the nearest cent
        tipPerPerson = Math.round((tipPerPerson + 0.005) * 100.0) / 100.0;
        totalPerPerson = Math.round((totalPerPerson + 0.005) * 100.0) / 100.0;

        //Announcing the final values
        System.out.println("Each person will tip: $" + tipPerPerson);
        System.out.println("Each person pays: $" + totalPerPerson);

    }
}