/*
 * Clase Revista
 * Hereda de la Clase Documento
 */
package Modelo;

/**
 *
 * @author Michael Arroyo
 * @since Julio 17, 2013
 * @version  1.0.0
 * 
 */
public class Revista extends Documento
{
    //<editor-fold desc="Atributos">
    
    // Atributos de la Clase
    private String casa_edicion;
    private String mes_publicacion;
    private int año_edicion;
    
    private String prueba;
    
            
    //</editor-fold>
    
    //<editor-fold desc="Constructor">
    
    public Revista( String m_titulo,String m_autor, String m_ubicacion,
            int m_cantidad, String m_casa, String m_mes, int m_año)
    {
        // Constructor de la Clase Revista
        super( m_titulo,m_autor, m_ubicacion, m_cantidad, "Revista");
        setCasaEdicion(m_casa);
        setMes(m_mes);
        setAño(m_año);
    }

    public Revista() {}
    
    //</editor-fold>
    
    //<editor-fold desc="Métodos">

    public void setCasaEdicion(String m_casa) 
    {
        // Se establece la casa de edicion de la revista
        this.casa_edicion = m_casa;
    }

    public void setMes(String m_mes) 
    {
        // Se establece el mes de publicacion de la revista
        this.mes_publicacion = m_mes;
    }

    public void setAño(int m_año) 
    {
        // Se establece el año de publicacion de la revista
        this.año_edicion = m_año;
    }
    
    public String GetCasaEdicion()
    {
        return this.casa_edicion;
    }
    
    public String GetMes()
    {
        return this.mes_publicacion;
    }
    
    public int GetAño()
    {
        return this.año_edicion;
    }
    //</editor-fold>
}
