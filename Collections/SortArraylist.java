import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        int n = 3;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                row.add(sc.nextInt());
            }
            al.add(row);
        }

        Collections.sort(al, (a, b) -> b.get(0) - a.get(0));

        for (ArrayList<Integer> row : al) {
            System.out.println(row);
        }
    }
}
