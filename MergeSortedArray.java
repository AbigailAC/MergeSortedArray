public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1; // Index to place merged elements in nums1

        // Merge nums1 and nums2 from the end
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }

        // If elements are left in nums2
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merger.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}