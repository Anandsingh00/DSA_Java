package Recursion;

public class countNsay {

	public static void main(String[] args) {
	    int prices[] = {7, 1, 5, 3, 6, 4};
	    int n = prices.length;
	    int[] aux = new int[prices.length];

	    // Start loop from n-1 to 1
	   
	    aux[n-1]=prices[n-1];
	    for(int i=n-2;i>0;i--) {
	    	if(prices[i+1]<aux[i+1]) {
	    		aux[i] = aux[i+1];
	    	}
	    	else {
	    		aux[i] = prices[i+1];
	    	}
	    }
	    
	    aux[0] = prices[0];
	      
	    for(int ele:prices) {
	    	System.out.print(ele+" ");
	    }
	    
	    System.out.println();
	    
	    for(int ele:aux) {
	    	System.out.print(ele+" ");
	    }
	    System.out.println();
	    int profit = 0;
        for(int j=0;j<n;j++){
            int x= prices[j] -aux[j];
            if(x<0)x=-x;
            if(x > profit){
                profit = x;
            } 
        }
        System.out.println(profit);
	}
}
