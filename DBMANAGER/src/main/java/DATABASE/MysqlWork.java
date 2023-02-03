package DATABASE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MysqlWork
 */
@WebServlet("/MysqlWork")
public class MysqlWork extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String worksql = request.getParameter("switch");
		HttpSession sess = request.getSession();
		PrintWriter out = response.getWriter();
		String ip = (String)sess.getAttribute("ip");
	    String name = (String)sess.getAttribute("username");
	    ip="gokul-zstch1155";
		if(worksql.equals("start")) {
			try {
//	            Runtime.getRuntime().exec("systemctl start mysql");
//	            out.println("MySQL server started.");
				System.out.println("hellooo");
			    
				Process process = Runtime.getRuntime().exec("ssh gokul@gokul-zstch1155 'systemctl stop mysql'");
				System.out.println("hellooooo1");
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                out.println(line);
	            }
	            reader.close();
	            process.waitFor();
	            out.println("MySQL started on remote machine.");
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	        } 
		else {
		    try {
	            String host = "gokul-zstch1155";
	            String username = "gokul";
	            String password = "Amma@143";
	            String command = "ssh " + username + "@" + host + " systemctl stop mysql";
	            Process p = Runtime.getRuntime().exec(command);
	            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	            String s = null;
	            System.out.println("Standard output of the command:\n");
	            while ((s = stdInput.readLine()) != null) {
	                System.out.println(s);
	            }
	            System.out.println("Standard error of the command (if any):\n");
	            while ((s = stdError.readLine()) != null) {
	                System.out.println(s);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
//			try {
//	            Runtime.getRuntime().exec("systemctl stop mysql");
//	            out.println("MySQL server stopped.");
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//			try {
////	            Runtime.getRuntime().exec("systemctl start mysql");
////	            out.println("MySQL server started.");
//			    Process process = Runtime.getRuntime().exec("ssh " + name + "@" + ip + " \"systemctl stop mysql\"");
//	            // get the output of the command
//	            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//	            String line;
//	            while ((line = reader.readLine()) != null) {
//	                out.println(line);
//	            }
//	            reader.close();
//	            process.waitFor();
//	            out.println("MySQL stop on remote machine.");
//	        } catch (IOException | InterruptedException e) {
//	            e.printStackTrace();
//	        }
		}
	}

}
