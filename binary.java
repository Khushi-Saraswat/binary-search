import java.util.*;
public class binary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int beg,end,mid;
        System.out.println("enter the item u want to search");
        int item=sc.nextInt();
        beg=arr[0];
        end=arr[n-1];
        mid=beg+end/2;
        while((beg<=end) && (arr[mid]!=item))
        {
                if(item<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    beg=mid+1;
                }
                mid=(beg+end/2);
        }
        if(arr[mid]==item)
        {
            System.out.println("element is found at:" +mid);
        }
        else{
            System.out.println("element not found");
        }



    }
}