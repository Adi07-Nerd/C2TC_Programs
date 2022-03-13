package practiceSession;


public class ArrayRotation {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5};
		
		
		RightRotation(array, 5);
		leftRotation(array, 1);
		
	}
	
	public static void leftRotation(int[] arr,int n)
	{
		System.out.println("Before rotation");
		display(arr);
		for (int i = 0; i < n; i++) {
			int first=arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println("After rotation");
		display(arr);
	}
	
	public static void RightRotation(int[] arr,int n)
	{
		System.out.println("Before Rotation");
		display(arr);
		for (int i = 0; i < n; i++) {
			
			int last=arr[arr.length-1];
			for (int j = arr.length-1; j > 0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println("After rotation");
		display(arr);
	}
	
	public static void display(int[] arr)
	{
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}
}
