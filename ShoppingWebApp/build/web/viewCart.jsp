<%-- 
    Document   : viewCart
    Created on : May 1, 2024, 2:42:15 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View cart Page</title>
    </head>
    <body>
        <h1>View cart</h1>
        <%
           Long code= (Long)request.getAttribute("code");
           String name = (String)request.getAttribute("name");
           Double price =  (Double)request.getAttribute("price");
           Double size=  (Double)request.getAttribute("size");
           Integer quantity = (Integer) request.getAttribute("quantity");
           Double total=  (Double)request.getAttribute("total");
           String name2 = (String)request.getAttribute("name2");
           Double price2 =  (Double)request.getAttribute("price2");
           Double size2 =  (Double)request.getAttribute("size2");
           Integer quantity2 = (Integer) request.getAttribute("quantity2");
          
        %>
        <table>
            <tr>
                <td>Code :</td>
                <td><%=code%></td>
            </tr>
             <tr>
                <td>name :</td>
                <td><%=name%></td>
            </tr>
             <tr>
                <td>price :</td>
                <td><%=price%></td>
            </tr>
             <tr>
                <td>size :</td>
                <td><%=size%></td>
            </tr>
             <tr>
                <td>quantity :</td>
                <td><%=quantity%></td>
            </tr>
             
             <tr>
                <td>name2 :</td>
                <td><%=name2%></td>
            </tr>
             <tr>
                <td>price2</td>
                <td><%=price2%></td>
            </tr>
             <tr>
                <td>size2 :</td>
                <td><%=size2%></td>
            </tr>
             <tr>
                <td>quantity2 :</td>
                <td><%=quantity2%></td>
            </tr>
             <tr>
                <td>Total :</td>
                <td><b>R <%=total%></b></td>
            </tr>
        </table>
            <form action="OutComeServlet.do" method="POST">
                <table>
                    <tr>
                         <td><input type="submit" value="BUY"></td
                    </tr>
                   
                </table>
            </form>
    </body>
</html>
