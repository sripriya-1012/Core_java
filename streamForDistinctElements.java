//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamForDistinctElements {
    public static void main(String[] args)
    {
//        ArrayList<Integer> ListOfIntegers = new ArrayList<Integer>();
//        ListOfIntegers.add(1);
//        ListOfIntegers.add(2);
//        ListOfIntegers.add(3);
//        ListOfIntegers.add(3);
        List<Integer> ListOfIntegers = List.of(1,2,3,4,3,4,5,6);

        System.out.println(ListOfIntegers);

        List<Integer> distinctElements = ListOfIntegers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctElements);
    }
}





//        for(int i:ListOfIntegers)
//        {
//            System.out.println(i);
//        }


//    public static void main(String[] args){
//        Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
//
//        List<String> distinctChars = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(distinctChars);
//    }
