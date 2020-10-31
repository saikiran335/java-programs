public class frequency
{
public static void main(String [] args)
{
int []arr=new int[]{1,2,1,2,3,4,4,5};
int []fr=new int[arr.length];
int visited=-1;
int i,j;
for(i=0;i<arr.length;i++)
{
int count=1;
for(j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
fr[j]=visited;
}
}
if(fr[i]!=visited)

fr[i]=count;

}
for(i=0;i<arr.length;i++)
{
if(fr[i] != visited)
{
System.out.println(arr[i]+"'s frequency is:"+fr[i]);
}
}
}
}