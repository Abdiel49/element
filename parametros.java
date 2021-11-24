import java.util.Arrays;
public class parametros
{
    
    
    public void verNumeros(){
        int numero = 15;
    double decimal = 10.5;
    boolean esPar = true;
    String cadena = "hola mundo";
    int[] arreglo = new int []{123,456,789};
    
        System.out.println("numero original "+Arrays.toString(arreglo));
        System.out.println("numero modificado "+ Arrays.toString(modificarNumero(arreglo)));
        System.out.println("numero depues de modificar "+ Arrays.toString(arreglo));
    
        System.out.println("numero original "+(cadena));
        System.out.println("numero modificado "+ modString(cadena));
        System.out.println("numero depues de modificar "+ (cadena));
    
    }
    
    private int[] modificarNumero(int[] n){
        //n = new int[]{123};
        n[0] = 456889;
        return n;
    }
    
    private String modString(String s){
        s.replace('o', 'F'); 
        
        return s;
    }
}
