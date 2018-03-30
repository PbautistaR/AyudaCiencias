/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.PreguntaDAO;
import modelo.Respuesta;
import modelo.RespuestaDAO;
/**
 *
 * @author Alan
 */
//Etiqueta para decirle a jsf que esta clase es un controlador
@ManagedBean
//Etiqueta para que viva este bean hasta que se cambie de pagina. util para jax
@ViewScoped
public class BorrarRespuesta {
    private Respuesta r;
    RespuestaDAO rd=new RespuestaDAO();
    PreguntaDAO pd=new PreguntaDAO();
    
    public BorrarRespuesta(int id){
        this.r=rd.buscaRespuesta(id);
        
    }
    
    public void borrarRespuesta(){    
        rd.eliminaRespuesta(r);
    }
}
