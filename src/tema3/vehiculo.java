package tema3;

public class vehiculo {
    public static void main(String[] args) {
        int cpuertas = 0;
        int tpuertas = 0;
        Pcoche miCoche = new Pcoche();
        miCoche.SumarPuerta();

        cpuertas = 1+1;
        tpuertas = miCoche.Apuertas + cpuertas;

        System.out.println(tpuertas);
    }
}
class Pcoche {
    public int Apuertas = 0;
    public void SumarPuerta() {
        this.Apuertas = 1;

    }

}