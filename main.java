package manyopa;


import java.util.Scanner;

public class main {

  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        votingSystem votingSystem = new votingSystem();

        while (true) {

            System.out.println("\n=== RES TRANSPORT VOTING SYSTEM ===");
            System.out.println("1. Register");
            System.out.println("2. Login & Vote");
            System.out.println("3. View Results");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = input.nextInt();
            input.nextLine(); 
            
            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                String id = input.nextLine();

                System.out.print("Enter Password: ");
                String password = input.nextLine();

                studentSystem.register(id, password);
            }

          
            else if (choice == 2) {

                System.out.print("Enter Student ID: ");
                String id = input.nextLine();

                System.out.print("Enter Password: ");
                String password = input.nextLine();

                student loggedIn = studentSystem.login(id, password);

               
                if (loggedIn == null) {
                    System.out.println("Login failed. Try again.");
                    continue;
                }

             
                System.out.println("\nLogin successful! Welcome " + loggedIn.getStudentId());

               
                System.out.println("\n--- VOTING MENU ---");
                System.out.println("1. Shuttle Bus");
                System.out.println("2. Taxi Pool");
                System.out.println("3. Uber/Bolt");
                System.out.println("4. No Transport");
                System.out.print("Enter choice: ");

                int transportChoice = input.nextInt();
                input.nextLine();

                String transport;

                switch (transportChoice) {
                    case 1:
                        transport = "Shuttle";
                        break;
                    case 2:
                        transport = "Taxi";
                        break;
                    case 3:
                        transport = "Uber";
                        break;
                    default:
                        transport = "None";
                }

                System.out.println("\n--- TIME SLOT ---");
                System.out.println("1. 07:00");
                System.out.println("2. 07:30");
                System.out.println("3. 08:00");
                 System.out.print("Enter choice: ");

                int timeChoice = input.nextInt();
                input.nextLine();

                String timeSlot;

                switch (timeChoice) {
                    case 1:
                        timeSlot = "07:00";
                        break;
                    case 2:
                        timeSlot = "07:30";
                        break;
                    default:
                        timeSlot = "08:00";
                }

               
                Vote vote = new Vote(
                        loggedIn.getStudentId(),
                        transport,
                        timeSlot
                );

               
                votingSystem.addVote(vote);
            }

           
            else if (choice == 3) {
                votingSystem.showResults();
            }

            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }
}