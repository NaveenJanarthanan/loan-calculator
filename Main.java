import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

public class Main {

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            //System.out.println(line);
            String[] arrOfStr = line.split(":",4);
            String a = arrOfStr[0];
            String b = arrOfStr[1];
            String c = arrOfStr[2];
            String d = arrOfStr[3];

            int loan = Integer.parseInt(a);
            int years = Integer.parseInt(b);
            double interest = Double.parseDouble(c);
            int downpayment = Integer.parseInt(d);

            loan -= downpayment;

            interest /= 100.0;

            double monthRate = interest/12;

            int termMonths = years * 12;

            double monthlyPayment = (loan*monthRate)/(1-Math.pow(1+monthRate, -termMonths));
            double totalInterest = monthlyPayment * termMonths - loan;


            Integer truncateTotalInterest = BigDecimal.valueOf(totalInterest).setScale(0,RoundingMode.HALF_UP).intValue();
            Double truncateMonthlyPayment = BigDecimal.valueOf(monthlyPayment).setScale(2, RoundingMode.HALF_UP).doubleValue();

            System.out.println("$" + truncateMonthlyPayment +"~"+ "$"+truncateTotalInterest);
        }
    }

}
