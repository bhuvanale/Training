import java.util.Arrays;
import java.util.Scanner;

class Item {
    int weight, value;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of items:");
        int n = s.nextInt();
        Item[] items = new Item[n];

        System.out.println("Enter value and weight of each item:");
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            int weight = s.nextInt();
            items[i] = new Item(value, weight);
        }

        System.out.println("Enter capacity of knapsack:");
        int capacity = s.nextInt();

        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));

        double maxValue = 0.0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                maxValue += item.value;
                System.out.println("Took full item with value " + item.value + " and weight " + item.weight);
            } else {
                maxValue += item.value * ((double)capacity / item.weight);
                System.out.println("Took " + capacity + "/" + item.weight + " of item with value " + item.value);
                break;
            }
        }

        System.out.printf("Maximum value in knapsack: %.2f\n", maxValue);
        s.close();
    }
}
