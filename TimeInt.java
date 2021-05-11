package tema14;

public class TimeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] stack = new double[50000];
		
		long start;
		
		for(int i =0; i<5; i++) {
		add50k(stack);
		start = System.currentTimeMillis();
		SelectionSort.selectionSort( stack.clone());
		System.out.print(System.currentTimeMillis() - start + " ");
		
		start = System.currentTimeMillis();
		BubbleSort.bubbleSort( stack.clone());
		System.out.print(System.currentTimeMillis() - start+ " ");
		
		start = System.currentTimeMillis();
		MergeSort1.mergeSort( stack.clone());
		System.out.print(System.currentTimeMillis() - start + " ");
		
		start = System.currentTimeMillis();
		QuickSort.quickSort( stack.clone());
		System.out.print(System.currentTimeMillis() - start + " ");
		System.out.println();
		stack = resize(stack);
		}
	}
	
	
	


	public static void add50k(double[] stack) {
		for(int i = 0; i<stack.length;i++)
			stack[i] = (Math.random()*100 + 1);
	}
	
	
	 private static double[]  resize(double[] arr) {

		    return new double[2*arr.length];
		    
		}

}
