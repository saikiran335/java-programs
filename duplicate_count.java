public class duplicate_count
{
public static void main(String[] args)
{
int[] arr=new int[]{1,2,3,1,3,4,5,4};
int i,j;
int count=0;
for(i=0;i<arr.length;i++)
{
for(j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
System.out.print(arr[i]+ " ");
}
}
}
if(count>0)
{
System.out.println("\n"+count);
}
else
{
System.out.println("no duplixccate elements");
}
}}