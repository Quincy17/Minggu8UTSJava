import java.util.Scanner;

public class uts{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sudut1,sudut2,sudut3,total;
        System.out.print("Masukkan Sudut Pertama: ");
        sudut1 =input.nextInt();
        if(sudut1>0 && sudut1<180){
            System.out.print("Masukkan Sudut Kedua: ");
            sudut2 =input.nextInt();
            if(sudut2>0 && sudut2<180){
                System.out.print("Masukkan Sudut Ketiga: ");
                sudut3 =input.nextInt();
                if(sudut3>0 && sudut3<180){
                    total=sudut1+sudut2+sudut3;
                    if(total==180){
                        if(sudut1==sudut2 || sudut2==sudut3 || sudut1==sudut3){
                            System.out.println("SIKU-SIKU");
                        }else{
                            System.out.println("BUKAN SIKU-SIKU");
                        }
                    }else{
                        System.out.println("Bukan Segitiga");
                    }
                }else{
                    System.out.println("Sudut tidak sesuai");
                }
            }else{
                System.out.println("Sudut tidak sesuai");
            }
        }else{
            System.out.println("Sudut tidak sesuai");
        }
        
        
    }
}