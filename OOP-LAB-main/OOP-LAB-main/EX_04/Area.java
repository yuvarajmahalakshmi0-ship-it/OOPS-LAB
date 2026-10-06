import java.util.*;
abstract class shape{
public int x,y;
public abstract void printArea();
}
class rectangle extends shape{
public void printArea(){
float area;
area=x*y;
System.out.println("area of rectangle is "+area);
}
}
class triangle extends shape{
public void printArea(){
float area;
area=(x*y)/2.0f;
System.out.println("area of triangle "+area);
}
}

class circle extends shape {
public void printArea(){
float area;
area=(22.0f*x*x)/7.0f;
System.out.println("area of circle "+area);
}
}
public class Area{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter length and breadth:");
int x1=sc.nextInt();
int y1=sc.nextInt();
rectangle r=new rectangle();
r.x=x1;
r.y=y1;
r.printArea();
triangle t=new triangle();
t.x=x1;
t.y=y1;
t.printArea();
circle c=new circle();
c.x=x1;
c.printArea();
sc.close();
}
}



