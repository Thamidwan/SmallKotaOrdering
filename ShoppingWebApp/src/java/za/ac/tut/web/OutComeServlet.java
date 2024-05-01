/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CartFacadeLocal;
import za.ac.tut.entities.Cart;
import za.ac.tut.entities.Item;

/**
 *
 * @author USER
 */
public class OutComeServlet extends HttpServlet {

    

    @EJB
    private CartFacadeLocal psl;
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
        
        Double total = (price * quantity) +(price2 * quantity2);
        
        Cart cart = createCart(code,name,price,size,quantity,name2,price2,size2,quantity2,total);
        
        psl.create(cart);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

     private Cart createCart(Long code, String name, Double price, Double size, Integer quantity, String name2, Double price2, Double size2, Integer quantity2, Double total) {
        Cart cart = new Cart();
        
        List<Item> list = new ArrayList<>();
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.setName(name);
        item1.setPrice(price);
        item1.setQuantity(quantity);
        item1.setSize(size);
        
        item2.setName(name2);
        item2.setPrice(price2);
        item2.setQuantity(quantity2);
        item2.setSize(size2);
        
        list.add(item1);
        list.add(item2);
        
        cart.setId(code);
        cart.setItem(list);
        cart.setTotal(total);
        cart.setCreationDate(new Date());
                
        return cart;
    }


}
