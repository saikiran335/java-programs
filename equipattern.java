public class equipattern
{
public static void main(String[] args)
{
int rows=9,i,j;
for(i=0;i<rows;i++)
{
for(j=0;j<i;j--)
{
if(i==4)
{
System.out.print(" ");
}
else
{
System.out.print("* ");
}
}
}
}
}