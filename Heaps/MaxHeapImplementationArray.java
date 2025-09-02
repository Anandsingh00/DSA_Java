package Heaps;

class MaxHeap {
	int arr[];
	int size;

	MaxHeap(int cap) {
		arr = new int[cap];
		this.size = 0;
	}

	public void add(int num) {
		if (size == arr.length)
			throw new Error("Heap is Full");
		arr[size] = num;
		size++;
		upHeapify(size-1);
	}
	
	public void upHeapify(int idx ) {
		//base case
		if(size==0) return;
		//calculate the parent index
		int parent = (idx-1)/2;
		
		//now compare
		if(arr[idx]>arr[parent]) {
			swap(idx,parent);
			upHeapify(parent);
		}
	}
	public void swap(int i, int j) { //pass the index for using swap function
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//peek function
	public int peek() {
		if(size==0)throw new Error("No elements in the heap");
		return arr[0];
	}
	
	//size method
	public int size() {
		return size;
	}
	
	//remove method
	
	public int remove() {
		if(size==0)throw new Error("Heap is Empty");
		int peek = arr[0] ;
		swap(0,size-1);
		size--;
		downHeapify(0);
		return peek;
	}
	public void downHeapify(int idx){
		if(idx>=size-1) return ;
		int lc = idx*2+1;
		int rc = idx*2+2;
		int maxIdx = idx;
		if(lc<size &&arr[maxIdx]<arr[lc]) maxIdx = lc;
		if(rc<size &&arr[maxIdx]<arr[rc]) maxIdx = rc;
		if(maxIdx == idx)return;
		swap(idx,maxIdx);
		downHeapify(maxIdx);
	}
}

public class MaxHeapImplementationArray {
	public static void main(String[]args) {
		MaxHeap pq = new MaxHeap(5);
		pq.add(1);
		pq.add(6);
		pq.add(2);
		pq.add(-1);
		pq.add(10);

		System.out.println(pq.remove()+" removed");
		System.out.println(pq.peek());
		System.out.println(pq.remove()+" removed");
		System.out.println(pq.peek());
		System.out.println(pq.remove()+" removed");
		System.out.println(pq.peek());
		System.out.println(pq.remove()+" removed");

	}
}
