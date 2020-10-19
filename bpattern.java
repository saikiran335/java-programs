public class bpattern
{
public static void main(String[] args)
{
int n=7,i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n/2;j++)
{
if (i==0|| j==0 ||j==2 || i==3 || i==6)
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