import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

public class ConsultarTasaDeCambio {

    public DatosDeCambio consulta (String moneda, String monedaSalida, Double ValorDeCambio){

        String direccion = "https://v6.exchangerate-api.com/v6/5d750229251cb010ae1479da/latest/" + moneda;
        //String direccion = "https://swapi.info/api/films/schema";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            TasaDeCambio json = new Gson().fromJson(response.body(), TasaDeCambio.class);

            DatosDeCambio datos = new DatosDeCambio(moneda, monedaSalida, json.conversion_rates().get(monedaSalida), ValorDeCambio, CapturarTiempo.consultarTiempo());

            System.out.println(datos.tasaDeCambio());

            System.out.println(datos);
            return datos;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
