import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCode");

        List<String> list = Arrays.asList("Raja", "Nikola", "Elon");
        list.sort(new StringComparator());
        System.out.println(list);
    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}