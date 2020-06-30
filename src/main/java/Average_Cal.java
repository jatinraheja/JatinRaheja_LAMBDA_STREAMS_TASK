import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average_Cal {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(12, 44, 54, 95, 76);
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        }
        else {
            System.out.println("-1");
        }
    }
}
