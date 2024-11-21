import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        // Material
        int trinken = 0;
        int holz = 0;
        int beeren = 0;

        // Player
        int leben = 10;
        int durst = 0;
        int hunger = 0;
        int energie = 5;

        //Sonstiges
        int tag = 0;


        System.out.println("Es handelt sich um ein rundenbasiertes Survival-Spiel, bei dem Materialien gesammelt und Feinde abgewehrt werden. Bitte gib deinen Namen ein!");
        String playerName = setPlayerName.playerName();
        gameRoundStart(trinken, holz, beeren, leben, durst, hunger, tag, energie, playerName);

    }

    public static void gameRoundStart(int trinken, int holz, int beeren, int leben, int durst, int hunger, int tag, int energie, String playerName) {
        System.out.println("Ein neuer Tag ist angebrochen");
        tag++;
        energie = 10;
        for (int stunde = 0; stunde <= 10; stunde++) {
            System.out.println("Tag " + (tag) + " Stunde " + (stunde));
            playerAndInventory.playerStatsAndInv(trinken, holz, beeren, leben, durst, hunger, playerName);
            if (playerAttack.monsterAttack(tag)) {
                System.out.println("Oh nein, du wurdest von Monstern angegriffen.");
                System.out.println("Das hat dich ein Leben und zwei Energie gekostet.");
                --leben;
                --energie;
                --energie;
                playerAction.playerActions(trinken, holz, beeren, leben, durst, hunger, tag, energie, playerName);
            } else {
                playerAction.playerActions(trinken, holz, beeren, leben, durst, hunger, tag, energie, playerName);
            }
        }
    }
}