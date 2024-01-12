package co.edu.uniquindio.utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Esta clase tiene métodos estáticos que permite usarlos sin crear instancias de la clase
 * Lo que se hizo fue crear esta libreria para el manejo de los archivos
 *
 */
public  class ArchivoUtil {

    static String fechaSistema = "";

    /**
     * Este metodo recibe una cadena con el contenido que se quiere guardar en el archivo
     *
     * @param ruta es la ruta o path donde esta ubicado el archivo
     * @throws IOException
     */
    public void guardarArchivo(String ruta, String contenido, Boolean flagAnexarContenido) throws IOException {

        FileWriter fw = new FileWriter(ruta, flagAnexarContenido);
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write(contenido);
        bfw.close();
        fw.close();
    }

    /**
     * ESte metodo retorna el contendio del archivo ubicado en una ruta,con la lista de cadenas.
     */
    public ArrayList<String> leerArchivo(String ruta) throws IOException {

        ArrayList<String> contenido = new ArrayList<String>();
        FileReader fr = new FileReader(ruta);
        BufferedReader bfr = new BufferedReader(fr);
        String linea = "";
        while ((linea = bfr.readLine()) != null) {
            contenido.add(linea);
        }
        bfr.close();
        fr.close();
        return contenido;
    }


    public void guardarRegistroLog(String mensajeLog, int nivel, String accion, String rutaArchivo) {
        Logger LOGGER = Logger.getLogger(accion);
        FileHandler fileHandler = null;
        cargarFechaSistema();
        try {
            fileHandler = new FileHandler(rutaArchivo, true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            switch (nivel) {
                case 1:
                    LOGGER.log(Level.INFO, accion + "," + mensajeLog + "," + fechaSistema);
                    break;

                case 2:
                    LOGGER.log(Level.WARNING, accion + "," + mensajeLog + "," + fechaSistema);
                    break;

                case 3:
                    LOGGER.log(Level.SEVERE, accion + "," + mensajeLog + "," + fechaSistema);
                    break;

                default:
                    break;
            }

        } catch (SecurityException e) {

            LOGGER.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            LOGGER.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } finally {

            fileHandler.close();
        }
    }

    public void cargarFechaSistema() {

        String diaN = "";
        String mesN = "";


        Calendar cal1 = Calendar.getInstance();


        int dia = cal1.get(Calendar.DATE);
        int mes = cal1.get(Calendar.MONTH) + 1;
        int anio = cal1.get(Calendar.YEAR);


        if (dia < 10) {
            diaN += "0" + dia;
        } else {
            diaN += "" + dia;
        }
        if (mes < 10) {
            mesN += "0" + mes;
        } else {
            mesN += "" + mes;
        }

        //		fecha_Actual+= a o+"-"+mesN+"-"+ diaN;
        //		fechaSistema = a o+"-"+mesN+"-"+diaN+"-"+hora+"-"+minuto;
        fechaSistema = anio + "-" + mesN + "-" + diaN;
        //		horaFechaSistema = hora+"-"+minuto;
    }


    //------------------------------------SERIALIZACIÓN  y XML

    /**
     * Escribe en el fichero que se le pasa el objeto que se le envia
     *
     * @param rutaArchivo path del fichero que se quiere escribir
     * @throws IOException
     */

    public Object cargarRecursoSerializado(String rutaArchivo) throws Exception {
        Object aux = null;
//		Empresa empresa = null;
        ObjectInputStream ois = null;
        try {
            // Se crea un ObjectInputStream
            ois = new ObjectInputStream(new FileInputStream(rutaArchivo));

            aux = ois.readObject();

        } catch (Exception e2) {
            throw e2;
        } finally {
            if (ois != null)
                ois.close();
        }
        return aux;
    }


    public void salvarRecursoSerializado(String rutaArchivo, Object object) throws Exception {
        ObjectOutputStream oos = null;
        try {
            // Se crea un ObjectOutputStream
            oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            oos.writeObject(object);
        } catch (Exception e) {
            throw e;
        } finally {
            if (oos != null)
                oos.close();
        }
    }


    public Object cargarRecursoSerializadoXML(String rutaArchivo) throws IOException {

        XMLDecoder decodificadorXML;
        Object objetoXML;

        decodificadorXML = new XMLDecoder(new FileInputStream(rutaArchivo));
        objetoXML = decodificadorXML.readObject();
        decodificadorXML.close();
        return objetoXML;

    }

    public void salvarRecursoSerializadoXML(String rutaArchivo, Object objeto) throws IOException {

        XMLEncoder codificadorXML;

        codificadorXML = new XMLEncoder(new FileOutputStream(rutaArchivo));
        codificadorXML.writeObject(objeto);
        codificadorXML.close();

    }
}