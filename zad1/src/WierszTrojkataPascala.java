class Exception1 extends Exception{};
class Exception2 extends Exception{};

public class WierszTrojkataPascala{
    private int[] tablica;

    int silnia(int n){
        int suma = 1;
        for(int i = n; i>1; i--)
            suma *= i;
        return suma;
    }

    int dwumianNewtona(int n, int k){
        return silnia(n) / (silnia(k)* silnia(n-k));
    }

    WierszTrojkataPascala(int n) throws Exception1{
        if(n < 0) throw new Exception1();
        this.tablica = new int[n+1];
        for(int i = 0; i <= n; i++){
            this.tablica[i] = dwumianNewtona(n,i);
        }
    }

    public int wspolczynnik(int m) throws Exception2{
        if(m < 0 || m > this.tablica.length) throw new Exception2();
        return this.tablica[m];
    }
}