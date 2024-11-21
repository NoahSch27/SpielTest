import java.util.Random;
import java.util.Scanner;

public class playerAction {
    public static void playerActions(int trinken, int holz, int beeren, int leben, int durst, int hunger, int tag, int energie, String playerName) {
        System.out.println(playerName + " Was möchtest du machen?");
        System.out.println("1. Wasser sammeln");
        System.out.println("2. Nahrung sammeln");
        System.out.println("3. Holz Sammeln");
        System.out.println("4. Tag beenden");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        if (action == 1) {
            System.out.println("Du ");
        } else if (action == 2) {

        } else if (action == 3) {

        } else if (action == 4) {
            Main.gameRoundStart(trinken, holz, beeren, leben, durst, hunger, tag, energie, playerName);
        }
    }
    static int collectWater(int trinken) {
        Random random = new Random();
        int foundWater = random.nextInt(3);
        return foundWater;
    }
}
