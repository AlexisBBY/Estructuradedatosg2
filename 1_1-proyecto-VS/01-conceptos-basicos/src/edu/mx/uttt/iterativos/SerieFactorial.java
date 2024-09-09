package edu.mx.uttt.iterativos;

// :::PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO:::

// 1. Realizar la validacion para que la variable de instacia nunca sea 0 
// 2. realizar un metodo que calcule el factoral utilizando un ciclo for 
// 3.realizar un metodo que calculua el factorial de manera invesa utilizando un while
// ejemplo del factoral
// f(1)=1
// f(2)=1*2
// f(3)=1*2*3
// f(n)=1*2*3*n



public class SerieFactorial {
    private int n;

    public SerieFactorial(){
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double calcular(){
        double r = 0.0;
        int i = 1;
        do {
            r += i / this.calcular(i);
            i++;
        } while (i <= this.n);
        return r;
    }

    //Metodo utilitario
    private long calcular(int n){
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Esto es igual a que: fact = fact * i
        }
        return fact;
    }
}