import java.util.*;
public class Arrays{
    public static void main(String[] args) {//7th of june 2025
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //Reading the elements
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //traversing and printing the elements of an array!
        System.out.println("PROBLEM-1");
        System.out.println("The Elements in the array are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();


        //Max and Min
        System.out.println("PROBLEM-2");
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("Max: "+max+" and Min: "+min);


        //sum and average of the elements
        System.out.println("PROBLEM-3");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        System.out.println("Sum: "+sum+" and Avg: "+avg);

        
        //Reversing an array in place and printing it!
        System.out.println("PROBLEM-4");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
        System.out.println("Reversed Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        

        //Linear search and printing the index if found or -1 if not
        System.out.println("PROBLEM-5");
        System.out.println("Enter the target element to search");
        boolean found=false;
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element "+target+" - Found at: "+i);
                found=true;break;
            }
        }if(!found) System.out.println("Not Found!");


        //Majority element
        System.out.println("PROBLEM-5");
        boolean flag=false;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i])count++;
            }if(count>arr.length/2) {
                System.out.println("Majority Element: "+arr[i]); 
                flag=true; break;
                }
        }if(!flag)System.out.println("No Majority Element found!");


        //second larges element
        System.out.println("PROBLEM-6");
        if(arr.length<2){System.out.println("No second largest element"); return;}
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2&&arr[i]!=max1){
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE)System.out.println("No second largest found!!");
        else
        System.out.println("Second Largest Element: "+max2);


        //Missing number in sequence
        //Input 1-(n+1) elements
        System.out.println("PROBLEM-7"); 
        int total=((n+1)*(n+2))/2;
        int summ=0;
        for(int i=0;i<n;i++){
            summ+=arr[i];
        }
        if(summ==total) System.out.println("No missing element!!");
        else System.out.println("Missing element is: "+(total-sum));


       //finding duplicates 
    System.out.println("PROBLEM-8");
       for(int i=0;i<n;i++){
            boolean isDup=false;
            boolean alreadyPrinted=false;
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i]){
                    alreadyPrinted=true;
                    break;
                }
            }
            if(alreadyPrinted)continue;
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    isDup=true;
                }
            }if(isDup)System.out.println("Duplicate Element: "+arr[i]);
      }

        //left rotating array by one
        System.out.println("PROBLEM-9");
        int firstEl=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }arr[arr.length-1]=firstEl;
        System.out.println("Left rotated array(by one): ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


        //Maximum consequtive One's in the array
        System.out.println("PROBLEM-10");
        int cout=0;
        int maxCout=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) cout++;
            else{
                maxCout=Math.max(maxCout,cout);
                cout=0;
            } 
        }
        maxCout=Math.max(maxCout,cout);
        System.out.println("Maximum consequtive one's: "+maxCout);


        //Moving zeroes to end without changing the order
        System.out.println("PROBLEM-11");
        for(int i=0,j=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("After pushing all zeroes to end: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    
}
