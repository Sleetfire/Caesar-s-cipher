import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char [] abc1 = {'1', '2', '3', '4', '5', '6', '7', '8','9','0', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' ', ',', '.', '?', '!','+', '-','=','*','/', '(', ')'};
        int key;

        System.out.println("Выберите операцию, которую хотите выполнить: \n 1. ЗАШИФРОВАТЬ ПРЕДЛОЖЕНИЕ. \n 2. РАСШИФРОВАТЬ ПРЕДЛОЖЕНИЕ");
        Scanner c = new Scanner(System.in);
        int change = c.nextInt();

        switch (change) {
            case 1:

                System.out.println("Ввелите слово или предложение на русском, чтобы зашифровать его:");
                Scanner a = new Scanner(System.in);
                String sentence = a.nextLine();

                do {
                    System.out.println("Введите ключ:");
                    Scanner b = new Scanner(System.in);
                    key = b.nextInt();
                } while (key > abc1.length);

                char[] chars = sentence.toCharArray();

                int[] num1 = new int[chars.length];
                int[] num2 = new int[chars.length];

                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < abc1.length; j++) {
                        if (chars[i] == abc1[j]) num1[i] = j;
                    }
                    num2[i] = num1[i] + key;
                }

                for (int i = 0; i < chars.length; i++) {
                    if (num2[i] > abc1.length) {
                        num2[i] = num2[i] - abc1.length;

                    }
                    chars[i] = abc1[num2[i]];
                    System.out.print(chars[i]);

                }
                break;
            case 2:
                System.out.println("Ввелите слово или предложение на русском, чтобы расшифровать его:");
                Scanner q = new Scanner(System.in);
                String sentence1 = q.nextLine();

                do {
                    System.out.println("Введите ключ:");
                    Scanner w = new Scanner(System.in);
                    key = w.nextInt();
                } while (key > abc1.length);

                char[] chars1 = sentence1.toCharArray();

                int[] num11 = new int[chars1.length];
                int[] num22 = new int[chars1.length];

                for (int i = 0; i < chars1.length; i++) {
                    for (int j = 0; j < abc1.length; j++) {
                        if (chars1[i] == abc1[j]) num11[i] = j;
                    }
                    num22[i] = num11[i] - key;
                }

                for (int i = 0; i < chars1.length; i++) {
                    if (num22[i] > abc1.length) {
                        num22[i] = num22[i] - abc1.length;

                    }
                    chars1[i] = abc1[num22[i]];
                    System.out.print(chars1[i]);
                }
                break;
        }
    }
}
