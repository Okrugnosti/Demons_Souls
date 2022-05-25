import java.io.IOException;
import java.util.Scanner;

// класс для торговца
public class Dealer {

    // кол-во едениц лечебных цветков
    int flower = 50;
    // курс обемена 1 цетка на деньги
    int price_flowers = 100;
    // прирост едениц здоровья за 1 цветок
    int plus_vitality = 10;
    // объект персонажа, с которым обмениваемся ресурсами
    Soul soul;

    public Dealer(Soul soul, int flower, int price_flowers, int plus_vitality) {
        this.soul = soul;
        this.flower = flower;
        this.price_flowers = price_flowers;
        this.plus_vitality = plus_vitality;
    }

    public void resolt_trade() throws IOException, NumberFormatException {

        //проверка на достаточность денег и проверка на перелимичивание здоровья
        int max_size = Math.min((soul.getMoney() / price_flowers),
                ((soul.getVitality() - soul.getReal_vitalityVitality()) / plus_vitality));

        System.out.println("Hello, Chevalier! \n" +
                "Price of one flower: " + this.price_flowers +
                "\nYour money: " + soul.getMoney() +
                "\nYou can buy: " + (soul.getMoney() / price_flowers) +
                "\nYou vitaliti: " + soul.getReal_vitalityVitality() + " You max vitaliti: " + soul.getVitality() +
                "\nOne flower adds health to: " + plus_vitality +
                "\nMaximum possible: " + max_size +
                "\nHow much do you want to buy? \n");

        Scanner scanner_dealer = new Scanner(System.in);

        try {

            //определяем размер сделки по конвертации
            int size = Integer.parseInt(scanner_dealer.nextLine());

            if (size <= max_size) {
                //пересчет денег
                soul.setMoney((soul.getMoney() - size * this.price_flowers));

                //пересчет здоровья
                soul.setReal_vitalityVitality((soul.getReal_vitalityVitality() + size * plus_vitality));

                //пересчет запаса цветков
                this.flower = this.flower - size;

                System.out.println("Deal done\n");
            }

        } catch (NumberFormatException e) {
            System.err.println("Error: wrong command\n Specify another command\n");
        }


    }

}