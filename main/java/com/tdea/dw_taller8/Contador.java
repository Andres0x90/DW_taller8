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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andres
 */
@WebServlet(name = "Contador", urlPatterns = {"/contador"})
public class Contador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        int visitas = 1;
        HttpSession session = request.getSession();
        
        if (session.getAttribute("contador") != null)
        {
            visitas = (int)session.getAttribute("contador");
            visitas += 1;
        }
        
        session.setAttribute("contador", visitas);
        PrintWriter out = response.getWriter();
        out.println("Numero de visitas: " + visitas);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        int visitas = 1;
        HttpSession session = request.getSession();
        
        if (session.getAttribute("contador") != null)
        {
            visitas = (int)session.getAttribute("contador");
            visitas += 1;
        }
        
        session.setAttribute("contador", visitas);
        PrintWriter out = response.getWriter();
        out.println("Numero de visitas: " + visitas);
    }

}
