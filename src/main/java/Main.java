import Sweets.Licorice;
import Sweets.Lollipop;
import Sweets.Marshmallow;
import Sweets.Sweet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * Program with 2 different functions
 *
 * @author FellGast
 * <p>
 * This method realise search and swipe numbers in array
 * @see #array()
 * <p>
 * This method realise collect present box
 * @see #sweets()
 */


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите функционал программы: (1 - поиск максимального отрицательного и минимального положительного числа , 2 - сборка сладкого подарка");
        int functional = in.next().charAt(0);
        switch (functional) {

            // массив
            case '1':

                array();
                break;

            // сборщик подарка
            case '2':
                sweets();
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
        in.close();
    }

    public static void array() {
        int[] arr = new int[20];

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            arr[i] = r.nextInt((10 - (-10)) + 1) + (-10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int maxNeg = Integer.MIN_VALUE;

        for (int i = 0; i < 20; i++) {
            if (arr[i] < 0 && arr[i] > maxNeg) {
                maxNeg = arr[i];
            }
        }

        int minPos = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            if (arr[i] > 0 && arr[i] < minPos) {
                minPos = arr[i];
            }
        }

        System.out.println("Максимальный отрицательный элемент: " + maxNeg);

        System.out.println("Минимальный положительный элемент: " + minPos);

        for (int i = 0; i < 20; i++) {
            if (arr[i] == minPos) {
                arr[i] = maxNeg;
            } else if (arr[i] == maxNeg) {
                arr[i] = minPos;
            }
        }
        System.out.println("Массив после замены: " + Arrays.toString(arr));
    }

    public static void sweets() {
        Licorice licorice1 = new Licorice("licoriceName1", 2.99, 2.5, 20.0);
        Lollipop lollipop1 = new Lollipop("lollipopName1", 5.50, 2.0, 3.5);
        Marshmallow marshmallow1 = new Marshmallow("marshName1", 1.0, 0.5, "white");
        Licorice licorice2 = new Licorice();
        licorice2.setPrice(3.0);
        licorice2.setWeight(2.5);
        Sweet[] presentBox = {licorice1, licorice2, lollipop1, marshmallow1};
        double totalPrice = 0.0;
        double totalWeight = 0.0;

        for (Sweet someSweet : presentBox) {
            totalWeight += someSweet.getWeight();
            totalPrice += someSweet.getPrice();
        }
        System.out.println("Общий вес подарка: " + totalWeight);
        System.out.println("Общая стоимость подарка: " + totalPrice);

        for (Sweet someSweet : presentBox) {
            System.out.println(someSweet.toString());
        }

    }
}
