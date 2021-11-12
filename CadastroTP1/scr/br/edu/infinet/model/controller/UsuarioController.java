package br.edu.infinet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infinet.model.domain.Usuario;

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String email = null;
	
	//Lista p/ armazenar em menoria.
	private List<Usuario> lista;
   
    public UsuarioController() {
    	lista = new ArrayList<Usuario>();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario(request.getParameter("Nome do Usuario"), request.getParameter("email"));
		System.out.println(usuario);
		
		lista.add(usuario);
		
//		String nome = request.getParameter("Nome do Usuario");
//		System.out.println("Nome do Usuario" + " - " + nome);
		
//		String email = request.getParameter("email");
//		System.out.println("E-mail:" + " - " + email);	
		
		
		// chama a tela de confirmacao.
		
		PrintWriter out = response.getWriter(); //informacao de apresentacao na tela
		//out.println(usuario); //Exibe as informacoes na url
		
		
		out.println(
				"<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"<meta charset='ISO-8859-1'>" +
				"<title>Insert title here</title>" +
				"</head>" +
				"<body>" +
				" <div> " +
				"	<form action='usuario' metho='get'>" +
				"		<h3>Cadastro do usúario " + usuario.getNome() + " realizado com sucesso!</h3>" +
				"		<button type='submit'>Voltar</button>" +
				"	</form>");
		
		out.println("<hr>");
		out.println("<h4>Lista de cadastros ("+lista.size()+"):</h4>");
		
		for(Usuario a : lista) {
			out.println("<h5>" + a.getNome() + " - " + a.getEmail() +  "</5>");
		}
		
		out.println(
				"		</div>"  +
				"		</body>" +
				"	</html>");
		
		
//		request.getRequestDispatcher("confirmacao.html").forward(request, response);
	
	}

}
