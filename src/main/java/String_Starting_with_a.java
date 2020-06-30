import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_Starting_with_a {
    public static void main(String [] args)
    {
        String [] strArray = {"apple", "Best", "abs", "KK", "ace", "MM", "NN"};
        List<String> strList = Arrays.asList(strArray);

        List<String> listStaringWithA = search(strList);
        System.out.println(listStaringWithA);


    }
    public static List<String> search(List<String> list) {
        return list.stream() .filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());}
}

