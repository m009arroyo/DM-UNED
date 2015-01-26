/*
 * Clase Publicacion
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
public class Publicacion extends Documento 
{
    // <editor-fold desc="Atributos de la Clase">
    
    // Atributos de la clase
    private String referencia;
    
    // </editor-fold>
    
    // <editor-fold desc="Constructor">
    
    public Publicacion( String m_titulo,String m_autor, String m_ubicacion,
            int m_cantidad, String m_referencia)
    {
        // Constructor de la Clase Publicacion
        super( m_titulo,m_autor, m_ubicacion, m_cantidad, "Publicacion");
        setReferencia(m_referencia);
    }

    public Publicacion() {}
    
    // </editor-fold>

    // <editor-fold desc="Métodos">
    
    public void setReferencia(String m_referencia) 
    {
        // Se establece la referencia de la Publicacion
        this.referencia = m_referencia;
    }
    
    public String GetReferencia()
    {
        return this.referencia;
    }
    
    // </editor-fold>

}
