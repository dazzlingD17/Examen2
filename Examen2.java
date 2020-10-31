//MARIANA DAZZLING DIAZ DE JESUS
//EXAMEN DE LA UNIDAD 2 USANDO RECURSIVIDAD. 
import java.util.Scanner;

public class Examen2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int [] arrayp = new int[9];
       
        System.out.println("--RECURSIVIDAD CON NUMEROS PARES E IMPARES--");
        for (int i = 0; i <4 ; i++) {
            
            
            System.out.println("Ingresa tu numero PAR");
            arrayp[i]=leer.nextInt();
        }


        for (int j = 4; j <9 ; j++) {
            
            
            System.out.println("Ingresa tu numero IMPAR");
            arrayp[j]=leer.nextInt();
        }
        Numeros(arrayp,0);

    }

    public static void Numeros(int [] array, int nombers){
        if(nombers == array.length){

        }
        else {
            System.out.println(array[nombers]);
            Numeros(array,nombers+1);

        }
    }
}
