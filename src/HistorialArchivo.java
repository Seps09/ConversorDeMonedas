import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class HistorialArchivo {
    FileWriter escritura;

    {
        try {
            escritura = new FileWriter( "Historial.txt");
            escritura.append("MonedaBase,MonedaSalida,TasaDeCambio,ValorDeCambio,Time\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void guardarRegistro(DatosDeCambio jsonDeDatos) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        escritura.append(gson.toJson(jsonDeDatos.monedaBase()))
                .append(",")
                .append(gson.toJson(jsonDeDatos.monedaSalida()))
                .append(",")
                .append(gson.toJson(jsonDeDatos.tasaDeCambio()))
                .append(",")
                .append(gson.toJson(jsonDeDatos.valorDeCambio()))
                .append(",")
                .append(gson.toJson(jsonDeDatos.time()))
                .append("\n");


        //escritura.write(gson.toJson(jsonDeDatos));

    }
    public void CerrarArchivo() throws IOException {
        escritura.close();
    }

    public String LeerArchivo(){
        return "ok";
    }
}
