import java.util.*;
import java.lang.*;
import java.io.*;
public class newts
{

public static void main(String args[])
{
  System.out.println("hello");
  
  System.out.println("hello2");
Scanner p = new Scanner (System.in);
int n=p.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=p.nextInt();
int c[]=new int[n+1];
for(int i=0;i<n;i++)
c[a[i]]++;
for(int i=1;i<=N;i++)
if(!c[i])
System.out.print(i+" ");

}
}
