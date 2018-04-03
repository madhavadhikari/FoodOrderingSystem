import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.sql.*;
public class CreateBill extends HttpServlet { 
	public void doGet(HttpServletRequest request,
	 HttpServletResponse response) 
	throws IOException, ServletException 
	{ 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
        String createbill = request.getParameter("createbill");
		String display = "select * from orderbycostomers where TableNo=" +createbill;
		Connection cn=MySqlConnector.getConnection();
		try{
			ResultSet rs ;
			Statement stat = cn.createStatement();
			rs = stat.executeQuery(display);
			while(rs.next()){
				 int tablenumber = rs.getInt("TableNo");
				 int  vchalf = rs.getInt("VegChowminHalf");
				 int vcfull= rs.getInt("VegChowminFull");
				int bchalf= rs.getInt("BuffChowminHalf");
				int bcfull= rs.getInt("BuffChowminFull");
				int vmhalf= rs.getInt("VegMoMoHalf");
				int vmfull= rs.getInt("VegMoMoFull");
				int bmhalf= rs.getInt("BuffMoMoHalf");
				int bmfull= rs.getInt("BuffMoMoFull");
				int numofdew= rs.getInt("Dew");
				int numofslice= rs.getInt("Slice");
				int numofsurya= rs.getInt("Surya");
                 int vchalfp=60;
                 int vcfullp=120;
                 int bchalfp=70;
                 int bcfullp=140;
                 int vmhalfp=75;
                 int vmfullp=150;
                 int bmhalfp=100;
                 int bmfullp=200;
                 int numofdewp=70;
                 int numofslicep=60;
                 int numofsuryap=20;
                 float discount=Float.parseFloat(request.getParameter("discount")); 
                 double ftotal; 
             
                out.println("Table Number:" +tablenumber);
                out.println("<br>");
                out.println("<br>");
                out.println("Items:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println("Qty:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");          out.println("Amount:");    
                out.println("<br>");
                out.println("VegChowminHalf:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println(+vchalf+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");       out.println(vchalfp*vchalf);     
                out.println("<br>");
                out.println("VegChowminFull:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println(+vcfull+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");       out.println(vcfullp*vcfull);
                out.println("<br>");
                out.println("BuffChowminHalf:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");        out.println(+bchalf+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println(bchalfp*bchalf);
                out.println("<br>");
                out.println("BuffChowminFull:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");        out.println(+bcfull+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");          out.println(bcfull*bcfullp);
                out.println("<br>");
                out.println("VegMoMoHalf:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");            out.println(+vmhalf+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");          out.println(vmhalf*vmhalfp);
                out.println("<br>");
                out.println("VegMoMoFull:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");            out.println(+vmfull+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");          out.println(vmfull*vmfullp);
                out.println("<br>");
                out.println("BuffMoMoHalf:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");           out.println(+bmhalf+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");           out.println(bmhalf*bmhalfp);
                out.println("<br>");
                out.println("BuffMoMoFull:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");           out.println(+bmfull+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");           out.println(bmfullp*bmfull);
                out.println("<br>");
                out.println("Dew:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");                    out.println(+numofdew+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");           out.println(numofdewp*numofdew);
                out.println("<br>");
                out.println("Slice:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");                  out.println(+numofslice+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println(numofslice*numofslicep);
                out.println("<br>");
                out.println("Surya:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");                  out.println(+numofsurya+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");         out.println(numofsurya*numofsuryap);
               out.println("<br>");
                out.println("------------------------------------------------");
                 out.println("<br>");

                int total;
                total=vchalf*vchalfp+vcfull*vcfullp+bchalf*bchalfp+bcfull*bcfullp+vmhalf*vmhalfp+vmfull*vmfullp+bmhalf*bmhalfp+bmfull*bmfullp+numofdew*numofdewp+numofslice*numofslicep+numofsurya*numofsuryap;
                int sca=0;
                int  scb=100;
        

                 if(total<500)
                 {
                    out.println("Total:" +total);
                     out.println("<br>");
                    ftotal=total+sca-discount*total;
                    out.println("Service Charge:" +sca);
                    out.println("<br>");
                    float dis=(discount*100);
                out.println("Discount:&nbsp&nbsp" +dis+"%");  
                out.println("<br>");
                out.println("Discount Amount:&nbsp&nbspRs." +discount*total);
                out.println("<br>");
                out.println("Final Amount:&nbsp&nbspRs." +ftotal);
                 out.println("<br>");
                out.println("Thanks for visiting us.......&nbsp&nbsp:-)");
        

                     
                 }
                 else if(500<=total)
                 {
                     float dis=(discount*100);

                    out.println("Total:" +total);
                    out.println("<br>");
                    out.println("Discount:&nbsp&nbsp" +dis+"%");  
                out.println("<br>");
                out.println("Discount Amount:&nbsp&nbspRs." +discount*total);
                 out.println("<br>");
                    ftotal=total+scb-discount*total;
                    out.println("Service Charge:" +scb);
                    out.println("<br>");
                  
                
            
                out.println("Final Amount:&nbsp&nbspRs." +ftotal);
                 out.println("<br>");
                out.println("Thanks for visiting us.......&nbsp&nbsp:-)");
                  }
                
            }     

		}catch(Exception e){
			out.println("Error:\n"+e.getMessage());
		}
	} 
}