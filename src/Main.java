//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int target = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < target) {
            sum = sum + amount;
            sum = (int) (sum * (1 + percent));
            month = month + 1;
            System.out.println(" Месяц " + month + ", сумма накоплений равна " + sum + " рублей ");
        }
        System.out.println(" Задача 2 ");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number = number - 1) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(" Задача 3 ");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year = year + 1) {
            population = population + population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println(" Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задача 4 ");
        percent = 7D / 100;
        int desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 5 ");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 6 ");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 7 ");
        int friday = 6;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println(" Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Задача 8 ");
        int startSeeing = 0;
        int period = 79;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year = year + 1) {
            if (year % period == startSeeing) {
                System.out.println(year);
            }
        }
    }
}

