package com.loanmanagementsystme.javaconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoanDao {
    public boolean checkPrimaryKey(int primarykey){
        boolean bool = true;
        Connection con;
        try{
            final String sqlQuerry = "select * from LoanDetails where LoanID=?";
            con = DatabaseConnection.connections();
            PreparedStatement ps = con.prepareStatement(sqlQuerry);
            ps.setInt(1,primarykey);
            ResultSet resultSet = ps.executeQuery();
            int n = 0;
            if(resultSet.next()){
                n = resultSet.getInt(1);
                if(n >0){
                    bool = false;
                }
            }
            con.close();
            resultSet.close();



        }catch(Exception e) {
            e.printStackTrace();
        }
        return bool;
    }
}
