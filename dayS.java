import java.util.Scanner;

public class dayS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of levels: ");
        int n = sc.nextInt();
        int[] levels = new int[n];

        System.out.println("Enter the launch order of levels:");
        for (int i = 0; i < n; i++) {
            levels[i] = sc.nextInt();
        }

        int maxLevel = 0;
        int reward = 0;

        for (int i = 0; i < n; i++) {
            if (levels[i] > maxLevel) {
                reward++;
                maxLevel = levels[i];
            }
        }

        System.out.println("Maximum reward points earned: " + reward);
    }
}