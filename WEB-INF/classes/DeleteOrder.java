import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.sql.*;
public class DeleteOrder extends HttpServlet { 
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response) 
	throws IOException, ServletException 
	{ 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String delete=request.getParameter("delete");
        String query ="delete from orderbycostomers where TableNo="+delete;
		Connection cn=MySqlConnector.getConnection();
		String url="jdbc:mysql://localhost:3306/fooddatabase";
		String con="com.mysql.jdbc.Driver";
		try{
			Class.forName(con);
			cn=DriverManager.getConnection(url,"root","");
			try{ 
            	Statement stat = cn.createStatement();
			    stat.executeUpdate(query);
			    out.println("TABLE NUMBER:" +delete);
			    out.println("DELETED SUCESSFULLY");
                

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