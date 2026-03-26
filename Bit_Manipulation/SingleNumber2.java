package Bit_Manipulation;

import java.util.HashMap;
import java.util.Map;
public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele:nums){
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele,1);
        }

        for(int key: map.keySet()){
            int freq = map.get(key);
            if(freq == 1) return key;
        }

        return 0;
    }
}
