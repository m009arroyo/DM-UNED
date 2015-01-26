/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.TrabajoGrado.tipo_grado;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class GestorDocumentos 
{
    File archivo = new File("documentos.dat");
    BufferedWriter escritor;
    List<Documento> documentos_in = new ArrayList<>();
    public GestorDocumentos()
    { // constructor
        if (!archivo.exists()) // SI EL ARCHIVO NO EXISTE CREA UNO NUEVO
        {
            try 
            {
                archivo.createNewFile();
            } 
            catch (IOException ex) 
            {
                System.err.println(ex.toString());
            }
        }
    }
    public GestorDocumentos(String j){}

    public void Agregar(Documento e)
    {
        try 
        {
            escritor=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true), "utf-8"));         
        } 
        catch (FileNotFoundException | UnsupportedEncodingException ex) 
        {
            System.err.println(ex.toString());
        }
        try 
        { 
            // IDENTIFICA EL TIPO DE DOCUMENTO Y LO ESCRIBE EN EL ARCHIVO
            if (e instanceof Libro) 
            {
                Libro mi_libro = (Libro) e;
                escritor.write(mi_libro.GetTipoDoc()+"\t"+mi_libro.GetTitulo()+"\t"+mi_libro.GetAutor()+"\t"+mi_libro.GetUbicacion()+"\t"+mi_libro.GetCantidad()+"\t"+mi_libro.GetEditorial()+"\t"+mi_libro.GetAñoPublic());
                escritor.newLine();
                escritor.close();
            }
            else if(e instanceof Revista)
            {
                Revista mi_revista = (Revista) e;
                escritor.write(mi_revista.GetTipoDoc()+"\t"+mi_revista.GetTitulo()+"\t"+mi_revista.GetAutor()+"\t"+mi_revista.GetUbicacion()+"\t"+mi_revista.GetCantidad()+"\t"+mi_revista.GetCasaEdicion()+"\t"+mi_revista.GetMes()+"\t"+mi_revista.GetAño());
                escritor.newLine();
                escritor.close();
            }
            else if(e instanceof Publicacion)
            {
                Publicacion mi_public = (Publicacion) e;
                escritor.write(mi_public.GetTipoDoc()+"\t"+mi_public.GetTitulo()+"\t"+mi_public.GetAutor()+"\t"+mi_public.GetUbicacion()+"\t"+mi_public.GetCantidad()+"\t"+mi_public.GetReferencia());
                escritor.newLine();
                escritor.close();
            }
            else if(e instanceof TrabajoGrado)
            {
                TrabajoGrado mi_trabajo = (TrabajoGrado) e;
                escritor.write(mi_trabajo.GetTipoDoc()+"\t"+mi_trabajo.GetTitulo()+"\t"+mi_trabajo.GetAutor()+"\t"+mi_trabajo.GetUbicacion()+"\t"+mi_trabajo.GetCantidad()+"\t"+mi_trabajo.GetTipo()+"\t"+mi_trabajo.GetUniversidad());
                escritor.newLine();
                escritor.close();
            }
            else
            {
                System.err.println("Esto no debería pasar");
            }
        } 
        catch (IOException ex) 
        {
            System.err.println(ex.toString());
        }
    }
    
    public void Eliminar(Documento doc)
    {
        List<Documento> eliminables; // LISTA DE DOCUMENTOS 
        try 
        {
            eliminables = Consultar("");
            
            BorrarArchivo();
            archivo.createNewFile();
            if (archivo.exists()) 
                {
                    for(Documento i:eliminables)
                    {
                        if (!Comparar(i, doc))
                        {
                            Agregar(i);
                        }
                        else
                        {
                            // NO AGREGAMOS NADA
                            JOptionPane.showMessageDialog(null, "El documento ha sido eliminado exitosamente", "Documento Eliminado", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            else
            {
                JOptionPane.showMessageDialog(null, "El archivo no existe", "Archivo no encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException ex) 
        {
            System.err.println(ex.toString());
        }
    }
    
    public void Modificar(Documento existente, Documento nuevo) throws IOException
    {
        List<Documento> modificables;
        modificables = Consultar("");
       
        BorrarArchivo(); // SE ELIMINA EL ARCHIVO EXISTENTE
        
        archivo.createNewFile(); // SE CREA UNO NUEVO
        if (archivo.exists()) 
            {
                for(Documento i:modificables) // SE RECORRE LA LISTA
                {
                    if (Comparar(i, existente))
                    { // SI SON IGUALES ENTONCES SE ESCRIBE EL DOCUMENTO NUEVO
                        Agregar(nuevo);
                        JOptionPane.showMessageDialog(null, "Los cambios han sido aplicados de manera exitosa", "Documento Modificado", JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {  // SINO LO DEJAMOS IGUAL
                        Agregar(i);
                    }
                }
            }
        else
        {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Archivo no encontrado", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private boolean Comparar(Documento e, Documento n)
    {
        if (!e.GetTitulo().equals(n.GetTitulo())) 
        {
            return false;
        }
        if(!e.GetAutor().equals(n.GetAutor()))
        {
            return false;
        }
        
        return true;
    }
    public List<Documento> Consultar(String buscado) throws IOException
    {
        Scanner entrada = new Scanner(new File("documentos.dat"));
        Libro l;
        Revista r;
        Publicacion p;
        TrabajoGrado tg;
        List<Documento> encontrados = new ArrayList<>();
        String resultado;
        String tipo;
        try
        {
            encontrados.clear();
                while(entrada.hasNext())
                {
                    resultado = entrada.nextLine();
                    
                    tipo = resultado.substring(0, resultado.indexOf("\t"));
                    switch(tipo)
                    {
                        case "Libro":
                            l = new Libro();
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            l.SetTitulo(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            l.SetAutor(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            l.SetUbicacion(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_cantidadL = Integer.parseInt(resultado.substring(0, resultado.indexOf("\t")));
                            l.SetCantidad(m_cantidadL);
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            l.setEditorial(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_añoL = Integer.parseInt(resultado.substring(0));
                            l.setAñoPublicacion(m_añoL);
                            l.SetTipo("Libro");
                            
                            if (l.GetTitulo().toUpperCase().contains(buscado.toUpperCase().trim())) 
                            {
                                encontrados.add(l);
                            }
                            break;
                            
                        case "Revista":
                            r = new Revista();
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            r.SetTitulo(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            r.SetAutor(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            r.SetUbicacion(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_cantidadR = Integer.parseInt(resultado.substring(0, resultado.indexOf("\t")));
                            r.SetCantidad(m_cantidadR);
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            r.setCasaEdicion(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            r.setMes(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_añoR = Integer.parseInt(resultado.substring(0));
                            r.setAño(m_añoR);
                            r.SetTipo("Revista");
                            
                            if (r.GetTitulo().toUpperCase().contains(buscado.toUpperCase().trim())) 
                            {
                                encontrados.add(r);
                            }
                            break;
                            
                        case "Publicacion":
                            p = new Publicacion();
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            p.SetTitulo(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            p.SetAutor(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            p.SetUbicacion(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_cantidadP = Integer.parseInt(resultado.substring(0, resultado.indexOf("\t")));
                            p.SetCantidad(m_cantidadP);
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            p.setReferencia(resultado.substring(0));
                            p.SetTipo("Publicacion");
                            
                            if (p.GetTitulo().toUpperCase().contains(buscado.toUpperCase().trim())) 
                            {
                                encontrados.add(p);
                            }
                            break;
                            
                        case "Trabajo Grado":
                            tg = new TrabajoGrado();
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            tg.SetTitulo(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            tg.SetAutor(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            tg.SetUbicacion(resultado.substring(0, resultado.indexOf("\t")));
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            int m_cantidadT = Integer.parseInt(resultado.substring(0, resultado.indexOf("\t")));
                            tg.SetCantidad(m_cantidadT);
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            tipo_grado m_tipo = tipo_grado.valueOf(resultado.substring(0, resultado.indexOf("\t")));
                            tg.setTipoGrado(m_tipo);
                            resultado = resultado.substring(resultado.indexOf("\t")+1);
                            tg.setUniversidad(resultado.substring(0));
                            tg.SetTipo("Trabajo Grado");
                            
                            if (tg.GetTitulo().toUpperCase().contains(buscado.toUpperCase().trim())) 
                            {
                                encontrados.add(tg);
                            }
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Ese tipo de documento no existe");

                    }
                }
                entrada.close(); 
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "NO EXISTE EL DOCUMENTO");
        }
        
        return encontrados;
    } 
    
    private void BorrarArchivo()
    {
        try 
        {  
            if(archivo.exists()) 
            {  
                archivo.delete();   
            }  
        } 
        catch (Exception ex) 
        {     
             System.out.println(ex.getMessage());  
        }
    }

}

