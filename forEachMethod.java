import java.util.ArrayList;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.forEach(name-> System.out.println(name));
    }
}
