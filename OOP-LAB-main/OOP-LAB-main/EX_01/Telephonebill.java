import java.util.Scanner;
class Telephonebill{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int cno,minutes;
  String name, type;
  double bill = 0;
  System.out.print("enter customer number:");
  cno = sc.nextInt();
  sc.nextLine();
  System.out.print("enter customer name:");
  name = sc.nextLine();
  System.out.print("enter current month call duration(minutes):");
  minutes = sc.nextInt();
  sc.nextLine();
  System.out.print("enter connection type (Prepaid/Postpaid):");
  type = sc.nextLine();
  if(type.equalsIgnoreCase("Prepaid")){
     if(minutes<=100)
         bill = minutes*1;
     else if(minutes<=200)
         bill = 100*1+(minutes-100)*1.5;
      else
         bill = 100*1+100*1.5+(minutes-200)*2;
 }
 else if(type.equalsIgnoreCase("Postpaid")){
      if(minutes<=100)
         bill = minutes*0.75;
      else if(minutes<=200)
          bill=100*0.75+100*1.25+(minutes-200)*1.75;
  }
  else{
       System.out.println("invalid connection type");
       return;
    }
    System.out.println("\n-----Telephone bill-----");
    System.out.println("customer number:"+cno);
    System.out.println("customer name:"+name);     
    System.out.println("connection type:"+type);
    System.out.println("call duration:"+minutes+"minutes");
    System.out.println("total bill:RS."+bill);
  }
}
