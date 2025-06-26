import java.time.LocalDateTime;

public class CapturarTiempo {

    public static String consultarTiempo(){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        //System.out.println(fechaHoraActual);
        return fechaHoraActual.toString();
    }
}
