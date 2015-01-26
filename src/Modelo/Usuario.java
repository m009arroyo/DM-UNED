/*
 * Clase Usuario
 */
package Modelo;
/**
 *
 * @author Michael
 * @since Julio 17, 2013
 * @version 1.0.0
 */
public class Usuario 
{
    private String nombre_usuario;
    private String contraseña;
    public enum tipo_usuarios{encargado, consulta, no_identificado}
    private tipo_usuarios tipo;
    
    public Usuario(String m_usuario, String m_contraseña, tipo_usuarios m_tipo)
    {
        // Constructor de la Clase Usuario
        this.contraseña = m_contraseña;
        this.nombre_usuario = m_usuario;
        this.tipo = m_tipo;
    }

    public Usuario() 
    {
        // Constructor Vacio
        
    }
    public void setNombre(String m_nombre)
    {
        this.nombre_usuario = m_nombre;
    }
    
    public void SetContraseña(String m_contraseña)
    {
        this.contraseña = m_contraseña;
    }
    
    public void SetTipo(tipo_usuarios m_tipo)
    {
        this.tipo = m_tipo;
    }
    
    public String GetNombre()
    {
        return this.nombre_usuario;
    }
    
    public String GetContraseña()
    {
        return this.contraseña;
    }
    
    public tipo_usuarios GetTipo()
    {
        return this.tipo;
    }
}
