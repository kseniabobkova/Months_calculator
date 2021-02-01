package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;

    }

    public long calculateAverage(long[] purchases) {
        long sum = calculateSum(purchases);
        long average = sum / 12;
        return average;
    }

    public long calculateMinPurchaseMonth(long[] purchases) {
        long minPurchases = purchases[0];
        long monthMinPurchases = 1;
        int currentMonth = 0;
        for (long purchase : purchases) {
            currentMonth = currentMonth + 1;
            if (minPurchases >= purchase) {
                minPurchases = purchase;
                monthMinPurchases = currentMonth;
            }
        }
        return monthMinPurchases;
    }

    public long calculateNumberOfMonthsWithLowPurchases(long[] purchases) {
        long numberOfMonthsWithLowPurchases = 0;
        for (long purchase : purchases) {
            if (purchase < calculateAverage(purchases)) {
                numberOfMonthsWithLowPurchases = numberOfMonthsWithLowPurchases + 1;
            }
        }
        return numberOfMonthsWithLowPurchases;
    }

    public long calculateNumberOfMonthsWithHighPurchases(long[] purchases) {
        long numberOfMonthsWithLowPurchases = 0;
        for (long purchase : purchases) {
            if (purchase > calculateAverage(purchases)) {
                numberOfMonthsWithLowPurchases = numberOfMonthsWithLowPurchases + 1;
            }
        }
        return numberOfMonthsWithLowPurchases;
    }
}
