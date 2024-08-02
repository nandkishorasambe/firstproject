<%-- 
    Document   : sinup
    Created on : 22-Jun-2023, 2:03:31 pm
    Author     : NandKishor
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sinup page</title>
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
                             
                             <form action="user_register" method="post">
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Full Name</label>
                                     <input required name="fullName" type="fullName" class="form-control"><!-- comment -->
                            
                         </div>
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Email Address</label>
                                     <input required name="email" class="form-control">
                                </div>  
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Password</label>
                                     <input required name="password" type="password" class="form-control"><!-- comment -->
                            
                         </div>
                                 <button type="submit" class="bg-success text-white col-md-12">Register</button>
                                     </form>
                            
                             
         </div>
                     </div>  
                 </div>
             </div>
         </div>
    
    </body>
</html>