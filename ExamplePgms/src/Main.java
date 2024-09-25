import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate remove=new RemoveDuplicate();
        remove.removeElement();
        RotateArray rotate=new RotateArray();
        MoveAllZerosToTheEndOfTheArray moveAllZerosToTheEndOfTheArray=new MoveAllZerosToTheEndOfTheArray();
        RearrangeArray rearrangeArray=new RearrangeArray();
        long[] arr = {1, 2, 3, 4, 5, 6};
        rearrangeArray.rearrange(arr, arr.length);

        // Print the rearranged array
        System.out.println(Arrays.toString(arr));
    }

}
class RemoveDuplicate{
    public int removeElement(){
        int[] nums={1,1,2,2};
        ArrayList<Integer> ans = new ArrayList<Integer>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                i++;
                ans.add(nums[i]);

                System.out.println(ans.toString());
            }
            else {
                ans.add(nums[i+1]);
            }

        }
        return ans.size();
    }
}

class RotateArray{
    public RotateArray() {
        int[] arr={1,4,2,3,5,3};
        int d=12;
        int j=d%arr.length;

        int[] temp=new int[arr.length];
        int ans=0;
        int second=j;
        while(second<arr.length) {
            temp[ans] = arr[second];
            second++;
            ans++;

        }
        for(int i=0;i<j;i++){
            temp[ans]=arr[i];
            ans++;
        }
        arr=temp;
        System.out.println(Arrays.toString(arr));
    }
}

class MoveAllZerosToTheEndOfTheArray{
    public MoveAllZerosToTheEndOfTheArray(){
        int arr[]={0,6,9,0,32,0,7,0,0,0,4};
        int temp[]=new int[arr.length];
        int i=0;
        int ans=0;
        while(i<arr.length){
            if(arr[i]!=0){
                temp[ans]=arr[i];

                ans++;
            }
            i++;
        }

        arr=temp;
        System.out.println(Arrays.toString(arr));
    }
}

class RearrangeArray{

    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public void rearrange(long arr[], int n){

        // Your code here
        long []temp=new long [n];
        int max=arr.length-1;
        int min=0;
        int i=0;
        int j=1;
        while(i<n){
            temp[i]=arr[max];
            max--;
            i=i+2;
        }
        while(j<n){
            temp[j]=arr[min];
            min++;
            j=j+2;

        }
        for(int ans=0;ans<n;ans++){
            arr[ans]=temp[ans];
        }

    }

}
