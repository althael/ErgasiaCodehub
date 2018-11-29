package DiaxeirishAsfaleiwn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Ergasia1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/myfinaldb?verifyServerCertificate=true&useSSL=false";
        String username = "root";
        String password = "exoilara21";


        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        int choice=0;
        boolean run=true;
        String s="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in =pliktrologio siskeui eisodou dedomenon,
       // do {
            System.out.println("**********************************************************");
            System.out.println("** Programma Ektypwshs information Asfaleiwn **");
            System.out.println("*Select Factionality to perform*");
            System.out.println("1.Vehicle Insurance Status");
            System.out.println("2.Forecoming Expiries");
            System.out.println("3.Expiries By Plate");
            System.out.println("4.Eksodos Apo To Programma");
            System.out.println("Dwse Epilogi:1-4");
            System.out.println("**********************************************************");
            try {
                s = br.readLine();
                choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
            }
            catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
            {
                System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
            }
            switch(choice)
            {
                case 1:
                   // choosetype();
                    printStatus();
                    break;
                case 2:
                   // choosetype();
                    printForecomingExp();
                    break;
                case 3:
                   // choosetype();
                    printExpByDate();
                    break;
                case 4:
                    run=false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("____You gave wrong input, insert 1-4____");
                    break;
            }

           // } while (run);

        }
        public static void printStatus() {
        String plate=readplate();
        //to do the rest print status !!!!!!!!!!!
        }
        public static String readplate() {
            String plate="";
            boolean valid;
            do{
                Scanner scan = new Scanner(System.in);
                System.out.println("\nInsert a vehicle’s plate to show the status of its insurance\n" +
                        "The plate’s pattern should be provided in “ ABC-1234 ” format.\n\n");
                plate = scan.nextLine();
                plate=plate.toUpperCase();
                valid =checkplate(plate);
                System.out.println("the  input is " + plate);
            }while ( !valid );
            return plate;
        }
        public static boolean checkplate(String plate){
                    if(plate.matches("[A-Z]{3}[-]{1}[0-9]{4}")){
                        System.out.println("\nyou gave CORRECT the plate \n");
                        return true;
                    }
                    else{
                        System.out.println("\nyou gave wrong the plate! try again please\n");
                        return false;
                    }
        }

        public static void printForecomingExp(){
        int days=readDays();
            System.out.println("days___________________ are:"+days);
        }
        public static int readDays() {
            boolean valid =false;
            String days="";
            int days1=-1;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("\n______________________________________________________________\n" +
                        "to show which insurances are going to expire the next X days" +
                        "\n______________________________________________________________\n" +
                        " insert a number of days please");
                valid=scan.hasNextInt();
                days =scan.nextLine();
                if (valid){
                    days1 = Integer.parseInt(days);
                    System.out.println("days1 !!!!!!!!!!!!!!!!!! ="+days1);
                }
                else
                    System.out.println("you gave wrong input try again!");
            }
            while(!valid);
            return days1;
        }

        public static void printExpByDate(){
            System.out.println("//to do");
        }

        public static int choosetype(){
            String s1="";
            int choice1=0;
            int typeExport=0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in =pliktrologio siskeui eisodou dedomenon,
            System.out.println("Enter Export Type ");
                System.out.println("1. File");
                System.out.println("2. Console");
                try {
                    s1 = br.readLine();
                    choice1 = Integer.parseInt(s1); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
                }
                catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                {
                    System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                }
                if (choice1==1){
                    typeExport=1;
                }
                else if (choice1==2){
                    typeExport=2;                    }
                else {
                    System.out.println("you made a mistake, type 1 or 2 ");
                }
                return typeExport;
            }

    }
