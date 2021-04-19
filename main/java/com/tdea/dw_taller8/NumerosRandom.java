/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.dw_taller8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
@WebServlet(name = "NumerosRandom", urlPatterns = {"/numeros-random"})
public class NumerosRandom extends HttpServlet {
    
    private ArrayList<Double> numeros;

    @Override
    public void init(ServletConfig config) throws ServletException
    {
        super.init(config);
        Random random = new Random();
        numeros = new ArrayList<Double>();
        
        for(int i=0; i<10; i++)
            numeros.add(random.nextDouble());
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        Double resultado = 0.;
        
        for (Double numero: numeros)
        {
            resultado += numero;
        }
        out.println("Resultado de la suma de los numeros random: " + resultado);
    }

}
