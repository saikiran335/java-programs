public class leftrotate
{
public static void main (String[] args)
{
int[] arr=new int[]{1,2,3,4,5,6};
int i,j,first;
int  n=3;
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}
for(i=0;i<n;i++)
{
first=arr[0];
for(j=0;j<arr.length-1;j++)
{
arr[j]=arr[j+1];
}
arr[j]=first;
}
System.out.println();
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}
}
}
