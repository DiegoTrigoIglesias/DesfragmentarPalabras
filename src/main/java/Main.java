
import java.util.Scanner;

/**
 * @author DIEGOT secuencial
 */
public class Main {

    public static void main(String[] args) {
        // Metodo scanner para introducir datos desde la consola
        Scanner in = new Scanner(System.in);
        //Declaramos variables
        String texto;
        int contador1 = 0, contador2 = 0, consonantes, espacio = 0, guión = 0, punto = 0, coma = 0;
        
        int vocal_a = 0;
        int vocal_e = 0;
        int vocal_i = 0;
        int vocal_o = 0;
        int vocal_u = 0;

        System.out.println("Introduzca un texto");
        //metodo que obtiene los datos ingresados
        texto = in.nextLine();
        /*Ciclo for que obtiene la longitud de la cadena ingresada o que obtiene la cantidad de letras que tiene la cadena */
        for (int i = 0; i < texto.length(); i++) {
            contador1++;
        }
        for (int i = 0; i < texto.length(); i++) {
            /*Condición que evalua la cadena ingresada en busca de las siguientes vocales*/
            if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
                contador2++;
            }
            if (texto.charAt(i) == ' ') {
                espacio++;
            }
            if (texto.charAt(i) == '-') {
                guión++;
            }
            if (texto.charAt(i) == '.') {
                punto++;
            }
            if (texto.charAt(i) == ',') {
                coma++;
            }
            if (texto.charAt(i) == 'a') {
                vocal_a++;
            }
            if (texto.charAt(i) == 'e') {
                vocal_e++;
            }
            if (texto.charAt(i) == 'i') {
                vocal_i++;
            }
            if (texto.charAt(i) == 'o') {
                vocal_o++;
            }
            if (texto.charAt(i) == 'u') {
                vocal_u++;
            }
        }
        //Resta de las variables contador
        consonantes = contador1 - contador2 - espacio - guión - punto - coma;
        System.out.println(contador1 + " Caracteres ");
        System.out.println(contador2 + " Vocales ");
        System.out.println(vocal_a + " a ");
        System.out.println(vocal_e + " e ");
        System.out.println(vocal_i + " i ");
        System.out.println(vocal_o + " o ");
        System.out.println(vocal_u + " u ");
        System.out.println(consonantes + " Consonantes ");
        System.out.println(espacio + " Espacios ");
        System.out.println(guión + " Guiones ");
        System.out.println(punto + " Puntos ");
        System.out.println(coma + " Comas ");
    }
}
