import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NumberFormatException {
        // готовим ввод с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //1. введите имя персонажа
        System.out.println("Enter the name of the Chevalier"); // Для начала игры, введите имя вашего персонажа
        String name = scanner.nextLine();

        // создаем ПЕРСОНАЖА и выводим его базовые параметры на экран
        Soul chevalier1 = new Chevalier();
        chevalier1.setName(name);
        //chevalier1.setName("Chevalier");
        //chevalier1.get_param_soul();

        // создаем ГОБЛИНА и выводим его базовые параметры на экран
        Soul goblin1 = new Goblin();
        //goblin1.get_param_soul();

        // создаем СКЕЛЕТОНА и выводим его базовые параметры на экран
        Soul skeleton1 = new Skeleton();
        skeleton1.get_param_soul();

        int command = 1;

        // создаем ДИЛЛЕРА
        Dealer dealer1 = new Dealer(chevalier1, 50, 100, 10);

        // создаем БОЙ
        Battle bt = new Battle();
        //Thread tr = new Thread(bt);

        //запуск игрового цикла
        while (command != 3) {

            System.out.println("Where do you want to go?" + "\n" + "0 - Personag, 1 - Dealer, 2 - Dark wood, 3 - Exit");

            try {
                command = Integer.parseInt(scanner.nextLine());

                // Go to Dealer
                if (command == 0) {
                    System.out.println("Go to Dealer\n");
                    chevalier1.get_param_soul();
                }

                // Go to Dealer
                if (command == 1) {
                    System.out.println("Go to Dealer\n");
                    dealer1.resolt_trade();
                }

                // Go to Battle in the Dark wood
                if (command == 2) {
                    System.out.println("Go to Battle in the Dark wood\n");

                    // выбирает какого монстра выбрать для боя
                    // скелет <50
                    if ((bt.getRandomValue()) >= 50) {

                        command = bt.war_game(chevalier1, skeleton1);
                        //bt.start();

                        // гоблин >50
                    } else {

                        command = bt.war_game(chevalier1, goblin1);
                        //bt.start();
                    }

                }

                //исключение, если команда не 1, 2, 3
                if (command != 1 & command != 2 & command != 0) {
                    System.out.println("Error: wrong command\n Specify another command\n");
                }

            } catch (NumberFormatException e) {
                System.err.println("Error: wrong command\n Specify another command\n");

            }

        }

        System.out.println("Goodbye Chevalier\n");
    }
}
