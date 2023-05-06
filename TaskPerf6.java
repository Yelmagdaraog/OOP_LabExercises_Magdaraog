import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskPerf6 {
        public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("[1] Register");
        System.out.println("[2] Login");
        int option = scanner.nextInt();

        if (option == 1) {
        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
       
        if (username.matches("^[a-zA-Z0-9]*$") && password.matches("^[a-zA-Z0-9]*$")) {
        File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Magdaraog_MarielleTherese\\src\\records.txt");
        if (!file.exists()) {
        file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter b = new BufferedWriter(fw);
        b.write(username + "," + password);
        b.newLine();
        b.close();
        System.out.println("Registration successful!");
        } else {
        System.out.println("Username and password can only contain alphanumeric characters");
        }
            } else if (option == 2) {
            System.out.println("Enter username: ");
            String username = scanner.next();
            System.out.println("Enter password: ");
            String password = scanner.next();  
            File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Magdaraog_MarielleTherese\\src\\records.txt");
            Scanner fileScanner = new Scanner(file);
            boolean isValid = false;
            while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            if (parts[0].equals(username) && parts[1].equals(password)) {
            isValid = true;
            break;
          }
    }
    if (isValid) {
    System.out.println("Successfully logged in");
    } else {
    System.out.println("Incorrect username or password");
    }
    } else {
    System.out.println("Invalid option");
    }
    } catch (IOException e) {
    System.out.println("An error occured while performing the operation");
    }
    }
}
