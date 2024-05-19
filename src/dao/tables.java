/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author bara7
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar (200),mobileNumber varchar (50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
            //st.executeUpdate("insert into appuser (userRole,name,mobileNumber,email,password,address,status) values ('SuperAdmain','Super Admain','12345','superadmain@testemail.com','admin','sudan','Active')");

           // st.executeUpdate("create table product( product_pk int AUTO_INCREMENT primary key,name varchar(200),quantity int,price int)");
            //st.executeUpdate("create table customer( customer_pk int AUTO_INCREMENT primary key,name varchar(200),mobileNumber varchar(50))");
            //st.executeUpdate("create table orderDetail( order_pk int AUTO_INCREMENT primary key,orderID varchar(200),customer_fk int ,orderDate date,totalPaid int)");
           // st.executeUpdate("create table expenes( expense_pk int AUTO_INCREMENT primary key,expenesID varchar(200), expenesDate date ,expenesName varchar(200),exoenseprice int)");
           
           //////////////////////////////////////////////// لعرض صافي الربح ومجموع المبيعات ومجموع المنصرفات
          // st.executeUpdate("CREATE TABLE MonthlyDate (YearMonth VARCHAR(7) PRIMARY KEY)");
           
         // st.executeUpdate("CREATE TABLE IF NOT EXISTS MonthlyExpenses (YearMonth VARCHAR(7) PRIMARY KEY, TotalExpenses int)");
         // st.executeUpdate("CREATE TABLE IF NOT EXISTS MonthlySales (YearMonth VARCHAR(7) PRIMARY KEY, TotalSales int)");
          
                   
         //st.executeUpdate("CREATE TABLE IF NOT EXISTS MonthlyNetProfit (YearMonth VARCHAR(7) PRIMARY KEY, NetProfit int)");
           
           
           
           JOptionPane.showMessageDialog(null, "Table Created Successfully");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }

    }

}
