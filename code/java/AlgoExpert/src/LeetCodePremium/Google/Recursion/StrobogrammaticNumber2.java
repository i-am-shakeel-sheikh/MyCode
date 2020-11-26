package LeetCodePremium.Google.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
A strobogrammatic number is a number that looks the same when
rotated 180 degrees (looked at upside down).

Find all strobogrammatic numbers that are of length = n.
 */
public class StrobogrammaticNumber2 {
    public List<String> findStrobogrammatic(int n) {
        List<String> answer = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');

        return answer;
    }
}