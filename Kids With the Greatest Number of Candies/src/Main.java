
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution demo = new Solution();
        List<Boolean> out = demo.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        System.out.println(Arrays.toString(out.toArray()));
    }
}