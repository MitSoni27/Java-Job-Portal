package job_portal;

import java.util.Scanner;

public class JobPortalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JobService service = new JobService();

        while (true) {
            System.out.println("\n=== Job Portal Menu ===");
            System.out.println("1. Add Job");
            System.out.println("2. View All Jobs");
            System.out.println("3. Search Job by Title");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Job Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Company: ");
                        String company = sc.nextLine();
                        System.out.print("Enter Location: ");
                        String location = sc.nextLine();
                        service.addJob(title, company, location);
                        break;

                    case 2:
                        service.listJobs();
                        break;

                    case 3:
                        System.out.print("Enter Job Title to Search: ");
                        String searchTitle = sc.nextLine();
                        service.searchJob(searchTitle);
                        break;

                    case 4:
                        System.out.println("👋 Exiting Job Portal.");
                        return;

                    default:
                        System.out.println("⚠️ Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error: " + e.getMessage());
                sc.nextLine(); // clear buffer
            }
        }
    }
}
