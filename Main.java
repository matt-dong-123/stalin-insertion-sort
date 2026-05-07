import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 3, 5, 1233214, 413423, 5553, 14523432, 4, 352)
        );

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                temp.add(list.remove(i));
                i--;
            }
        }

        for (int x : temp) {
            int i = 0;

            while (i < list.size() && list.get(i) <= x) {
                i++;
            }

            list.add(i, x);
        }

        System.out.println(list);
    }
}