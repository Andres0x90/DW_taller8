/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.dw_taller8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
@WebServlet(name = "PotenciarCubo", urlPatterns = {"/potenciar-cubo"})
public class PotenciarCubo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        Integer numero = Integer.valueOf(request.getParameter("numero"));
        Integer resultado = (int)Math.pow(numero, 3);
        
        PrintWriter out = response.getWriter();
        out.println("El resultado del numero " + numero + " elevado al cubo es: " + resultado);
    }


}
