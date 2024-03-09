    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
import java.util.Scanner;

public class atv2 {


    static int lerNumeros(String texto){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println(texto);
        int num = Integer.parseInt(leitor.nextLine());
        return num;
    }

        static int somar(int a, int b, boolean mostrar){
            int soma = a+b;
            if(mostrar){
    System.out.println("A soma de "+a+" + "+b+" é "+soma);
            }
            return soma; 
    }
    public static void main (String[] args){
    
    // Scanner leitor = new Scanner(System.in);

    // int num1= lerNumeros("Digite o primeiro número: ");
    // int num2= lerNumeros("Digite o segunda número: ");

    // System.out.println(somar(num1,num2,true));

    float[]numeros = new float[5];

    numeros[0]=System.out.println("Digite número(1) ");




    }
}
