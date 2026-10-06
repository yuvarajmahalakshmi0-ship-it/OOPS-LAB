import java.util.Random;
class RandomThread extends Thread{
public void run(){
Random r=new Random();
int n=r.nextInt(10)+1;
System.out.println("generated number:"+n);
if(n%2==0){
squareThread t2=new squareThread(n);
t2.start();
}else{
cubeThread t3=new cubeThread(n);
t3.start();
}
}
}
class squareThread extends Thread{
int n;
squareThread(int n){
this.n=n;
}
public void run(){
System.out.println("square of "+n+"="+(n*n));
}
}
class cubeThread extends Thread{
int n;
cubeThread(int n){
this.n=n;
}
public void run(){
System.out.println("Cube of "+n+"="+(n*n*n));
}
}
public class multi{
public static void main(String[]args){
RandomThread t1=new RandomThread();
t1.start();
}
}

