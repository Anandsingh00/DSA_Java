package Arrays;

public class markslessthan35 {

	public static void main(String[] args) {
		int arr [] = {20,32,20,79,80,89,50,79,91,89,99};
		for(int i = 0 ; i <= arr.length -1 ; i++) {
			if(arr [i]<35) {
				System.out.println(i);
			}
		}

	}

}
