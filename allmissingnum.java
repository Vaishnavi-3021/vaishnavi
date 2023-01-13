import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class allmissingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        allmissingnum ob = new allmissingnum();
        System.out.println(ob.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ar = new ArrayList<Integer>();
        cyclicsort(nums);
        ar = find(nums);
        return ar;
    }

    private List<Integer> find(int[] nums) {
        List<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                ar.add(i+1);
        }
        return ar;
    }

    static void cyclicsort(int[] ar) {
        int i = 0;
        while (i < ar.length) {
            int c = ar[i] - 1;
            if ( ar[c] != ar[i])
                swap(ar, i, c);
            else
                i++;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void swap(int[] ar, int i, int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
}
