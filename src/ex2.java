import java.util.LinkedList;
import java.util.Queue;

public class ex2 {
    public static int resto(int n, int p) {
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 1; i <= n; i++) fila.add(i);

        while (fila.size() > 1) {
            for (int i = 1; i < p; i++) {
                fila.add(fila.remove());
            }
            fila.remove();
        }

        return fila.peek();
    }

    public static void main(String[] args) {
        int total = 10;
        int passo = 3;
        System.out.println("Sobrou: " + resto(total, passo));
    }
}
