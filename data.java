// project 02
//for Per month Rental & liveing cost Ammount.
package mainp;
import java.util.Scanner;
public class data{
    public static void main(String[] args) {
        System.out.println("\n\n\t\t</ Welcome To Projrct 2.0 />");
        System.out.println("\n\tProgram: Living Cost & Rest Ammount Count");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("Monthly Salary in Euro => ");
        Scanner salary = new Scanner(System.in);
        int Salary = salary.nextInt();
        System.out.println("-------------------------------------------");
        System.out.print("\nHouse Rental Type: [weekly: '7'], [Half-Month: '15'], [Full-Month: '30']\n\n=> "); // Type Of Rent
        Scanner rent_type = new Scanner(System.in);
        int Rent_Type = rent_type.nextInt();
        System.out.println("-------------------------------------------");
        int R_T [] = new int [1];
        String R_W [] = new String [1];
        if (Rent_Type == 7) {
            R_T[0] = 4;
            R_W[0] = "Weekly";
        }
        else if(Rent_Type == 15) {
            R_T[0]= 2;
            R_W[0] = "Half-Month";
        }
        else if(Rent_Type == 30) {
            R_T[0]= 1;
            R_W[0] = "Full-Month";
        }
        else {
            System.out.println("Invalid Choice!");
        }
        System.out.print("\n'"+R_W[0]+"' Rental Ammount=> "); // Rent_Ammount
        Scanner rent = new Scanner(System.in);
        int Rent = rent.nextInt();
        int Total = (R_T[0] * Rent);
        int s_l = Salary - Total;
        System.out.println("Sallary Left: "+Salary+" - "+Total+" ("+Rent+" x "+R_T[0]+") = "+s_l+".00 Euro");
        System.out.println("-------------------------------------------");
        System.out.print("\nMobile Bill => "); // Mobile Bill
        Scanner mobile_bill = new Scanner(System.in);
        int Mobile_Bill = mobile_bill.nextInt();
        int s_l2 = s_l - Mobile_Bill;
        System.out.println("Sallary Left: "+s_l+" - "+Mobile_Bill+" = "+s_l2+".00 Euro");
        System.out.println("-------------------------------------------");
        System.out.print("\nWifi Bill => "); // wifi Bill
        Scanner wifi_bill = new Scanner(System.in);
        int Wifi_Bill = wifi_bill.nextInt();
        int s_l3 = s_l2 - Wifi_Bill;
        System.out.println("Sallary Left: "+s_l2+" - "+Wifi_Bill+" = "+s_l3+".00 Euro");
        System.out.println("-------------------------------------------");
        System.out.print("\nFood & Beverage => "); // Food & Bevarage
        Scanner food_beverage = new Scanner(System.in);
        int Food_Beverage = food_beverage.nextInt();
        int s_l4 = s_l3 - Food_Beverage;
        System.out.println("Sallary Left: "+s_l3+" - "+Food_Beverage+" = "+s_l4+".00 Euro");
        System.out.println("-------------------------------------------");
        System.out.print("\nOthers Bill => "); // Others
        Scanner others = new Scanner(System.in);
        int Others = others.nextInt();
        int s_l5 = s_l4 - Others;
        System.out.println("Sallary Left: "+s_l4+" - "+Others+" = "+s_l5+".00 Euro");
        System.out.println("-------------------------------------------");
        // summeary Of Total Expensess:
        System.out.println("\n\n\n-------------------Summeary Page:------------------");
        System.out.println("\n-> House Rent ("+Rent+" x "+R_T[0]+") : "+Total+" Euro \n-> Mobile Bill          : "+Mobile_Bill+" Euro\n-> Wifi Bill            : "+Wifi_Bill+" Euro\n-> Food & Beverage Cost : "+Food_Beverage+" Euro\n-> Others Bill          : "+Others+" Euro");
        System.out.println("\n---------------------------------------------------");
        int cost = (Total+Mobile_Bill+Wifi_Bill+Food_Beverage+Others);
        System.out.println("\tTotal Sallary : "+Salary+" Euro/-");
        System.out.println("\n\tTotal Cost    : "+cost+" Euro/-");
        System.out.println("---------------------------------------------------");
        System.out.println("\tSalary Left   : "+(Salary - cost)+".00 Euro/-\n\n\n\n\n\t\tThis Program Was Developed By \n\t\t\t  Finix.IT");
        System.out.println("---------------------------------------------------");
    };
};