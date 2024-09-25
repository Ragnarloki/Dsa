import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicate remove=new RemoveDuplicate();
        remove.removeElement();
        RotateArray rotate=new RotateArray();
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
        int d=10;
        int j=d%arr.length;

        int[] temp=new int[arr.length];
        int ans=0;
        int second=j;
        while(second<arr.length) {
            temp[ans] = arr[second];
            second++;
            ans++;

            System.out.println(Arrays.toString(temp));
        }
        for(int i=0;i<j;i++){
            temp[ans]=arr[i];
            ans++;
            System.out.println(Arrays.toString(temp));
        }

        System.out.println(Arrays.toString(temp));
    }
}