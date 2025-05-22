import java.util.Stack;

public class ex1 {
    public static int diasEstaveis(int[] v) {
        int d = 0;
        boolean mudou = true;

        while (mudou) {
            Stack<Integer> temp = new Stack<>();
            temp.push(v[0]);
            mudou = false;

            for (int i = 1; i < v.length; i++) {
                if (v[i] > v[i - 1]) {
                    mudou = true;
                } else {
                    temp.push(v[i]);
                }
            }

            int[] novo = new int[temp.size()];
            for (int i = temp.size() - 1; i >= 0; i--) {
                novo[i] = temp.pop();
            }

            v = novo;

            if (mudou) {
                d++;
            }
        }

        return d;
    }

    public static void main(String[] args) {
        int[] dados = {30, 25, 40, 20, 35, 50, 45};
        System.out.println("Estabilizou em " + diasEstaveis(dados) + " dias.");
    }
}
