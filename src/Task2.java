import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            String tail = "******";
            Random random = new Random();
            int ranWordNum = random.nextInt(words.length);
            String ranWord = words[ranWordNum];
            System.out.println(Arrays.toString(words));

            System.out.println("Компьютер загадал слово, попробуйте угадать:");
            Scanner scanner = new Scanner(System.in);
            String userWord = scanner.nextLine();
            String outputWord = "";

            checkMethod(tail, ranWord, userWord, outputWord);

            do {
                System.out.println("Попробуйте еще раз:");
                userWord = scanner.nextLine();
                checkMethod(tail, ranWord, userWord, outputWord);
            } while (!userWord.equals(ranWord));

        }

        private static void checkMethod(String tail, String ranWord, String userWord, String outputWord) {
            int size;
            if (userWord.length() < ranWord.length()) {
                size = userWord.length();
            } else {
                size = ranWord.length();
            }

            for (int i = 0; i < size; i++) {
                if (userWord.charAt(i) == ranWord.charAt(i)) {
                    outputWord = outputWord + userWord.charAt(i);
                } else {
                    outputWord = outputWord + "*";
                }
            }
            if (userWord.equals(ranWord)) {
                System.out.println("Вы угадали!");
            } else
            {outputWord = outputWord + tail;
            System.out.println(outputWord);}
        }
    }

