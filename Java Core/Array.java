public class Array {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        int nums1[] = new int[4];

        // enhanced for loop
        for (int i : nums1) {
            System.out.println(i);
        }

        int nums2[][] = new int[3][3];

        for(int i= 0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(nums2[i][j]);
            }
            System.out.println();
        }

        for (int[] is : nums2) {
            for (int js : is) {
                System.out.print(js);
            }
            System.out.println();
        }


    }
}
