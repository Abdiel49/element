public class recursividad {
    
    public int factorial( int n ) {
        int resp;
        if(n == 1){
            resp = n;
        }else {
            resp = n * factorial( n-1 );
        }
        return resp;
    }
    
    
}