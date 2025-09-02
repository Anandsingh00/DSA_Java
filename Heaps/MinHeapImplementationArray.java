package Heaps;

class MinHeap {
	int[] arr;
	int size;

	MinHeap(int capacity) {
		arr = new int[capacity];
		size = 0;
	}
	//add method
	public void add(int num) {
		if(size==arr.length) throw new Error("Heap is full");
		// 1.add the element
		arr[size++] = num;
		// 2.upheapify
		upheapify(size - 1);

	}

	public void upheapify(int idx) {
		if (idx == 0)
			return;
		int parent = (idx - 1) / 2; // for parent index -> (c-1)/2

		if (arr[idx] < arr[parent]) {
			swap(idx, parent);
			upheapify(parent);
		}
	}

	public void swap(int i, int j) { //pass the index for using swap function
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//size method
	public int getSize() {
		return size;
	}

	//peek method
	public int peek() {
		if(size>0) {			
		return arr[0];
		}
		else throw new Error("Heap is Empty");
	}
	
	public int remove()  throws Exception{
		if(size==0) throw new Exception("Heap is empty");
		int peek = arr[0];
		swap(0,size-1);
		size--;
		downHeapify(0);
		return peek;
	}
	public void downHeapify(int i) {
		if(i>=size-1) return ;
		int lc = 2*i+1, rc = 2*i+2 ; //lc->left child & rc->right child
		int minIdx = i;
		if(lc<size && arr[minIdx]>arr[lc])minIdx = lc;
		if(rc<size && arr[minIdx]>arr[rc]) minIdx = rc;
		if(i==minIdx)return ;
		swap(i,minIdx);
		downHeapify(minIdx);
	}
}

public class MinHeapImplementationArray {

	public static void main(String[]args) throws Exception {
		MinHeap pq = new MinHeap(10);
		
		pq.add(1);
		pq.add(6);
		pq.add(2);
		pq.add(-1);
		pq.add(-10);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}
