import java.util.Scanner;
public class palindrome
{
public static void main(String[] args)
{
int rem,sum=0,temp;
Scanner s=new Scanner(System.in);

int n=s.nextInt();

temp=n;
while(n>0)

{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(temp==sum)
{
System.out.println(temp+" is palindrome");
}
else
{
System.out.println(temp+ "is not a palindrome");
}
}}