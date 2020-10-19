public class saipattern
{
public static void main(String[] args)
{
int n=6,m=10,i,j;
for(i=0;i<=n;i++)
{
for(j=0;j<=2;j++)
{
if((i==0||i==4||i==2)||(i==1 && j==0) || (i==3 && j==2))
{
System.out.print("* ");

}
else
{
System.out.print("  ");
}
}
for(j=5;j<=6;j++)
{
if(i==0 || i==2 || j==5 || j==6)
{
System.out.print("* ");
}
else if(i==5 || i==6)
{
System.out.print("  ");
}
else
{
System.out.print("  ");
}
}
for(j=9;j<=m;j++)
{
if(i==0 || i==4 || j==10)
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