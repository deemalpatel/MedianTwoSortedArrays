public static void main(String[] args) {
		int [] array1 = {2,4,7,9,11};
		int [] array2 = {1,3,4,6,8};
		System.out.print(findMedianSortedArrays(array1, array2));
		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
        {
        	if(nums2.length%2==0) {
            	int first = nums2[nums2.length/2 - 1];
            	int second = nums2[nums2.length/2];
            	return (double)(first+second)/2;
            }
            else {
            	return nums2[nums2.length/2];
            } 
        }
        if (nums2.length == 0)
        {
        	if(nums1.length%2==0) {
            	int first = nums1[nums1.length/2 - 1];
            	int second = nums1[nums1.length/2];
            	return (double)(first+second)/2;
            }
            else {
            	return nums1[nums1.length/2];
            } 
        }
        
        int [] combine = new int [nums1.length + nums2.length];
        double median = 0;
        int pos = 0;
        
        for(int num : nums1) {
        	combine[pos]=num;
        	pos++;
        }
        for(int num : nums2) {
        	combine[pos]=num;
        	pos++;
        }
        
        Arrays.sort(combine);        
       
        if(combine.length%2==0) {
        	int first = combine[combine.length/2 - 1];
        	int second = combine[combine.length/2];
        	median = (double)(first+second)/2;
        }
        else {
        	median = combine[combine.length/2];
        }    
       
        return median;
        
    }
