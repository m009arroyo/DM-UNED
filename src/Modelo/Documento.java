/*
 * SuperClase Documento
 * 
 */
package Modelo;

/**
 *
 * @author Michael Arroyo
 * @since Junio, 17, 2013
 * @version 1.0.0
 * 
 */
public  class Documento 
{
    // <editor-fold desc="Atributos de la Clase">
    
    // Atributos de la Clase
    private String autor;
    private String titulo;
    private String ubicacion;
    private int cantidad;
    private String tipo;
    // </editor-fold>
    
    // <editor-fold desc="Constructor">
    
    public Documento()
    {
        //Constructor Vacío
    }
    
    public Documento(String m_titulo,String m_autor,String m_ubicacion,
            int m_cantidad, String m_tipo)
    {
        // Constructor de la Clase Documento 
        this.autor = m_autor;
        this.titulo = m_titulo;
        this.ubicacion = m_ubicacion;
        this.cantidad = m_cantidad;
        this.tipo = m_tipo;
    }
   
    
    // </editor-fold>
    
    //<editor-fold desc="Funciones de la Clase">
    
    public String GetAutor()
    {
        return this.autor;
    }
    
    public String GetTitulo()
    {
        return this.titulo;
    }
    
    public String GetUbicacion()
    {
        return this.ubicacion;
    }
    
    public int GetCantidad()
    {
        return this.cantidad;
    }
    
    public String GetTipoDoc()
    {
        return this.tipo;
    }
    
    public void SetTitulo(String m_titulo)
    {
        this.titulo = m_titulo;
    }
    
    public void SetTipo(String m_tipo)
    {
        this.tipo = m_tipo;
    }
    
    public void SetAutor(String m_autor)
    {
        this.autor= m_autor;
    }
    
    public void SetUbicacion(String m_ubicacion)
    {
        this.ubicacion = m_ubicacion;
    }
    
    public void SetCantidad(int m_cantidad)
    {
        this.cantidad = m_cantidad;
    }
    @Override
    public String toString()
    {
        return this.titulo + " - "+this.autor;
    }
    
    //</editor-fold> 
}