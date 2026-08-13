public class MatematicaReconstruida {

    public static boolean isNegativo (int x){
        if (x == 0) return false;
        return MatematicaReconstruida.isNegativo(x,x);
    }
    public static boolean isNegativo(int a, int d){
        if (a == 0) return true;
        if (d == 0) return false;
        a++;
        d--;
        return MatematicaReconstruida.isNegativo(a, d);
    }
    public static int soma(int a, int b){
        if (a==0) return b;
        if (b==0) return a;

        return MatematicaReconstruida.soma(++a, --b);
    }
    public static int subtracao(int a, int b){
        if (a==0) return b;
        if (b==0) return a;
        if (isNegativo(a)){
            if (isNegativo(b)) {
                return subtracao(--a, ++b); 
           }return subtracao(++a, --b);
        }
        if (isNegativo(b)) return subtracao(--a, ++b);
        return subtracao(--a, --b);
    }
    public static int modulo(int x){
        if (x==0) return 0;
        if (isNegativo(x)){
            return soma(1, modulo(++x));
        }
        return x;
    }
    public static int multiplicacao(int a, int b){
  
        if (a==0) return 0;
        if (b==0) return 0;
        if ( isNegativo(a)){
            if (isNegativo(b)) {
                return multiplicacao(modulo(a), modulo(b));
            }
            return subtracao(multiplicacao(a, --b), a);
        }
        if (isNegativo(b)){
            return multiplicacao(b, a);
        }
        return soma(multiplicacao(a, --b), a);
    }
    public static int potencia(int a, int b){
        if(b==0) return 1;
        if(isNegativo(b)) return potencia(a,modulo(b));
        return multiplicacao(a,potencia(a,--b));
    }
    public static boolean menor(int a, int b){
        if(a==b) return false;
        if(isNegativo(a)){
            if(isNegativo(b)){
                return menor(modulo(b), modulo(a));
            } return true;
        }
        if(isNegativo(b)) return false;
        if(b==0) return false;
        if(a==0) return true;
        return(menor(--a,--b));
    }
    public static boolean menorIgual(int a, int b){
        if(a==b) return true;
        if(isNegativo(a)){
            if(isNegativo(b)){
                return menor(modulo(b), modulo(a));
            } return true;
        }
        if(isNegativo(b)) return false;
        if(b==0) return false;
        if(a==0) return true;
        return menor(--a,--b);
    }
    public static boolean maior(int a, int b){
        if (a==b) return false;
        if (isNegativo(a)){
            if (isNegativo(b)){
                return maior(modulo(b), modulo(a));
            }return false;
        }
        if (isNegativo(b)) return true;
        if(a==0) return false;
        if(b==0) return true;
        return maior(--a,--b);
    }
    public static boolean maiorIgual(int a, int b){
        if (a==b) return true;
        if (isNegativo(a)){
            if (isNegativo(b)){
                return maior(modulo(b), modulo(a));
            }return false;
        }
        if (isNegativo(b)) return true;
        if(a==0) return false;
        if(b==0) return true;
        return maior(--a,--b);
    }
    public static boolean diferente(int a, int b){
        if (a==b) return false
        return true
    }
}
