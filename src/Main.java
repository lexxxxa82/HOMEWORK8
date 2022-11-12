import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] reportingMonth = generateRandomArray();
        //System.out.println(Arrays.toString(reportingMonth));
        int sum = 0;
        for (int j : reportingMonth) sum += j;
        System.out.println( "Сумма трат за месяц составила "+sum +" рублей " );
        int maxDigit = 100_000;
        int minDigit =200_000;
        for (int i : reportingMonth) {
            if (i  >  maxDigit) {
                maxDigit = i;
            }
            if (i  <  minDigit) {
                minDigit = i ;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minDigit+" рублей. Максимальная сумма трат за день составила "+maxDigit+" рублей");
        double averageFigure;
        averageFigure = sum / reportingMonth.length;
        System.out.println( "Средняя сумма трат за месяц составила " + averageFigure+" рублей");
        System.out.println("Задача №2");
        char[] reverseFullName;
        reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}