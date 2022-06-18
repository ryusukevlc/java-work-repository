import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<String> array = Arrays.asList("hello", "good morning", "good night");
        List<String> stringList = new ArrayList<>(array);

        stringList.forEach(greeting -> System.out.println(greeting));

        stringList.forEach(greeting -> {

            System.out.println("英語の挨拶：" + greeting);

        });
        

    }

}