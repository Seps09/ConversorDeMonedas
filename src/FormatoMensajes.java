import java.util.ArrayList;

public class FormatoMensajes {

    public static void mensajeDeCambio (DatosDeCambio datos, Double valorDeCambio, Double valorDeIngreso){
        System.out.printf("""
                        \n
                        \n
                        ******** %s -->  %s ********
                        
                        Modena Base : %s
                        Moneda de salida : %s
                        
                                Tasa de cambio
                        Valor : %.2f
                        
                        Monto a cambiar : %.2f %s
                        
                        Total de cambio : %.2f %s
                        
                        ********************************************
                        %n""",
                datos.monedaBase(),
                datos.monedaSalida(),
                datos.monedaBase(),
                datos.monedaSalida(),
                datos.tasaDeCambio(),
                valorDeIngreso,
                datos.monedaBase(),
                valorDeCambio,
                datos.monedaSalida()
        );
    }
    public static void mensajeMenu(){
        System.out.println("""
                \n
                \n
                    *********CALCULADORA TASA DE CAMBIO*********
                    
                    1............Dólar --> Peso Argentino
                    2...Peso Argentino --> Dolar
                    3............Dólar --> Real Brasileño
                    4....Rel Brasileño --> Dólar
                    5............Dolar --> Peso Colombiano
                    6..Peso Colombiano --> Dólar
                    7..Salir.
                    
                    Presione la opción... 
                    ********************************************
                    
                    """);
    }
}
