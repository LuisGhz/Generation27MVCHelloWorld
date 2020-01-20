package com.exercise27mvchelloworld.controller;

import com.exercise27mvchelloworld.model.UserBean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bId = 0;
		String sName = "";
		byte iAge = 0;
		
		bId = Integer.parseInt(request.getParameter("id"));
		sName = request.getParameter("nombre");
		iAge = Byte.parseByte(request.getParameter("edad"));

		UserBean luis = new UserBean(bId, sName, iAge);
		
		/*
		String sid = "";
		String sname = "";
		String sage = "";
		
		sid = request.getParameter("id");
		sname = request.getParameter("nombre");
		sage = request.getParameter("edad");
		*/
		
		response.getWriter().append("El id introducido es " + luis.getId() + "\n");
		response.getWriter().append("El nombre introducido es " + luis.getNombre() + "\n");
		response.getWriter().append("La edad introducida es " + luis.getEdad() + "\n");
		
	}

}
