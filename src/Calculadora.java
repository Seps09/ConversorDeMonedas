public class Calculadora {

    public double calcular(DatosDeCambio Datos){
        try {
            return Datos.tasaDeCambio()* Datos.valorDeCambio();
        } catch (Exception e) {
            System.out.println("Error" + e);
            return 0.0;
        }
    }
}
