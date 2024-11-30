import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerManager manager = new WorkerManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Worker Management System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Worker");
            System.out.println("2. List Workers");
            System.out.println("3. Calculate Global Total Salary");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter worker's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter base salary: ");
                    double baseSalary = scanner.nextDouble();
                    System.out.print("Enter complement: ");
                    double complement = scanner.nextDouble();
                    manager.addWorker(name, baseSalary, complement);
                    System.out.println("Worker added successfully!");
                    break;

                case 2:
                    manager.listWorkers();
                    break;

                case 3:
                    double totalSalary = manager.calculateGlobalTotalSalary();
                    System.out.printf("Global Total Salary: %.2f\n", totalSalary);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
