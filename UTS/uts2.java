import java.util.Scanner;

public class uts2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,total,count;
        total=0;
        System.out.print("Masukkan N: ");
        N = input.nextInt();
        if(N>0){
            for(int i=1;i<=N;i++){
                count=i*i;
                total=total+count;
            }
            System.out.println("Penjumlahan " + N +  " bilangan kuadrat pertama adalah = " +total);
        }else{
            System.out.println("N Harus Positif");
        }
    }
}