
package tarea1;

public class clsEjercicio1 {
    
    public static char[] sacarVocalesR(int i, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            char aux = array[i];
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'
                    || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                array[i] = ' ';
            }
            return sacarVocalesR(++i, array);//se retorna el dato 
        }
    }
}
