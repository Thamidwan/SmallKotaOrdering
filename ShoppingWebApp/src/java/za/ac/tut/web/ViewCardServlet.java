/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class ViewCardServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long code = Long.parseLong(request.getParameter("code"));
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        Double size = Double.parseDouble(request.getParameter("size"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        
        String name2 = request.getParameter("name2");
        Double price2 = Double.parseDouble(request.getParameter("price2"));
        Double size2 = Double.parseDouble(request.getParameter("size2"));
        Integer quantity2 = Integer.parseInt(request.getParameter("quantity2"));
        
        request.setAttribute("code", code);
        
        request.setAttribute("name", name);
        request.setAttribute("price",price);
        request.setAttribute("size",size);
        request.setAttribute("quantity", quantity);
        
        request.setAttribute("name2", name2);
        request.setAttribute("price2",price2);
        request.setAttribute("size2",size2);
        request.setAttribute("quantity2", quantity2);
        
        Double total = (price * quantity) +(price2 * quantity2);
        
          request.setAttribute("total", total); 
        RequestDispatcher disp = request.getRequestDispatcher("viewCart.jsp");
        disp.forward(request, response);
    }

    
}
