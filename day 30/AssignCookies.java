import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Greed factors
        Arrays.sort(s); // Cookie sizes

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; // content child
            }
            j++; // move to next cookie
        }
        return i; // number of content children
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};  // greed factor
        int[] s = {1, 1};     // cookie size

        int result = findContentChildren(g, s);
        System.out.println("Max number of content children: " + result);
    }
}
