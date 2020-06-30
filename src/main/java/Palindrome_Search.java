import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome_Search {
    public static void main(String[] args)
    {
        String[] stings = {"aba", "bccb", "ffd", "lmfas"};
        List<String> strlist = Arrays.asList(stings);
        strlist=pal(strlist);
        for(String i:strlist)
            System.out.println(i);
    }
    static List<String> pal(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
        return l2;
    }
}
