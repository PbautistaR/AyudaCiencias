/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.PreguntaDAO;
import modelo.RespuestaDAO;
/**
 *
 * @author Alan
 */
//Etiqueta para decirle a jsf que esta clase es un controlador
@ManagedBean
//Etiqueta para que viva este bean hasta que se cambie de pagina. util para jax
@ViewScoped
public class BorrarPregunta {
   
    private Pregunta p;
    //private List<Respuesta> lr;
    RespuestaDAO rd=new RespuestaDAO();
    PreguntaDAO pd=new PreguntaDAO();
    
    public BorrarPregunta(int id){
        this.p=pd.buscaPregunta(id);
       // this.lr=rd.respuestasPregunta();
    }
    
    
    public void borrarPregunta(){
        //System.out.println("Aqui");
        
        Set<Respuesta> s=p.getRespuestas();
        System.out.println( s.size());
        
        for(Respuesta r:s){
            
            //RespuestaDAO rd=new RespuestaDAO();
            rd.eliminaRespuesta(r);
          //  System.out.println(r.getContenido());
        } 
        this.p=pd.buscaPregunta(p.getIdpregunta());
        
        pd.eliminaPregunta(p);
    }
}
