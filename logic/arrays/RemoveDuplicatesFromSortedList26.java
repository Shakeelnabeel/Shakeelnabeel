package logic.arrays;       //SUBMITTED

import java.util.Stack;

public class RemoveDuplicatesFromSortedList26 {
    public static void main(String[] args) {
        int[] num = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(remove(num));
    }

    private static int remove(int[] nums) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (st.peek() != nums[i]) {
                st.push(nums[i]);
            }
        }
        int k = st.size();
        for (int j = k - 1; j >= 0; j--) {
            nums[j] = st.pop();
        }
        return st.size();
    }
}
