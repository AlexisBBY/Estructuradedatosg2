public class sacarPotencia {
    
    private int n;



    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int calcPo (int n){
        //caso base
        return (n>=1)?n:2*calcPo(n-1);
    }
}






