
package com.dao;

import com.entity.User;
import java.sql.*;


public class userDao {
    private Connection conn;

    public userDao(Connection conn) {
        super();
        this.conn = conn;
    }
    
    public boolean userRegister(User u){
     
        boolean f=false;
        try{
            
            String sql="insert into user_register(full_name,email,password) values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,u.getFullName());
            ps.setString(2,u.getEmail());
            ps.setString(3,u.getPassword());
            
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    public User login(String em,String psw){
        User u=null;
        try{
            String sql="select * from user_register where email=? and password=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, em);
             ps.setString(2, psw);
             
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 u=new User();
                 u.setId(rs.getInt(1));
                 u.setFullName(rs.getString(2));
                 u.setEmail(rs.getString(3));
                 u.setPassword(rs.getString(4));
             }
        }catch(Exception e){
         e.printStackTrace();
        }
        return u;
    }

   

  
}