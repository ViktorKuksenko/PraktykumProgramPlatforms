import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        range(first, last);
        System.out.println( range(first, last));
    }
    static int range(int startNum, int endNum) {
        if(startNum > endNum) {
            return 1;
        }
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        return sum;
    }
}
