/*
 * Clase Libro
 * Hereda de la Clase Documento
 */
package Modelo;

/**
 *
 * @author Michael
 * @since Julio 17, 2013
 * @version 1.0.0
 */
public class Libro extends Documento 
{
    // <editor-fold desc="Atributos de la Clase">
    
    // Atributos de la Clase
    private String editorial;
    private int año_publicacion;
    
    //</editor-fold>
    
    // <editor-fold desc="Constructor de la Clase">
    
    public Libro(){}
    
    public Libro( String m_titulo,String m_autor,String m_ubicacion,
            int m_cantidad, String m_editorial, int m_año)
    {
        // Constructor de la Clase Libro
        super( m_titulo,m_autor, m_ubicacion, m_cantidad, "Libro");
        setEditorial(m_editorial);
        setAñoPublicacion(m_año);
    }
    // </editor-fold>

    // <editor-fold desc="Métodos de la Clase">
    
    public void setEditorial(String m_editorial) 
    {
        // Establecer nombre de la Editorial
        this.editorial = m_editorial;
    }

    public void setAñoPublicacion(int m_año) 
    {
        // Establecer Año de la Publicacion
        this.año_publicacion = m_año;
    }
    public String GetEditorial()
    {
        return this.editorial;
    }
    public int GetAñoPublic()
    {
        return this.año_publicacion;
    }
    // </editor-fold>
}

