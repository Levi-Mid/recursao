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
}
