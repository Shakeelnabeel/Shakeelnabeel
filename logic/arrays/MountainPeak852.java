package logic.arrays;   //  SUBMITTED

public class MountainPeak852 {
    public static void main(String[] args) {
        int[] num = new int[]{0,10,5,2};
        System.out.println(peak(num));
    }

    private static int peak(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i <= j)
        {
            int mid = i+(j-i)/2;
            if(arr[mid] < arr[mid+1]) i = mid+1;
            else j = mid-1;
        }
        return i;
    }
}
