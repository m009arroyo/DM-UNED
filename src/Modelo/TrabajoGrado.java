/*
 * Clase Revista
 * Hereda de la Clase TrabajoGrado
 */
package Modelo;

/**
 *
 * @author Michael Arroyo
 * @since Julio 17, 2013
 * @version  1.0.0
 * 
 */
public class TrabajoGrado extends Documento 
{   
    // <editor-fold desc="Atributos">
    
    // Atributos de la Clase
    public enum tipo_grado
    {
        D,B,L
    }
    private tipo_grado tipo;
    private String universidad;
    
    //</editor-fold>
    
    //<editor-fold desc="Constructor">
    
    public TrabajoGrado( String m_titulo,String m_autor, String m_ubicacion,
            int m_cantidad, tipo_grado m_tipo, String m_universidad)
    {
        // Constructor de la Clase Revista
        super(m_titulo,m_autor, m_ubicacion, m_cantidad, "Trabajo Grado");
        setTipoGrado(m_tipo);
        setUniversidad(m_universidad);
    }
    
    // Constructor Vacío
    public TrabajoGrado() {}
    
    // </editor-fold>
    
    // <editor-fold desc="Métodos">
    
    public void setTipoGrado(tipo_grado m_tipo) 
    {
        // Establece el tipo de grado de que es el trabajo
        this.tipo = m_tipo;
    }

    public void setUniversidad(String m_universidad) 
    {
        // Se establece la universidad de donde proviene el trabajo
        this.universidad = m_universidad;
    }
    
    public String GetUniversidad()
    {
        return this.universidad;
    }
    
    public tipo_grado GetTipo()
    {
        return this.tipo;
    }
    //</editor-fold>
}
