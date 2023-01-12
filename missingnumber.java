import java.util.Scanner;
//https://leetcode.com/problems/missing-number/description/
public class missingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        missingnumber ob=new missingnumber();
        System.out.println(ob.missingNumber(nums));
    }
    public int missingNumber(int[] nums) {
        cyclicsort(nums);
        return(find(nums));
    }
    static int find(int[] ar){
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=i)
                return i;

        }
        return ar.length;
    }

    static void cyclicsort(int[] ar){
        int i=0;
        while(i<ar.length){
            int c=ar[i];
            if(ar[i]<ar.length && ar[c]!=ar[i])
                swap(ar,i,c);
            else
                i++;
        }
    }

    public static void swap(int[] ar,int i,int j){
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }
}


