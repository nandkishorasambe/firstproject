
<%@page  language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
         <style type="text/css">
            .point-card{
                box-shadow: 0 0 10px rgb(0, 0, 0, 0.3);
            }
        </style>
    </head>
    <body>
       <%@include file="navbar.jsp" %>
         <%@include file="css.jsp" %>
         
         <div class="container p-5">
             <div class="row">
                 <div class="col-md-4 offset-md-4">
                     <div class="card point-card">
                         <div class="card-body">
                             <p class="fs-4 text-center">User Login</p>
                             
                            
                             <form action="userLogin" method="post">
                                 <div class="mb-3">
                                     <label class="form-label">Email Address</label>
                                     <input required name="email" type="email" class="form-control"><!-- comment -->
                            
                         </div>
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Password</label>
                                     <input required name="password" class="form-control">
                                </div>  
                                 <button type="submit" class="bg-success text-white col-md-12">Login1</button>
                                     </form>
                             <br> Don't have account?<a href="sinup.jsp" class="text-decoration-none" >Create one</a> 
                             
         </div>
                     </div>  
                 </div>
             </div>
         </div>
    </body>
</html> 
