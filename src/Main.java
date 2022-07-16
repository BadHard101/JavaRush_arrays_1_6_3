import java.util.Scanner;

public class Main {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flag = 0;
        array = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (flag%2==0)
                    array[i][j] = '#';
                else
                    array[i][j] = ' ';
                flag+=1;
            }
            if (n%2==0)
                flag+=1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}