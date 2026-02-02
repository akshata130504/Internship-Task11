import java.io.*;
import java.util.Scanner;

/*
 * Task 11: File Handling – User Data Storage System
 */
public class UserDataApp {

    private static final String FILE_NAME = "user_data.txt";

    // Method to write user data to file (append mode)
    static void writeUserData(String name, String email, String phone) {

        File file = new File(FILE_NAME);

        try {
            // Create file if it does not exist
            if (!file.exists()) {
                file.createNewFile();
            }

            // FileWriter with append = true
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Email: " + email);
            bw.newLine();
            bw.write("Phone: " + phone);
            bw.newLine();
            bw.write("---------------------------");
            bw.newLine();

            bw.close(); // close BufferedWriter (also closes FileWriter)

            System.out.println("User data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing data: " + e.getMessage());
        }
    }

    // Method to read user data from file
    static void readUserData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No user data found.");
            return;
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n--- Stored User Records ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // close BufferedReader

        } catch (IOException e) {
            System.out.println("Error while reading data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        // Write data to file
        writeUserData(name, email, phone);

        // Read data from file
        readUserData();

        sc.close();
    }
}
