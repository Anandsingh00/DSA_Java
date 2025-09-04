package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class inBuiltMethods {
	public static void main(String[]args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(74,"Anand");
		map.put(164,"Atik");
		map.put(193,"Anish");
		map.put(69,"Dip");
		map.put(123,"Aditya");
		
		System.out.println(map.size());//returns the no. of key value mapping in this map
		Boolean flag = map.containsKey("Anand");
		System.out.println(flag);
		
		Boolean flag1 = map.containsValue(174);
		System.out.println(flag1);
		
	 System.out.println(map.get("Anand"));
	 
	 map.put(74,"Sunny");
	 for(int key: map.keySet()) {
			String val = map.get(key);
			System.out.println(key +" "+ val);
		}
	 
	 map.remove(193);
	 
	 map.clear();
	 for(int key: map.keySet()) {
			String val = map.get(key);
			System.out.println(key +" "+ val);
		}
	}
}
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:  digits) {
        	if(map.containsKey(ele)){ 
        		int freq = map.get(ele);
        	map.put(ele, freq+1);
        }	
        else map.put(ele, 1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =100 ;i<= 999;i++) {
        	int x = i;
        	int c =x%10; x=x/10;
        	int b = x%10; x =x/10;
        	int a =x;
        	
        	if(map.containsKey(a)) {
        		int aFreq = map.get(a);
        		map.put(a,aFreq-1);
        		if(aFreq == 1) map.remove(a);
        		if(map.containsKey(b)) {
        			int bFreq = map.get(b);
            		map.put(b,bFreq-1);
            		if(bFreq == 1) map.remove(c);
        			if(map.containsKey(c)) {
        				ans.add(i);
        			}
        		}
        		map.put(a,aFreq);
        	}
        }
        
        int [] ans2 = new int[ans.size()];
        for(int i =0;i<ans2.length;i++) {
        	ans2[i] = ans.get(i);
        }
        return ans2;
    }
}