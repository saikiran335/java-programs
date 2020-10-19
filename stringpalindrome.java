import java.util.Scanner;
public class stringpalindrome
{
public static void main(String[] args)
{
String original,reverse="";
Scanner s=new Scanner(System.in);

original=s.nextLine();

int length=original.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+original.charAt(i);
}

if(original.equals(reverse))

{
System.out.println(original+ " is palindrome");
}
else
{
System.out.println(original+ "is not a palindrome");
}
}}