/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.persistence.Id;
import modelo.*;

/**
 *
 * @author pumas
 */
public class responderPregunta {
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
   
    public String responderPregunta(Pregunta pregunta){
        this.setPregunta(pregunta);    
        Usuario us=new UsuarioDAO().buscarUsuario(usuario);
        //Respuesta resp = new Respuesta(this.getIdrespuesta(),this.getPregunta(),
        //                               this.getUsuario(),this.getContenido());
        Respuesta resp = new Respuesta();
        resp.setIdrespuesta(idrespuesta);
        resp.setUsuario(usuario);
        resp.setContenido(contenido);
        RespuestaDAO respDAO = new RespuestaDAO();
        respDAO.nuevaRespuesta(resp);   
        contenido="";
      return  "InicioIH?faces-redirect=true";
    }
/*
 public void foo(Pregunta pregunta){
        this.setPregunta(pregunta);
        RespuestaDAO respDAO=new RespuestaDAO();
        for(int i=2;i<5;i++){
            Respuesta resp=new Respuesta(i, pregunta, usuario, "Resp num."+i);            
            respDAO.nuevaRespuesta(resp);
        }
   }**/     
}
