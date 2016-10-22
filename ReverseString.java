import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseString
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
int n=s.length();
char[] c=s.toCharArray();
char[] ch=new char[n];
int j=n-1;
for(int i=0;i<n;i++)
{
ch[i]=c[j];
j--;
System.out.print(ch[i]);
}
}
}
