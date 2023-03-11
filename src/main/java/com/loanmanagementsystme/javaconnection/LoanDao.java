package com.loanmanagementsystme.javaconnection;
import com.loanmanagementsystme.userdetails.LoanDetails;
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

    public void inputValues(LoanDetails details,int tennure){
        Connection con;
        final String querry = "insert into LoanDetails(LoanID,FullName,PhoneNumber,IncomePerYear,FullAddress,Email,LoanType,TotalAmount,EMI,tenure) values(?,?,?,?,?,?,?,?,?,?)";
        try{
            con = DatabaseConnection.connections();

            PreparedStatement st = con.prepareStatement(querry);
            st.setInt(1,details.getID());
            st.setString(2,details.getFullName());
            st.setString(3,details.getPhoneNumber());
            st.setDouble(4,details.getIncomePerYear());
            st.setString(5,details.getFullAddress());
            st.setString(6,details.getEmail());
            st.setString(7,details.getLonaType());
            st.setDouble(8,details.getTotalAmount());
            st.setDouble(9,details.getEMI());
            st.setInt(10,tennure);
            int result = st.executeUpdate();
            if(result == 1){
                System.out.println("success");
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}