import java.util.Random;
import java.lang.Math;

// класс с логикой сражения
public class Battle extends Thread{

    Random random = new Random();

    public int getRandomValue() {
        return random.nextInt(100);
    }


    public int war_game(Soul chevalier, Soul soul) {

        System.out.println(chevalier.getName() + " vs " + soul.getName());

        int chevalier_vitality = chevalier.getReal_vitalityVitality();
        int soul_vitality = soul.getVitality();
        boolean battle_run = true;


        while (battle_run) {

            //ход chevalier
            if (chevalier_vitality > 0) {
                soul_vitality -= chevalier.attack();
                System.out.println("Step Chevalier. Soul_vitality: " + soul_vitality);
            }

            //ход soul
            if (soul_vitality > 0) {
                chevalier_vitality -= chevalier.attack();
                System.out.println("Step Soul. Chevalier_vitality: " + chevalier_vitality);
            }

            //проверка условия окончания боя
            if ((chevalier_vitality <= 0) | (soul_vitality <= 0)) {
                if (chevalier_vitality > soul_vitality) {
                    System.out.println("Win Chevalier");
                    chevalier.setReal_vitalityVitality(chevalier_vitality);
                    chevalier.setMoney(chevalier.getMoney() + soul.getMoney());
                    chevalier.setExperience(chevalier.getExperience() + soul.getExperience());
                    return 0;

                } else {
                    System.out.println("Win Soul. Goodbye Chevalier!");
                    chevalier.setReal_vitalityVitality(chevalier_vitality);
                    return 3;
                }

                // battle_run = false;
            }

        }
        return 1;
    }

    @Override
    public void run() {


    }
}