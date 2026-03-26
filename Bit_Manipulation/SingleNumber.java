package Bit_Manipulation;

import java.util.HashMap;
import java.util.Map;
public class SingleNumber {
    public static void main(String[] args) {


    }
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = nums[0];
        for(int i = 1; i< nums.length;i++){
            sum ^= nums[i];
        }

        return sum;

    }
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele:nums){
            if(map.containsKey(ele))map.put(ele,2);
            else map.put(ele,1);
        }

        for(int key: map.keySet()){
            int freq = map.get(key);
            if(freq == 1) return key;
        }

        return 0;
    }
}
