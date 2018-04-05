/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.persistence.Id;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.RespuestaDAO;
import modelo.Usuario;

/**
 *
 * @author pumas
 */
public class responderPregunta implements Serializable {
     private int idrespuesta;
     private Pregunta pregunta;
     private Usuario usuario;
     private String contenido;

    
    public int getIdrespuesta() {
        return this.idrespuesta;
    }
    
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }
    public Pregunta getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
     //public void listener(ActionEvent event){
       // pregunta = (Pregunta)event.getComponent().getAttributes().get("Pregunta1");
    //}
    public String responderPregunta() {
         RespuestaDAO ld = new RespuestaDAO();
         Respuesta respuesta = new Respuesta(this.getIdrespuesta(),this.getPregunta(),
                                            this.getUsuario(),this.getContenido());
                                     
            respuesta.setContenido(this.getContenido());
        //Id.save(Respuesta);
    return  "InicioIH?faces-redirect=true";
        }
    
     
}
