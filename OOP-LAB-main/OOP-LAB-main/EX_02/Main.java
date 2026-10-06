package converter;
import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Converter c =new Converter();
System.out.println("***volume converter***");
System.out.println("1.litres");
System.out.println("2.us gallons");
System.out.println("3.imperial gallons");
System.out.println("4.cubic meters");
System.out.println("from unit(1-4):");
int from=sc.nextInt();
System.out.println("enter value:");
double value=sc.nextDouble();
System.out.println("to unit(1-4):");
int to=sc.nextInt();
double result=c.convert(from,to,value);
System.out.println("converted  value= "+result);
sc.close();
}
}

