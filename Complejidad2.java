public class Complejidad2 {
    private static double time;

    public Complejidad2(double time) {
        this.time = time;
    }

    public static double sumar(double num){
        double tiempo_inicial = time;
        double suma = (num * (num + 1)) / 2;
        double tiempo_final = time;
        double tiempo_ejecucion = tiempo_final - tiempo_inicial;
        System.out.println("El tiempo de ejecucion es: " + tiempo_ejecucion);
        return suma;
    }
    public static void main(String[] args){
        System.out.println(Complejidad2.sumar(1000000000));

    }

}


