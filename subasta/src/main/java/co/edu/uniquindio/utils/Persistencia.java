package co.edu.uniquindio.utils;

import co.edu.uniquindio.model.Subasta;

public class Persistencia {
    public static final String  GUARDATODO= "src\\main\\resources\\co\\edu\\uniquindio\\subasta\\persistencia\\datosSubasta.xml";

    public static void guardarArchivoXML(Subasta subasta)
    {
        try{
            ArchivoUtil. salvarRecursoSerializadoXML(GUARDATODO,subasta);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
