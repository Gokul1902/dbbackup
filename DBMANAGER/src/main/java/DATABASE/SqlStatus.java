package DATABASE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

@WebServlet("/SqlStatus")
public class SqlStatus extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		String ip = (String)sess.getAttribute("ip");
	    String name = (String)sess.getAttribute("username");
	    String password = (String)sess.getAttribute("password");
	        PrintWriter out = response.getWriter();
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://"+ip+":3306/", name, password)) {
	            out.println("MySQL server status: Running");
	        } catch (SQLException e) {
	            out.println("MySQL server status: Not Running");
	            e.getMessage();
	        }
	}

}
