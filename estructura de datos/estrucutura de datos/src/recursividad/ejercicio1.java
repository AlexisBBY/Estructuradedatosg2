public class ejercicio1 {
private int n ;

public int getN() {
    return n;
}

public void setN(int n) {
    this.n = (n > 1) ? n : 2;
}

public int sumar (int n){
    if (n < 2) {
        return 0;   
    
    }if (n < 2) {
            return 0;  // Caso base: si num es menor que 2, retornamos 0
            
    }
    else if (n % 2 == 0) {
        return n + sumar((n - 1)); 
    } else {
        return sumar(n- 1); 
    }
}
}

