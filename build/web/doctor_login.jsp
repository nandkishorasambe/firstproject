

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1"><!-- comment -->
        <title>Docoter Login page</title>
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
                             <p class="fs-4 text-center">Doctor Login</p>
                             <form action="#" method="post">
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Email Address</label>
                                     <input required name="email" type="email" class="form-control"><!-- comment -->
                            
                         </div>
                                 <div class="mb-3"><!-- comment -->
                                     <label class="form-label">Password</label>
                                     <input required name="password" class="form-control">
                                </div>  
                                 <button type="submit" class="bg-success text-white col-md-12">Login1</button>
                                     </form>
         </div>
                     </div>  
                 </div>
             </div>
         </div>
             
         
        
    </body>
</html>