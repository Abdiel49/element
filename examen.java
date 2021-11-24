import java.util.HashMap;
public class examen
{
    private char[] tableOMN = new char[]{'1','2','3'};
    private HashMap<Character, Integer> hashMap = new HashMap<>();
    
    public int calcularPorcentage(int[] intarr){
        int numerosConRiesgo = recorrerLista(intarr, 0, 0);
        return (int) ((numerosConRiesgo *100)/intarr.length);
    }
    // [ 0000221565, 005, 336441, 55610023 ]
    private int recorrerLista(int[] intarr, int index, int cont){
        int contador = cont;
        if(index >=0 && index < intarr.length){
            int num = intarr[index];
            boolean esMortal = esPeligroMortal( num+"" );
            if(esMortal){
                contador = recorrerLista(intarr, index+1, cont+1);
            }else{
                contador = recorrerLista(intarr, index+1, cont);
            }
        }
        return contador;
    }
    // 022253610226
    // 12123
    // 005
    public boolean esPeligroMortal(String num){
        boolean resp = false;
        esPeligroMortal(num, 0);
        if(hashMap.size() == 3){
            resp = true;
        }
        hashMap.clear();
        return resp;
    }
    /**
     * K - V
     * '1' - 1
     * '2' - 1
     * '3' - 1
     */
    private void esPeligroMortal(String num, int index){
        if(index >=0 && index < num.length()){
            char c = num.charAt(index);
            boolean peligro = esNegativo(c, 0);
            if(peligro){
                hashMap.put(c,1);
            }
            if(hashMap.size() < 3){
                esPeligroMortal(num, index+1);
            }
        }
    }
    
    private boolean esNegativo(char c, int index){
        if(index >=0 && index < tableOMN.length){
            if(c == tableOMN[index]){
                return true;
            }else{
                return esNegativo(c,index+1);
            }
        }
        return false;
    }
}
