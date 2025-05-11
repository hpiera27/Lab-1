public class Reduce2 {
    public static int main(int n) {
        int count = 0;
        int i = n;
        while (i > 0) {
            count++;
            if (i % 2 == 0) {
                i = i / 2;
            }
            else {
                i = i - 1;
            }
        }
        return count;
    }
    public static int main() {
        return main(100);
    }
    public static void main(String[] args) {
        System.out.println(main());
    }
}
