public class Complejidad1 {


    public static double sumar(double num) {
        long tiempo_inicial = System.currentTimeMillis();
        double suma = 0;
        for ( int x =1; x< num+1; x++)
            suma += x;
        long tiempo_final = System.currentTimeMillis();
        double tiempo_ejecucion = (double) ((tiempo_final - tiempo_inicial)/1000 % 60);
        System.out.println(tiempo_ejecucion +" segundos");
        return suma;
    }

    public static void main(String[] args){
        System.out.println(Complejidad1.sumar(1000000000));

    }
}

