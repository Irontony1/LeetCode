import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>(candies.length);
        int maxCandy = 0;
        for (int candy : candies) {
            if (candy > maxCandy) {
                maxCandy = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandy) {
                out.add(true);
            } else {
                out.add(false);
            }
        }

        return out;
    }
}
