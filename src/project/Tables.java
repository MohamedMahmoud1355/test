/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*; 
import javax.swing.JOptionPane;
public class Tables {
    public static void main (String[] args){
    Connection con=null; 
    Statement st=null;
    try
    {
    con=ConnectionProvider.getCone();
    st=con.createStatement();
    st.executeUpdate("create table rooms(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int ,status varchar(20))");
      st.executeUpdate("create table customer(id int ,name varchar(200),mobileNumber varchar(20),nationalty varchar(200) ,gender varchar(50),email varchar(200),idproof varchar(200),adress varchar(500),checkIn varchar(50),roomNo varchar(50),bed varchar(200),roomType varchar(200),pricePerDay int,numberOfDayStay int ,totalAmount varchar(200),checkout varchar(50))");

    JOptionPane.showMessageDialog(null, "table created successfully ");
    }
    catch (Exception e )
    {
        JOptionPane.showMessageDialog(null, e);
    }
    finally 
    {
    try
    {
    con.close();
    st.close();
    
    }
    catch (Exception e )
    {}
    
    }
    
    }
    
}
