class SharedData{
private int value;
private boolean available=false;
synchronized void product(int value){
while(available){
try{
wait();
}catch (InterruptedException e){
Thread.currentThread().interrupt();
}
}
this.value=value;
available=true;
System.out.println("produced:"+value);
notify();
notifyAll();
}
synchronized void consume(){
while(!available){
try{
wait();
}catch (InterruptedException e){
Thread.currentThread().interrupt();
}
}
System.out.println(
Thread.currentThread().getName()+"consumed:"+value);
available=false;
notify();
}
}
class producer extends Thread{
SharedData data;
producer(SharedData data){
this.data=data;
}
public void run(){
for(int i=1;i<=5;i++){
data.product(i);
}
}
}
class consumer extends Thread{
SharedData data;
consumer(SharedData data,String name){
super(name);
this.data=data;
}
public void run(){
for(int i=1;1<=3;i++){
data.consume();
}
}
}
public class inter{
public static void main(String[]args){
SharedData data=new SharedData();
producer p=new producer(data);
consumer c1=new consumer(data,"consumer-1");
consumer c2=new consumer(data,"consumer-2");
p.start();
c1.start();
c2.start();
}
}

