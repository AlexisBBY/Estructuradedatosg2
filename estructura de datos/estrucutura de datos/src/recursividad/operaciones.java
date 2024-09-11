
public class operaciones {

    private int n;

    public operaciones (){
    this.n=1;
}

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }   
    //metodo iterativo
    public void imprimir (){
        int i =1;
        while (i<=n){
            System.out.println("HOLA MUNDOTE");
            i++;

        }
    }
    public void imprimir (int n){
        //caso base 
        if (n==1) {
            System.out.println("HOLA MUNDO");
        }else{
            //caso general
            System.out.println("HOLA MUNDOTE");
            imprimir(n-1);
        }
    }
}
