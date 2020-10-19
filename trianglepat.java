public class trianglepat
{
public static void main(String[] args)
{
int rows=2,col=4,i,j;
for(i=0;i<=rows;i++)
{
for(j=0;j<=col;j++)
{
if(i==rows)
{
System.out.print("* ");
}
else if(i==rows-1 && (j % 2)!=0)
{
System.out.print("* ");
}
else if(i==0 && j==2)
{
System.out.print("* ");
}

else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}