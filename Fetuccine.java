package javaapplication8;
import java.util.Scanner;

public class JavaApplication8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int num, numanterior, proxnum;
        
        System.out.printf("Digite o primeiro termo: ");
        int primeiro = a.nextInt();
        System.out.printf("Digite o segundo termo: ");
        int segundo = a.nextInt();
        
        num = segundo;
        numanterior = primeiro;
        proxnum = segundo + primeiro;
        
        System.out.printf("%d \t %d\t", primeiro, segundo);
        
        for(int i=3;i<20;i++){
            if(i%2==0){
                proxnum = num - numanterior;
            }else{
                proxnum = num + numanterior;
            }
            numanterior = num;
            num = proxnum;
            System.out.printf("%d \t", proxnum);
        }
    } 
}
