public class squarepat
{
public static void main(String[] args)
{
int rows=5,i,j;
for(i=0;i<=rows;i++)
{
for(j=0;j<=rows;j++)
{
if(i==0||j==0||i==rows||j==rows)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();

}
}

}
