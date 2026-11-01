import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuideManager manager = new GuideManager();
        Scanner scanner = new Scanner(System.in);
        manager.addGuide("New PC setup",
                "1. Connect the power , monitor , keyboard and mouse\n" +
                        "2. Plug the monitor cable (HDMI) into the graphics card, NOT the mptherboard\n" +
                        "3. Press power and follow the setup screens\n" +
                        "4. Connect to wi-fi\n" +
                        "5. Run system updates\n" +
                        "6. lnstall an antivirus and your browser");
        boolean running = true;
        while (running) {
            System.out.println("\n1. show all guides");
            System.out.println("2. search guide");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                for (Guide guide : manager.getAllGuide()) {
                    System.out.println("-" + guide.getTitle());
                }
            } else if (choice == 2) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                Guide g = manager.findByTitle(title);
                if (g != null) {
                    System.out.println(g.getSteps());
                } else {
                    System.out.println("Guide not found");
                }
                } else if (choice == 0) {
                    running = false;
                }
            }
        }
    }
