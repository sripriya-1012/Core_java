// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args)
    {
//        List<Integer> ListOfIntegers = List.of(1,2,3,4,45);
        ArrayList<Integer> ListOfIntegers = new ArrayList<Integer>();
        ListOfIntegers.add(1);
        ListOfIntegers.add(2);
        ListOfIntegers.add(3);
        ListOfIntegers.add(4);

        for(int i:ListOfIntegers)
        {
            System.out.println(i);
        }
    }
}