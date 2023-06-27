
public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = { -1,0,1, 2, 4, 5 };
		//int a[] = { 1, 2, 4, 5 };
		// 1+2+4+5=12
		// 1+2+3+4+5=15
		// 15-12=3;
		
		int sum=0;
		for(int i=0;i<a.length;i++)
				
		{
			sum=sum+a[i];
						
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1;j<=5;j++)
		{
			sum1= sum1+j;
		}
		System.out.println(sum1);
System.out.println("missing no is "+ (sum1-sum));
	}

}

---------------------------------------------
	public class FindMissingNumberIn2Array{
    public static List<Integer> findMissingNumbers(int[] firstArray, int[] secondArray) {
        List<Integer> missingNumbers = new ArrayList<>();
        
        // Convert the first array to a set for efficient lookup
        Set<Integer> firstSet = new HashSet<>();
        for (int num : firstArray) {
            firstSet.add(num);
        }
        
        // Iterate over the second array
        for (int num : secondArray) {
            // Check if the number is present in the first array
            if (!firstSet.contains(num)) {
                missingNumbers.add(num);
            }
        }
        
        return missingNumbers;
    }
    
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 3, 5, 6, 7};
        List<Integer> missingNumbers = findMissingNumbers(firstArray, secondArray);
        
        System.out.println("Missing numbers: " + missingNumbers);
    }
}

