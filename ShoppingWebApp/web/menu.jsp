<%-- 
    Document   : menu
    Created on : May 1, 2024, 2:17:54 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Menu page</h1>
        <%
            String nameDetails = (String)request.getAttribute("nameDetails");
        %>
        <p>Welcome <b><%=nameDetails%></b></p>
        <form  action="ViewCardServlet.do" method="POST">
            <table>
                <h1>Item 1</h1>
                <tr>
                    <td>Enter your code:</td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td>Enter your item name :</td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td>Enter your price :</td>
                    <td><input type="text" name="price"></td>
                </tr>
                 <tr>
                    <td>Enter your size :</td>
                    <td><input type="text" name="size"></td>
                </tr>
                 <tr>
                    <td>Enter your quantity :</td>
                    <td><input type="text" name="quantity"></td>
                </tr>
            </table>
            <table>
                 <h1>Item 2</h1>
                <tr>
                    <td>Enter your item name :</td>
                    <td><input type="text" name="name2"></td>
                </tr>
                 <tr>
                    <td>Enter your price :</td>
                    <td><input type="text" name="price2"></td>
                </tr>
                 <tr>
                    <td>Enter your size :</td>
                    <td><input type="text" name="size2"></td>
                </tr>
                 <tr>
                    <td>Enter your quantity :</td>
                    <td><input type="text" name="quantity2"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="VIEW CART"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
