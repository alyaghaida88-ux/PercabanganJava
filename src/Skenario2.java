
import java.util.Scanner;
public class Skenario2 {
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    
    String statusMember;
    System.out.println("Masukkan status member anda:");
    statusMember= sc.next();

    if(statusMember.equalsIgnoreCase("GOLDEN")){
    System.out.println("Diskon 20%");    
    }
        else if(statusMember.equalsIgnoreCase("SILVER")){
            System.out.println("Diskon 15%");
        }
        else if(statusMember.equalsIgnoreCase("BRONZE")){
        System.out.println("Diskon 10%");
        }
        else
        System.out.println("Tidak ada diskon");
    sc.close();
    }
    }
