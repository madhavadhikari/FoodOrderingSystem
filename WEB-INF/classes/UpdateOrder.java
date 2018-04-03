import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.sql.*;
public class UpdateOrder extends HttpServlet { 
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response) 
	throws IOException, ServletException 
	{ 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String query = "update orderbycostomers set Dew = 4 where TableNo=2";
		Connection cn=MySqlConnector.getConnection();
		 String url="jdbc:mysql://localhost:3306/fooddatabase";
		String con="com.mysql.jdbc.Driver";
		try{
			Class.forName(con);
			cn=DriverManager.getConnection(url,"root","");
			try{ 
            	Statement stat = cn.createStatement();
			    stat.executeUpdate(query);
			    out.println("UPDATE SUCESSFULLY");
                

			}    
		        catch(Exception e)
		    {
			out.println("errrrror"+e.getMessage());
		    }
		}catch(Exception e){
			out.println("ERRORRRR"+e.getMessage());
	}
}
}		    