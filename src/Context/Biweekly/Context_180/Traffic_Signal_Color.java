// Problem: Traffic Signal Color
// Link: https://leetcode.com/problems/traffic-signal-color/description/
// Time: O(1)
// Space: O(1)

package Context.Biweekly.Context_180;

public class Traffic_Signal_Color {
    // It's very easy problem to solve, It took O(1) time and space
    public String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        else if(timer == 30) return "Orange";
        else if(timer > 30 && timer <= 90) return "Red";
        else return "Invalid";
    }
}
