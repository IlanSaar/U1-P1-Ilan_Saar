import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Setting our variables
        double subTotal = scan.nextDouble();
        double tipPercent = scan.nextDouble();
        int numPeople = scan.nextInt();
        //Calculations
        double tipValue = (subTotal * (tipPercent / 100);
        double tipPerPerson = (tipValue / numPeople);
        double finalTotal = (subTotal + tipValue);

    }
}