package level_0;

import java.util.Arrays;

//예각
public class Solution_18_1 {
    public int solution1(int angle) {
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }

    public int solution2(int angle) {
        if (angle > 0 && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle > 90 && angle < 180) return 3;
        else return 4;
    }
}




