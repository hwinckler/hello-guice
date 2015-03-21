package guice.servlet;

import guice.hello.Hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Singleton
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Inject
	private Hello hello = null;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String texto = "";
		
		try{
			
			texto = hello.say();
			System.out.println(texto);
		}
		catch(Exception e){
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			texto = errors.toString();
		}
	
		response.getOutputStream().print(texto);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	

}
