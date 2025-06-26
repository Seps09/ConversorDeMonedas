import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        ConsultarTasaDeCambio consultarTasaDeCambio = new ConsultarTasaDeCambio();
        Double ValorDeCambio = 200.25;

        HistorialArchivo historial = new HistorialArchivo();


        while(true){
            FormatoMensajes.mensajeMenu();

            try{

                int opcion = teclado.nextInt();


                if(opcion == 1){
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("USD", "ARS", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 2) {
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("ARS", "USD", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 3) {
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("USD", "BRL", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 4) {
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("BRL", "USD", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 5) {
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("USD", "COP", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 6) {
                    System.out.println("Ingrese el monto que desaa cambiar: ");
                    ValorDeCambio = teclado.nextDouble();
                    DatosDeCambio datos = consultarTasaDeCambio.consulta("COP", "USD", ValorDeCambio);
                    FormatoMensajes.mensajeDeCambio(datos, calcular.calcular(datos), ValorDeCambio);
                    historial.guardarRegistro(datos);

                } else if (opcion == 7) {
                    System.out.println("Fue un placer que nos eligiera como su casa de cambio!!");
                    historial.CerrarArchivo();
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }
    }
}
