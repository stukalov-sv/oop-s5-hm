package Controller;
import java.util.logging.Logger;
import java.util.Scanner;

public class MainController {
    DesktopBuilder db = new DesktopBuilder();
    Storehouse sh = new Storehouse();

    public void startButton() {
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nChoose action:\n" +
            "1 - show storehouse\n" +
            "2 - build personal computer\n");

        int action = iScanner.nextInt();
        iScanner.nextLine();

        switch (action) {
            case 1:
                logger.info(sh.toString());
                break;
            case 2:
                System.out.println("\nEnter motherboard you want:\n");
                String mbWord = iScanner.nextLine();
                db.setMotherBoard(sh.mbStore, mbWord);

                System.out.println("\nEnter CPU you want:\n");
                String cpuWord = iScanner.nextLine();
                db.setProcessor(sh.cpuStore, cpuWord);

                System.out.println("\nEnter RAM you want:\n");
                String ramWord = iScanner.nextLine();
                db.setMemory(sh.ramStore, ramWord);

                logger.info(db.toString());
                break;
            default:
                logger.info("Incorrect data");
                break;
        }

        iScanner.close();
    }
}
