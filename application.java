import java.util.Scanner;

public class application{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);

        System.out.println("This is a simple Chat apllication");
        System.out.println("Type 'exit' if you want to quit");

        while (true) {
            System.out.print("Persona 1:");
            String Persona1 = scanner.nextLine();
            if (Persona1.equalsIgnoreCase("exit"))
                break;
            System.out.print("Persona 2:");
            String Persona2 = scanner.nextLine();
            if (Persona2.equalsIgnoreCase("exit"))
                break;
            
            System.out.println("Persona 1: " + Persona1);
            System.out.println("Persona 2: " + Persona2);
            System.out.println();

        }
        scanner.close();
    }
}