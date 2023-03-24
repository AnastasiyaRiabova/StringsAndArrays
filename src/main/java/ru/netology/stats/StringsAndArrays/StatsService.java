package ru.netology.stats.StringsAndArrays;


public class StatsService {
    public long generalSum(long[] sales) { //1
        long sum = 0;
        for (long value : sales) {
            sum += value;
        }
        return sum;

    }

    public long averageSum(long[] sales) { //2
        long sum = 0;
        for (long value : sales) {
            sum += value;
        }
        return sum/12;

    }
    public int maxSales(long[] sales) { //3
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
    public int minSales(long[] sales) { //4
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    // сумма всех чисел = 180 . среднее = 15  Количество месяцев, в которых продажи были ниже среднего - 5 месяцев
    // Количество месяцев, в которых продажи были выше среднего - 5 месяцев
}