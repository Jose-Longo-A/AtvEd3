import java.util.LinkedList;

public class ex3 {
    public static LinkedList<Integer> fundir(LinkedList<Integer> a, LinkedList<Integer> b) {
        LinkedList<Integer> r = new LinkedList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                r.add(a.get(i));
                i++;
            } else {
                r.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) r.add(a.get(i++));
        while (j < b.size()) r.add(b.get(j++));

        return r;
    }

    public static void main(String[] args) {
        LinkedList<Integer> u = new LinkedList<>();
        LinkedList<Integer> v = new LinkedList<>();

        u.add(1); u.add(3); u.add(5);
        v.add(2); v.add(4); v.add(6);

        LinkedList<Integer> z = fundir(u, v);
        System.out.println("Final: " + z);
    }
}
