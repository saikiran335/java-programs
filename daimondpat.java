public class daimondpat
{
public static void main(String[] args)
{
int n=7,i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==3 || j==3 || (i==1  && j==2) || (i==4  && j==2) || (i==1  && j==4) || (i==4  && j==4) || (i==2  && j==1) || (i==2  && j==2) || (i==2  && j==4) || (i==2  && j==5) || (i==4  && j==1)|| (i==4  && j==5)|| (i==5  && j==2)|| (i==5  && j==4))
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