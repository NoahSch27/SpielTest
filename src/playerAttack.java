import java.util.Random;

public class playerAttack {
    public static boolean monsterAttack (int tag) {
        int attackPercent = 10;
        return calculateMonsterAttack(attackPercent, tag);
    }

    public static boolean calculateMonsterAttack(int attackPercent, int tag) {
        boolean attack = false;
        Random random = new Random();
        int MonsterAttackPercent = Math.round(attackPercent * (tag / 10));
        if (random.nextInt(10) <= MonsterAttackPercent) {
            return attack = true;
        } else {
            return attack = false;
        }
    }
}
