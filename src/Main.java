import java.util.Objects;
import java.util.Scanner;
import  java.util.Random;
import java.util.Arrays;
public class Main {
    public static int generateRandomNumber(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        // генерируем случайное число от 0 до `n`
        return new Random().nextInt(n + 1);
    }
    public static void main(String[] args) {
        System.out.println("Давай сыграем в игру: камень-ножницы-бумага!");
        System.out.println("Сколько раз ты хочешь сыграть?");
        Scanner numbers = new Scanner(System.in);
        int numberGame = numbers.nextInt();
        String [] mas = {"камень", "ножницы", "бумага"};
        int n = 2;
        for (int i = 0; i < numberGame; i++) {
            String machineChoise = mas[generateRandomNumber(n)];
            System.out.println("Какой твой выбор?");
            Scanner choise = new Scanner(System.in);
            String humanChoice = choise.nextLine();
            switch (machineChoise) {
                case "камень":
                    if (Objects.equals(humanChoice, "ножницы")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты проиграл. Попробуй еще раз!");
                    } else if (Objects.equals(humanChoice, "бумага")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты победил! Ура!!!");
                    } else if (Objects.equals(humanChoice, "камень")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ничья");
                    } break;
                case "ножницы":
                    if (Objects.equals(humanChoice, "камень")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты победил! Ура!!!");
                    } else if (Objects.equals(humanChoice, "бумага")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты проиграл. Попробуй еще раз!");
                    } else if (Objects.equals(humanChoice, "ножницы")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ничья");
                    } break;
                case "бумага":
                    if (Objects.equals(humanChoice, "камень")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты проиграл. Попробуй еще раз!");
                    } else if (Objects.equals(humanChoice, "ножницы")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ты победил! Ура!!!");
                    } else if (Objects.equals(humanChoice, "бумага")) {
                        System.out.println("Компьютер выбрал - " + machineChoise);
                        System.out.println("Ничья");
                    } break;

            }
        }
    }



}
