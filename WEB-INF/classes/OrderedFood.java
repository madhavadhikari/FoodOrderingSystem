import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class OrderedFood extends HttpServlet{
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException
{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String tablenumber=request.getParameter("tablenumber");
	String vchalf=request.getParameter("vchalf");
	String vcfull=request.getParameter("vcfull");
	String bchalf=request.getParameter("bchalf");
	String bcfull=request.getParameter("bcfull");
	String vmhalf=request.getParameter("vmhalf");
	String vmfull=request.getParameter("vmfull");
	String bmhalf=request.getParameter("bmhalf");
	String bmfull=request.getParameter("bmfull");
	String numofsurya=request.getParameter("numofsurya");
	String numofdew=request.getParameter("numofdew");
	String numofslice=request.getParameter("numofslice");
	String query = "insert into orderbycostomers(TableNo,VegChowminHalf,VegChowminFull,BuffChowminHalf,BuffChowminFull,VegMoMoHalf,VegMoMoFull,BuffMoMoHalf,BuffMoMoFull,Dew,Slice,Surya) values ('"+tablenumber+"','"+vchalf+"','"+vcfull+"','"+bchalf+"','"+bcfull+"','"+vmhalf+"','"+vmfull+"','"+bmhalf+"','"+bmfull+"','"+numofdew+"','"+numofslice+"','"+numofsurya+"')";
    String url="jdbc:mysql://localhost:3306/fooddatabase";
		String con="com.mysql.jdbc.Driver";
		Connection cn=null;
		try
		{
			Class.forName(con);
			cn=DriverManager.getConnection(url,"root","");
			try{ 
            	Statement stat = cn.createStatement();
			    stat.executeUpdate(query);
			    out.println("SUBMITTED SUCESSFULLY");
			    out.println("<br>");
			    out.println("THANKS FOR ORDERING. :-)");
	
                

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