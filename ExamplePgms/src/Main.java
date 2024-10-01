import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
//        RemoveDuplicate remove=new RemoveDuplicate();
//        remove.removeElement();
        RotateArray rotate=new RotateArray();
//        MoveAllZerosToTheEndOfTheArray moveAllZerosToTheEndOfTheArray=new MoveAllZerosToTheEndOfTheArray();
//        RearrangeArray rearrangeArray=new RearrangeArray();
//        long[] arr = {1, 2, 3, 4, 5};
//        rearrangeArray.rearrange(arr, arr.length);
//
//        // Print the rearranged array
//        System.out.println(Arrays.toString(arr));
//
//        ReverseSubGroup reverseSubGroup=new ReverseSubGroup();
          Solve_Sweet_Problems sweet_problems = new Solve_Sweet_Problems();
          int result= sweet_problems.Problems(16,2,10);
          System.out.println(result);
          Union union=new Union();
          Missing_Array missingArray=new Missing_Array();
          int results=missingArray.missing_Array();
          System.out.println(results);
          EquilibriumPoint equilibriumPoint=new EquilibriumPoint();
          int equilibrium=equilibriumPoint.equilibriumPoint();
          System.out.println("equilibrium: "+equilibrium);
          ConcecutiveOnes concecutiveOnes=new ConcecutiveOnes();
          IntersectionOfTwoSortedArray intersectionOfTwoSortedArray=new IntersectionOfTwoSortedArray();

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

class ReverseSubGroup {

    // Function to reverse every sub-array group of size k.

    public ReverseSubGroup() {
        int[] arr={1,2,3,4,5};
        int temp=0;
        int i=0;
        if (arr.length %2 == 0) {
        while(i<arr.length) {

                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i + 2;

            }



        }
        if (arr.length %2 != 0) {
           while(i<arr.length-3){


                   temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
                       i = i + 2;
              }
           }
        System.out.println(Arrays.toString(arr));

    }
}

class Solve_Sweet_Problems {
    public int Problems(int sweet,int e, int d){
        int n= sweet;
        int i=1;
        int ans=1;
       while(i<=d){
            if(i%7==0 && n<e){
                return -1;
            }

            if(n<e){
                n=n+sweet;
                ans++;
            }
            if(n>=e){
                n=n-e;
                i++;
            }
       }
    return ans;
    }
}

class Union {
    public Union(){
//        int [] arr1={1,2,3,4,5};
//        int [] arr2={1,2,3,4,6};
//        int len1= arr1.length;
//        int len2= arr2.length;
//        int i=0;
//        int j=0;
//        ArrayList<Integer> ans=new <Integer>ArrayList();
//        while(i<len1 && j<len2){
//            if(arr1[i]!=arr2[j]){
//                ans.add(arr1[i]);
//                ans.add(arr2[j]);
//                i++;
//                j++;
//            }
//            if(arr1[i]==arr2[j]){
//                ans.add(arr1[i]);
//                System.out.println(ans);
//                if(i<len1-1){
//                    i++;
//                }
//                if(i<len1-1){
//                    j++;
//
//                }
//            }
//
//        }
        System.out.println("Union ans");
    }
}

class Missing_Array{
      public int missing_Array(){
         int []arr={1,2,3,5};
         int n=5;
         int sum_of_arr=0;
         int ans=n*(n+1)/2;
         for(int i=0;i<n-1;i++){
             sum_of_arr+=arr[i];
         }
         return ans-sum_of_arr;
     }
}

class EquilibriumPoint {
    // arr: input array
    // Function to find equilibrium point in the array.
    public int equilibriumPoint() {
        // Your code here
        int [] arr={1,2,5,2,1};
        int left=0;
        int right=0;
        int n=arr.length;
        int point=2;

        for(int i=point;i<n-1;i++){
            left+=arr[i+1];
        }
        for(int i=point;i>0;i--){
            right+=arr[i-1];
        }
        if(left==right){
            return point;
        }

        return -1;
    }
}

class IndexOfSubarraySum{
    public IndexOfSubarraySum(){
        int [] arr={1,2,3,7,5};
        int n=arr.length;
        int s=12;
        int start=0;
        int end=0;
        int count=0;
        ArrayList<Integer> Ans=new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){

            }
        }

    }
}

class ConcecutiveOnes{
    public ConcecutiveOnes(){
        int [] arr={1,1,1,0,0,1,1,1,0,1,1,1,1};
        int n=arr.length;
        int cnt=0;
        int nofones=0;

        for(int i=0;i<n;i++){
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            nofones= Math.max(nofones, cnt);
        }
        System.out.println("ConcecutiveOnes: "+nofones);
    }
}

class IntersectionOfTwoSortedArray{
    public IntersectionOfTwoSortedArray() {
        int[] arr1 = {1, 2, 3, 3, 5, 6, 7, 9};
        int[] arr2 = {1, 3, 3, 4 ,6, 7, 8 ,9, 10};
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }



        }
        System.out.println(ans);
    }
}

class ValidIp {

    public ValidIp() {
        // Write your code here
        String str="225.22.33.33";
        String ans="";
        int result;
        for(int i=str.length();i>0;i--){

                ans=str.charAt(i)+ans;

            if(parseInt(ans)<=225 && Integer.parseInt(ans)>0){
                System.out.println(ans);
            }
        }
    }
}