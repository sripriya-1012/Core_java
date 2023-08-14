import java.util.Scanner;

public class DiscountOnFestivals {
    public double discountsOnFestival(int bill){
        double discount;
         discount= 12;
        double afterDiscount;
        afterDiscount = bill - (bill * discount / 100);
        return afterDiscount;
    }
}
