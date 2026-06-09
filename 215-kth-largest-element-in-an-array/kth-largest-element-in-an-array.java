import java.util.*;

class Solution {
    Random rand = new Random();

    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int randomIndex = low + rand.nextInt(high - low + 1);
            swap(nums, low, randomIndex);

            int index = partition(nums, low, high);

            if (index == target) return nums[index];
            else if (index < target) low = index + 1;
            else high = index - 1;
        }

        return -1;
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && nums[i] <= pivot) i++;
            while (j >= low + 1 && nums[j] > pivot) j--;

            if (i < j) {
                swap(nums, i, j);
            }
        }

        swap(nums, low, j);
        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}