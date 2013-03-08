/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author Francisco Javier Lima Florido
 */
public class GitAux {
    
    public void metodoAlumno1(){
	System.out.println("modificado por alumno 1");
        System.out.println("metodo 1");
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
		System.out.println("modificado por alumno 2");
    }
    
    public void metodoComunitario(){
	//Linea nueva de comentario
        System.out.println("Aqui escribimos todos");
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
	// modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
    }
    public void testGitAux(){
    	
	//metodo rama testing

	System.out.println("Metodo testing");
	
    }
}
