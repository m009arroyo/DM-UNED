/*
-------------- FIS UNED---------------
---------Clase GestorUsuarios---------
Realiza la manipulacion de los datos contenidos dentro del archivo
usuarios.dat. Realiza la comprobacion para poder iniciar sesion
en el sistema.
*/
package Controlador;

import Modelo.Usuario;
import Modelo.Usuario.tipo_usuarios;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Arroyo Ávalos
 * @since Julio, 23, 2013
 * @version 1.0.0
 */
public final class GestorUsuarios 
{
    // <editor-fold desc="Atributos">
    
    // Atributos
    Usuario mi_usuario;
    public Usuario login = new Usuario();
    private Formatter archivo;
    private Scanner lector;
    // Lista de Usuarios
    List<Usuario> lista_usuarios = new ArrayList<>();
    
    // </editor-fold>
    
    // <editor-fold desc="Constructor">
    
    public GestorUsuarios()
    {
        try
        {
            try 
            {
                // Intenta crear el archivo
                archivo = new Formatter("usuarios.dat");
            } 
            catch (FileNotFoundException ex) 
            {
                System.err.println(ex.toString());
            }
            // Se agregar 4 usuarios iniciarles a la Lista de Usuarios Registrados 
            this.lista_usuarios.add(new Usuario("uned","cu13",tipo_usuarios.consulta));
            this.lista_usuarios.add(new Usuario("m09arroyo","0993", tipo_usuarios.consulta));
            this.lista_usuarios.add(new Usuario("profe","123", tipo_usuarios.encargado));
            this.lista_usuarios.add(new Usuario("admin","adm", tipo_usuarios.encargado));
        }
        catch(SecurityException se)
        {
            System.err.println(se.toString());
        }
        // Se llama al método Escribir, el cual pasa todos los elementos de la
        // lista al archivo "usuarios.dat"
        Escribir();
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Funciones de la Clase">
    
    public void Escribir() 
    {
        try
        {
            // Se recorre toda la lista de usuarios
            for (Usuario user : lista_usuarios) 
            {
                // Se escribe cada elemento dentro de la lista
                archivo.format("%s\t%s\t%s\n", user.GetNombre(), user.GetContraseña(), user.GetTipo());
            }
        }
        catch(FormatterClosedException cerrado)
        {
            System.err.println(cerrado.toString());
        }
        // Se llama al metodo Cerrar para cerrar el archivo
        Cerrar();
    }
    
    public void Cerrar()
    {
        // Si el archivo no está vacío
        if (archivo != null) 
        {
            // Se cierra el archivo
            archivo.close(); // Cerrar el Archivo
        }
    }
    
    public boolean Validar(String s, String c)
    {
        /*
        Metodo para validar que el usuario que intenta ingresar
        existe dentro del archivo
        */
        
        // Variables Locales
        boolean encontrado = false;
        Usuario u = new Usuario();
        
        try
        {
            // Se lee el archivo
            lector = new Scanner(new File("usuarios.dat"));
            while(this.lector.hasNext())
            { // Si el archivo contiene más registros
                
                // Se establecen cada uno de los atributos del cliente, con los
                // valores que se van leyendo
                u.setNombre(lector.next());
                u.SetContraseña(lector.next());
                u.SetTipo(tipo_usuarios.valueOf(lector.next()));
                
                if (s.equals(u.GetNombre()) && c.equals(u.GetContraseña())) 
                { // Se compara lo  leído con lo que el usuario ingresó
                    // Si son iguales, se crea un nuevo objeto de la clase Usuario
                    // que representa el usuario logueado
                    encontrado = true;
                    login.setNombre(u.GetNombre());
                    login.SetContraseña(u.GetContraseña());
                    login.SetTipo(u.GetTipo());
                }
            }
        }
        catch(NoSuchElementException | FileNotFoundException e)
        {
            System.err.println(e.toString());
        }
        if (encontrado == true) 
        {
            JOptionPane.showMessageDialog(null, "Usuario de tipo "+login.GetTipo()+" autentificado "
                    + "exitosamente.", "Autentificado", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nombre de Usuario y/o contraseña incorrectos", "Datos no Válidos", JOptionPane.ERROR_MESSAGE);
        }
        return encontrado; // REtorna el valor booleano de la variable "encontrado"
    }
    
 // </editor-fold>   
}
