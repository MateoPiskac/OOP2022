package hr.fer.oop.Decimal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Solution {

    public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar) {

        String[] numbers = Double.toString(exemplar).split("\\.");
        double firstDigit = Double.parseDouble(String.valueOf(numbers[0].charAt(numbers[0].length() - 1)));
        List<Integer> secondDigits = new ArrayList<>();
        for (int i = 0; i < numbers[1].length(); i++) {
            secondDigits.add(Integer.parseInt(String.valueOf(numbers[1].charAt(i))));
        }

        return lists -> {
            for (List<Integer> list : lists) {
                if (list.get(0) == 0) {
                    if (!(firstDigit == list.get(1)))
                        return false;
                } else {
                    if (!(secondDigits.contains(list.get(1)))) {
                        return false;
                    }
                }
            }
            return true;
        };
    }

    public static Predicate<List<List<Integer>>> allDigitsDefined() {
        return lists -> {
            int decimals = -1;
            int lastDecimalPlace = 1;
            for (List<Integer> list : lists) {
                decimals++;
                lastDecimalPlace = Math.max(lastDecimalPlace, list.get(0));
            }
            return decimals==lastDecimalPlace;
        };
    }
}