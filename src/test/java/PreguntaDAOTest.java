/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import modelo.*;
import controlador.*;

/**
 *
 * @author Alan
 */
public class PreguntaDAOTest {
    
    public PreguntaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         //PreguntaDAO pd=new PreguntaDAO();
         //RespuestaDAO rd=new RespuestaDAO();
         //UsuarioDAO ud=new UsuarioDAO();
         //Pregunta p=pd.buscaPregunta(1);
         //Respuesta r=rd.buscaRespuesta(1);
         //Usuario u=ud.buscaUsuario(1);
         //rd.eliminaRespuesta(r);
         //System.out.println(u.getNombre());
         //System.out.println(p.getContenido());
         BorrarUsuario bu=new BorrarUsuario(6);
         bu.borrarUsuario();
     }
}
