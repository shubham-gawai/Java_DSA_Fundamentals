package practiceQuestions;
public class frequency {

	public static void main(String[] args) {
		int arr[] = {1,0,1,1,1,0};
		int n = arr.length;
		int count =0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j] && arr[i]==1 &&arr[j]==1) {
					count++;
				}
			}
			
			System.out.println(count);
			break;
		}
		
	}

}
