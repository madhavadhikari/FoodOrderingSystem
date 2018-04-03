
<!DOCTYPE html>
<html>
<head>
    <title>Order by Costomers</title>
</head>
<body>

</body>
</html>

<table>
<%@page import="java.sql.*" %>
<%		String url="jdbc:mysql://localhost:3306/fooddatabase";
		String con="com.mysql.jdbc.Driver";
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName(con);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
%>
<tr bgcolor="#A52A2A" style="color: white;font-size: 14px;">
<td><b>TableNo</b></td>
<td><b>VegChowminHalf</b></td>
<td><b>VegChowminFull</b></td>
<td><b>BuffChowminHalf</b></td>
<td><b>BuffChowminFull</b></td>
<td><b>VegMoMoHalf</b></td>
<td><b>VegMoMoFull</b></td>
<td><b>BuffMoMoHalf</b></td>
<td><b>BuffMoMoFull</b></td>
<td><b>Dew</b></td>
<td><b>Slice</b></td>
<td><b>Surya</b></td>
</tr>
<%
		try{
			cn=DriverManager.getConnection(url,"root","");
            st = cn.createStatement();
			rs =st.executeQuery("SELECT * FROM orderbycostomers");
			while(rs.next()){
%>
<tr bgcolor="#DEB887" >

<td><%=rs.getString("TableNo") %></td>
<td><%=rs.getString("VegChowminHalf") %></td>
<td><%=rs.getString("VegChowminFull") %></td>
<td><%=rs.getString("BuffChowminHalf") %></td>
<td><%=rs.getString("BuffChowminFull") %></td>
<td><%=rs.getString("VegMoMoHalf") %></td>
<td><%=rs.getString("VegMoMoFull") %></td>
<td><%=rs.getString("BuffMoMoHalf") %></td>
<td><%=rs.getString("BuffMoMoFull") %></td>
<td><%=rs.getString("Dew") %></td>
<td><%=rs.getString("Slice") %></td>
<td><%=rs.getString("Surya") %></td>

</tr>

<% 
	}
	}catch(Exception e){
			e.printStackTrace();
		}
%>
</table>





<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style>
input[type=Submit] {
    width: 120px;
    padding: 10px 15px;
    background-color:green;
    color: white;
    margin: 10px;
    font-size: 120%;
    box-sizing: border-box;
    border: 1px solid grey;
    border-radius: 1px;
}
</style>
</head>
<body>
<form action="./updateorder"/>
<h3 style="color: maroon;">
Update the values of Table :
	<input type="Submit" value="Update"/>
</form>
</h3>
 </body>
</html>



<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style>
input[type=Submit] {
    width: 120px;
    padding: 10px 15px;
    background-color:green;
    color: white;
    margin: 10px;
    font-size: 120%;
    box-sizing: border-box;
    border: 1px solid grey;
    border-radius: 1px;
}
</style>
</head>
<body>
<form action="./delete"/>
<h3 style="color: maroon;">
     Select Table to delete  <select name="delete">
                                 <option value="1">1</option>
                                 <option value="2">2</option>
                                 <option value="3">3</option>
                                 <option value="4">4</option>
                                 <option value="5">5</option>
                                 <option value="6">6</option>
                                 <option value="7">7</option>
                                 <option value="8">8</option>
                                 </select>:&nbsp;&nbsp;&nbsp;
     <input type="Submit" value="Delete"/>
</form>
</h3>
 </body>
</html>







<!DOCTYPE html>
<html>
<head>
	<title></title>
		<style>
input[type=Submit] {
    width: 120px;
    padding: 10px 15px;
    background-color:green;
    color: white;
    margin: 10px;
    font-size: 80%;
    box-sizing: border-box;
    border: 1px solid grey;
    border-radius: 1px;
}
</style>
</head>
<body>
<form action="./createbill"/>
<h3 style="color: maroon;">
Create Bill for Table <select name="createbill">
                       <option value="1">1</option>
                       <option value="2">2</option>
                       <option value="3">3</option>
                       <option value="4">4</option>
                       <option value="5">5</option>
                       <option value="6">6</option>
                      <option value="7">7</option>
                      <option value="8">8</option>
                       </select>
        
        Discount for Table <select name="discount">
                      <option value="0.0">0%</option>
                      <option value="0.1">10%</option>
                   <option value="0.2">20%</option>
                   <option value="0.3">30%</option>
            </select>:
	<input type="Submit" value="Create Bill"/>
</form>
</h3>
</body>
</html>



