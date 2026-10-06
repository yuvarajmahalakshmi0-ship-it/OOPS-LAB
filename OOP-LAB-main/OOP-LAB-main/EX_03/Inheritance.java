import java.util.Scanner;

class Employee {
    String name;
    int id;
    String address;
    String mail;
    String mobile;
    double basicpay;
    double da;
    double hra;
    double pf;
    double fund;
    double grosssalary;
    double netsalary;

    Employee(String name, int id, String address, String mail,
             String mobile, double basicpay) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.mail = mail;
        this.mobile = mobile;
        this.basicpay = basicpay;
    }

    void display() {
        System.out.println("employee name:" + name);
        System.out.println("employee ID:" + id);
        System.out.println("address:" + address);
        System.out.println("mail Id:" + mail);
        System.out.println("mobile number:" + mobile);
    }

    void calculate() {
        da = basicpay * 50 / 100;
        hra = basicpay * 15 / 100;
        pf = basicpay * 12 / 100;
        fund = basicpay * 0.1 / 100;

        grosssalary = basicpay + da + hra + pf + fund;
        netsalary = grosssalary - pf - fund;
    }

    void disp() {
        display();
        calculate();

        System.out.println("basic pay:" + basicpay);
        System.out.println("gross salary:" + grosssalary);
        System.out.println("net salary:" + netsalary);
    }
}


class Programmer extends Employee {

    Programmer(String name, int id, String address, String mail,
               String mobile, double basicpay) {
        super(name, id, address, mail, mobile, basicpay);
    }

    void disp() {
        System.out.println("\n******** PROGRAMMER PAY SLIP ********");
        super.disp();
    }
}


class AssistantProfessor extends Employee {

    AssistantProfessor(String name, int id, String address, String mail,
                       String mobile, double basicpay) {
        super(name, id, address, mail, mobile, basicpay);
    }

    void disp() {
        System.out.println("\n******** ASSISTANT PROFESSOR PAY SLIP ********");
        super.disp();
    }
}


class AssociateProfessor extends Employee {

    AssociateProfessor(String name, int id, String address, String mail,
                       String mobile, double basicpay) {
        super(name, id, address, mail, mobile, basicpay);
    }

    void disp() {
        System.out.println("\n******** ASSOCIATE PROFESSOR PAY SLIP ********");
        super.disp();
    }
}


class Professor extends Employee {

    Professor(String name, int id, String address, String mail,
              String mobile, double basicpay) {
        super(name, id, address, mail, mobile, basicpay);
    }

    void disp() {
        System.out.println("\n******** PROFESSOR PAY SLIP ********");
        super.disp();
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter employee name:");
        String name = in.nextLine();

        System.out.println("enter employee id:");
        int id = in.nextInt();
        in.nextLine();

        System.out.println("enter address:");
        String address = in.nextLine();

        System.out.println("enter mail id:");
        String mail = in.nextLine();

        System.out.println("enter mobile number:");
        String mobile = in.nextLine();

        System.out.println("enter basic pay :");
        double basicpay = in.nextDouble();

        System.out.println("\nchoose designation:");
        System.out.println("1.programmer :");
        System.out.println("2.assistant professor:");
        System.out.println("3.associate professor:");
        System.out.println("4.professor:");
        System.out.println("5.exit");

        System.out.println("enter your choice:");
        int choice = in.nextInt();

        switch (choice) {

            case 1:
                Programmer p = new Programmer(
                    name, id, address, mail, mobile, basicpay
                );
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(
                    name, id, address, mail, mobile, basicpay
                );
                ap.disp();
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor(
                    name, id, address, mail, mobile, basicpay
                );
                asp.disp();
                break;

            case 4:
                Professor prof = new Professor(
                    name, id, address, mail, mobile, basicpay
                );
                prof.disp();
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        in.close();
    }
}
