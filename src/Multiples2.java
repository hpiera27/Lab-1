public class Multiples2 {
    public static int main(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean div3 = (i % a == 0);
            boolean div5 = (i % b == 0);
            if (div3 || div5) {
                count++;
            }
        }
        return (count);
    }

    public static int main() {
        return main(1000, 3, 5);
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}
