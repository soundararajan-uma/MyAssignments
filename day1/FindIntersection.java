package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[]= {3,2,11,4,6,7};
int array2[]= {1,2,8,4,9,7};
for(int i=0;i<=array1.length-1;i++) {
	for(int j=0;j<=array2.length-1;j++) {
		if(array1[i]==array2[j]) {
			System.out.println(array1[i]);
		}
	}
}
	}

}
