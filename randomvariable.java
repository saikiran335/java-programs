import java.lang.Math;
public class randomvariable
{
public static void main(String[] args)
{
int a=10;
int b=20;
System.out.println("printing random variable in the range");
int x=(int)(Math.random()*(b-a+1)+a);
int y=(int)(Math.random()*(b-a+1)+a);
System.out.println(x+"  "+y);
}}