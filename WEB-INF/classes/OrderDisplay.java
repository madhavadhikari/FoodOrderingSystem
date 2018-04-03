import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.sql.*;
public class OrderDisplay extends HttpServlet { 
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response) 
	throws IOException, ServletException 
	{ 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String display = "select * from orderbycostomers";
		Connection cn=MySqlConnector.getConnection();
		out.println("<html>");
		try{
			ResultSet rs ;
			Statement stat = cn.createStatement();
			rs = stat.executeQuery(display);
			out.println("<table border=5 width=2% height=15%>");
			out.println("<tr><th>TableNo</th><th>VegChowminHalf</th><th>VegChowminFull</th><th>BuffChowminHalf</th><th>BuffChowminFull</th><th>VegMoMoHalf</th><th>VegMoMoFull</th><th>BuffMoMoHalf</th><th>BuffMoMoFull</th><th>Dew</th><th>Slice</th><th>Surya</th></tr>");
			while(rs.next()){
				String tablenumber = rs.getString("TableNo");
				String vchalf = rs.getString("VegChowminHalf");
				String vcfull= rs.getString("VegChowminFull");
				String bchalf= rs.getString("BuffChowminHalf");
				String bcfull= rs.getString("BuffChowminFull");
				String vmhalf= rs.getString("VegMoMoHalf");
				String vmfull= rs.getString("VegMoMoFull");
				String bmhalf= rs.getString("BuffMoMoHalf");
				String bmfull= rs.getString("BuffMoMoFull");
				String numofdew= rs.getString("Dew");
				String numofslice= rs.getString("Slice");
				String numofsurya= rs.getString("Surya");
				out.println("<tr><td>" + tablenumber + "</td><td>" + vchalf + "</td><td>" + vcfull + "</td><td>" + bchalf + "</td><td>" + bcfull + "</td><td>" + vmhalf + "</td><td>" + vmfull + "</td><td>" + bmhalf + "</td><td>" + bmfull + "</td><td>" + numofdew + "</td><td>" + numofslice + "</td><td>" + numofsurya + "</td></tr>");
			}
			out.println("</table>");
			out.println("</html>");
			rs.close();
		}catch(Exception e){
			out.println("Error:\n"+e.getMessage());
		}
	} 
}