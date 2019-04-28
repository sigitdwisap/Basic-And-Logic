package com.basicandlogic.numberstowords.All;

import java.text.DecimalFormat;

class SpelledOut {

    private static final String[] tenMultiples = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] underTwenty = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private SpelledOut() {
    }

    private static String convertLessThanOneThousand(int number) {
        String LessThanOneHundred;
        if (number % 100 < 20) {
            LessThanOneHundred = underTwenty[number % 100];
            number /= 100;
        } else {
            LessThanOneHundred = underTwenty[number % 10];
            number /= 10;

            LessThanOneHundred = tenMultiples[number % 10] + LessThanOneHundred;
            number /= 10;
        }
        if (number == 0) return LessThanOneHundred;
        return underTwenty[number] + " hundred" + LessThanOneHundred;
    }

    private static String convert(long number) {

        String stringResult;

        boolean isMinus = false;
        if (number * -1 > 0) {
            number *= -1;
            isMinus = true;
        }

        // 0 to 2.147.483.647
        if (number == 0) {
            return "zero";
        }

        String stringNumber;

        // pad number with "0"
        String mask = "0000000000";
        DecimalFormat df = new DecimalFormat(mask);
        stringNumber = df.format(number);

        // x000000000
        int billions = Integer.parseInt(stringNumber.substring(0, 1));
        // 0xxx000000
        int millions = Integer.parseInt(stringNumber.substring(1, 4));
        // 0000xxx000
        int thousands = Integer.parseInt(stringNumber.substring(4, 7));
        // 0000000xxx
        int hundreds = Integer.parseInt(stringNumber.substring(7, 10));

        // handling for billions
        String billionString = "";

        if (billions > 0) billionString = convertLessThanOneThousand(billions) + " billion ";

        // handling for millions
        String millionString = "";

        if (millions > 0) millionString = convertLessThanOneThousand(millions) + " million ";

        // handling for hundred thousands
        String thousandString = "";

        if (thousands > 0) thousandString = convertLessThanOneThousand(thousands) + " thousand ";

        // handling for hundreds
        String hundredString = convertLessThanOneThousand(hundreds);

        stringResult = billionString + millionString + thousandString + hundredString;

        if (isMinus) stringResult = "minus " + stringResult;

        // remove extra spaces
        return stringResult.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    static String spelledInWords(int number) {
        return convert(number).trim();
    }
}
