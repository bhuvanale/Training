import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Activity{
    int start,end;
    public Activity(int s,int e){
        this.start=s;
        this.end=e;
    }

}

public class ActiviySelection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter number of activities: ");
        int n = s.nextInt();
        Activity[] act = new Activity[n];
        System.out.println("enter activities:(start,end) ");

        for(int i =0;i<n;i++){
            int start = s.nextInt();
            int end = s.nextInt();
            act[i] = new Activity(start, end);
        }

        Arrays.sort(act,Comparator.comparingInt(a -> a.end));

        int count =0,lastEnd = -1;

        for (Activity activity : act) {
            if(activity.start >= lastEnd){
                System.out.println("Activity: ("+activity.start+" , "+activity.end+")");
                count++;
                lastEnd = activity.end;
            }
        }

        System.out.println("Max activities: "+count);
        s.close();
    }
}
