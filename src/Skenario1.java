import java.util.Scanner;
public class Skenario1 {
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);

    int nilai;
    System.out.println("Masukkan Nilai:");
    nilai= sc.nextInt();
    
    if(nilai>=85){
        System.out.println("A");
    }
        else if (nilai>=70 && nilai<=84 ){
            System.out.println("B");
        }
        else if (nilai>=55 && nilai<=69){
            System.out.println("C");
        }
        else if (nilai>=40 && nilai<=54){
            System.out.println("D");
        }
        else if(nilai<0 && nilai>100){
            System.out.println("Nilai Tidak Valid");
        }
        else{
            System.out.println("E");
        }
    sc.close();
    }
    }
