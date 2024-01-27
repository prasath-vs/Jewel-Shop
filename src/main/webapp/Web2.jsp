<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>23MCA0078</title>
</head>
<body style="background-color:#A9CCE3">><center>
<h1><b>Order Successful!!!!</b></h1>

<h2>Order Details</h2>
    <p><strong>First Name:</strong> <%= request.getParameter("first_name") %></p>
    <p><strong>Type:</strong> <%= request.getParameter("type") %></p>
     <p><strong>Price:</strong> <%= request.getParameter("price") %></p>
    <p><strong>Discount:</strong> <%= request.getParameter("dis") %></p>
    <p><strong>Final Price:</strong> <%= request.getParameter("fprice") %></p>
    
   

    <p>Thanks for ordering!!</p>
    
    <p><a href="Web.jsp">Back to Order Form</a></p>

</center>
</body>
</html>