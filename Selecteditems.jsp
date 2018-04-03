<html>
<head>
	<title></title>
    <style>
input[type=Submit] {
    width: 150px;
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
<body style="background-color : maroon">
<h2 style="color : maroon;text-align : right">Table Number: 2</h2>
<h4 style="color: white;font-size: 18px;">
              <form action="./regis" method="post">



<%    
        String atablenumber=request.getParameter("tablenumber");
        String avchalf=request.getParameter("vchalf");
        String avcfull=request.getParameter("vcfull");
        String abchalf=request.getParameter("bchalf");
        String abcfull=request.getParameter("bcfull");
        String avmhalf=request.getParameter("vmhalf");
        String avmfull=request.getParameter("vmfull"); 
        String abmhalf=request.getParameter("bmhalf");
        String abmfull=request.getParameter("bmfull");  
        String anumofdew=request.getParameter("numofdew"); 
        String anumofslice=request.getParameter("numofslice"); 
        String anumofsurya=request.getParameter("numofsurya");


        %>
Your inputted items:<br><br>
Table Number:
              <% 
                
                 out.println(atablenumber);
              %><br>
Veg Chowmin:
        Half plate:<% 
                      
                      out.println(avchalf);
                    %>
        Full plate:<% 
                  
                      out.println(avcfull); 
                    %>
             <br>
Buff Chowmin:
            Half plate:<%
                  
                          out.println(abchalf);
                       %>
            Full plate:<%
                        
                          out.println(abcfull);
                        %>
                <br>
Veg MOMO:
        Half plate:<%
                        
                         out.println(avmhalf);
                   %>
        Full plate:<%
                         out.println(avmfull);
                   %>
             <br>
Buff MOMO:
          Half plate:<%
                      
                         out.println(abmhalf);
                     %>
        Full plate:<%
                         
                         out.println(abmfull);
                   %>     
             <br>
Mountain Dew: 
             <%
                    
                     out.println(anumofdew);
              %>
             <br>
Slice:
      <%
          
             out.println(anumofslice);
       %><br>
Surya:
                  <%
                         
                         out.println(anumofsurya);
                   %>
              <br> 
           <input type="Submit" value="Verify">
</form></h4>
</body>
</html>


<html>
<head>
	<title></title>
	<style>
input[type=Submit] {
    width: 150px;
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
       <form method="post" action="Menu.jsp"/>
       <input type="Submit" value="Update"/>
         </form>
</body>
</html> 


