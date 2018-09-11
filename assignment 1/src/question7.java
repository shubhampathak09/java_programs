import java.util.Scanner;

public class question7 {

    public static void main(String args[])
    {

 int l;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length of the array");
        l=s.nextInt();
        int[] a=new int[l];
        System.out.println("enter the elements into the array one by one");
        for(int i=0;i<l;i++)
            a[i]=s.nextInt();
        insertionsort(a);
        for(int i=0;i<l;i++)
            System.out.print(a[i]);
        System.out.println("");
        System.out.print("Printing the even sum..");
        System.out.println(evensum(a));
        if(evensum(a)>15)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void insertionsort(int array[])
    {
        int i,j,key;
        for(i=1;i<array.length;i++)
        {
            j=i-1;
            key=array[i];
            while(j>=0&&array[j]<key)
            {
                array[j+1]=array[j];
                        j--;
            }
            array[j+1]=key;
        }

    }
    public static int evensum(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                sum+=a[i];
            else
                continue;
        }


        return sum;
    }
}
