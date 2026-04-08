import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("LeetCode");

        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', 'b');
        System.out.println(map.containsValue('b'));
    }
}