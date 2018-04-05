/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.Set;
import modelo.Pregunta;
import modelo.PreguntaDAO;
import modelo.Usuario;

/**
 *
 * @author pumas
 */
public class hacerPregunta implements java.io.Serializable{
    private int idpregunta;
    private Usuario usuario;
    private String contenido;
    private Set respuestas = new HashSet(0);
    
    public int getIdpregunta() {
        return this.idpregunta;
    }
    
    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
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
    public Set getRespuestas() {
        return this.respuestas;
    }
    
   public void setRespuestas(Set respuestas) {
        this. respuestas = respuestas;
   }
    
public String hacerPregunta(){
    PreguntaDAO Id = new PreguntaDAO();
    Pregunta Pregunta = new Pregunta(this.getIdpregunta(),this.getUsuario(),
                                     this.getContenido(),this.getRespuestas());
                                     
    Id.save(Pregunta);
    return  "PerfilIH?faces-redirect=true";
     
    /**
    Pregunta Pregunta = new Pregunta();
    Pregunta.setIdpregunta(this.getIdpregunta());
    Pregunta.setUsuario(this.getUsuario());
    Pregunta.setContenido(this.getContenido());
    Pregunta.setRespuestas(this.getRespuestas());
    return"perfil";
    */   
    }     
}
