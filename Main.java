import IMC.IMC;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the height: ");       float height = scanner.nextFloat();
        System.out.print("Enter the weight: ");         float weight = scanner.nextFloat();

        IMC imc =  new IMC(height, weight);
        System.out.println(imc.BMIvalues());

        scanner.close();
    }
}
