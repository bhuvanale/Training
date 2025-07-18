import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of gas stations:");
        int n = s.nextInt();

        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter gas at each station:");
        for (int i = 0; i < n; i++) {
            gas[i] = s.nextInt();
        }

        System.out.println("Enter cost to go to next station:");
        for (int i = 0; i < n; i++) {
            cost[i] = s.nextInt();
        }

        int totalGas = 0, totalCost = 0, tank = 0, start = 0;

        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (totalGas < totalCost) {
            System.out.println("It's not possible to complete the circuit.");
            System.out.println("-1");
        } else {
            System.out.println("Start at station index: " + start);
        }

        s.close();
    }
}
