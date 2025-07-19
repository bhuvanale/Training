import java.util.*;
class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void jobScheduling(Job[] jobs, int n) {
        // Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find max deadline to create slot array
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slots = new boolean[maxDeadline];
        char[] schedule = new char[maxDeadline];
        int totalProfit = 0;

        for (Job job : jobs) {
            // Try to schedule job in latest available slot before deadline
            for (int j = Math.min(maxDeadline - 1, job.deadline - 1); j >= 0; j--) {
                if (!slots[j]) {
                    slots[j] = true;
                    schedule[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.print("Scheduled Jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slots[i]) {
                System.out.print(schedule[i] + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };
        int n = jobs.length;

        jobScheduling(jobs, n);
    }
}
