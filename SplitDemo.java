import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class SplitDemo {
        public static void main(String[] args) {
            String input = "*1 Rental $70,000Shopping  $299. Expenses $800 . House$2,00,000";
            String regex = "\\$\\d+(,\\d+)*(\\.\\d+)?";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            List<String> matchedValues = new ArrayList<>();

            while (matcher.find()) {
                String matched = matcher.group();
                matchedValues.add(matched);
                System.out.println(matcher.group());
            }

            int sum = 0;
            NumberFormat format = NumberFormat.getInstance(Locale.US);

            for (String value : matchedValues) {
                try {
                    Number num = format.parse(value.replace("$", "").replace(",", ""));
                    int intValue = num.intValue();
                    sum += intValue;
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Sum of matched values: " + sum);
        }
    }
