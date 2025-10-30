package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[]= {1,4,3,2,8,6,7};
//Sorting the array1
Arrays.sort(array1);
//initialising the loop to traverse through array1
for(int i=1;i<=array1.length-1;i++) {
	//condition to check index is not same as the value in the index
	if(i!=array1[i-1]) {
		System.out.println(i);
		break;
	}
}
	}

}
