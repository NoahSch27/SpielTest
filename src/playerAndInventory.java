public class playerAndInventory {
    public static void playerStatsAndInv (int trinken, int holz, int beeren, int leben, int durst, int hunger, String playerName) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Inventar:");
        System.out.println("Du hast: " + holz + " Holz, " + beeren + " Beeren, " + trinken + " Trinken");
        System.out.println(playerName + ":");
        System.out.println("Du hast: " + leben + " Leben, " + durst + " Durst, " + hunger + " Hunger");
        System.out.println("------------------------------------------------------------------------");
    }
}
