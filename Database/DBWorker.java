package com.company.Database;

import com.company.entities.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AdrianP on 09.06.2017.
 */
public class DBWorker {
    public String authentication(String login, String password) {

        String userLogin = "";
        String userPassword = "";

        try(Connection conn = Connector.getConnection();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM users" +  " WHERE login = ? AND password = ?")
        )
        {
            pst.setString(1, login);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                userLogin = rs.getString("login");
                userPassword = rs.getString("password");
            }
            rs.close();
            if (!userLogin.isEmpty() && userPassword.isEmpty()) {
                if (userLogin.equals(login) && userPassword.equals(password)) {
                    return "successful";
                } else {
                    return "incorrect login or password";
                }
            } else {
                return "user and password not be null";
            }

        } catch (SQLException e) {
            return "sql error\n" + e.getMessage();
        } catch (ClassNotFoundException e) {
            return "global error";
        }
    }

    public List<Teacher> showTeacher() {
        List<Teacher> teachers = new ArrayList<>();
        try (Connection connection = Connector.getConnection();
        PreparedStatement pst = connection.prepareStatement("SELECT * FROM Teachers WHERE Age = ?")) {
            pst.setString(1, "45");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getString("First_Name"), rs.getString("Last_Name"), rs.getString("Sex"), rs.getString("Age"), rs.getString("Person_Code"), /*rs.getString("Subject"), */rs.getString("Phone"), rs.getString("Email")));
                System.out.println("Teahers:" + rs.getString("First_Name") + " " + rs.getString("Last_Name"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return teachers;
    }
}
