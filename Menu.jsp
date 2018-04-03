<html>
<head>
	<title>Menu</title>
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
       <h2 style="color: white;text-align: right;">Table Number: 2</h2>
       <form  method="post" action="./register" />
        <h4 style="color: white;font-size: 18px;">
       Table Number: <select name="tablenumber">    
                     <option value="1">1</option>
                     <option value="2">2</option>
                     <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                     <option value="6">6</option>
                     <option value="7">7</option>
                     <option value="8">8</option>
                     </select><br><br>
      
       <input type="checkbox" name="vchowmin" value="Veg Chowmin:"/>Veg Chownim: &nbsp;&nbsp;&nbsp;  Rs. 120 per plate &nbsp;&nbsp;&nbsp;
              Half plate: <select name="vchalf"> 
                          <option value="0">0</option>   
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select>
             &nbsp; Full plate: <select name="vcfull">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select> 
                          <br>
       <input type="checkbox" name="bchowmin" value="Buff Chowmin:"/>Buff Chowmin: &nbsp;&nbsp;  Rs. 140 per plate  &nbsp;&nbsp;&nbsp; 
              Half plate: <select name="bchalf">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select>
              &nbsp;&nbsp;Full plate: <select name="bcfull"> 
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select><br>
         <input type="checkbox" name="vmomo" value="Veg MOMO:" />Veg MOMO: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Rs. 150 per plate      &nbsp;&nbsp;&nbsp;    
              Half plate: <select name="vmhalf">
                          <option value="0">0</option>             
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select>
              &nbsp;&nbsp;Full plate: 
                          <select name="vmfull">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select><br>

       <input type="checkbox" name="bmomo" value="Buff MOMO:" />Buff MOMO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Rs.200 per plate        &nbsp;&nbsp;&nbsp;&nbsp;
              Half plate: <select name="bmhalf">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select>
              &nbsp;&nbsp;Full plate: <select name="bmfull">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select><br><br>

       

       <input type="checkbox" name="dew" value="Dew:"/>Dew:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Rs. 70 per piece &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   
                 Quantity:<select name="numofdew">
                          <option value="0">0</option>  
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select> <br>

       <input type="checkbox" name="slice" value="Slice:" />Slice:&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rs. 60 per piece &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;      
                 Quantity:<select name="numofslice">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          </select>  <br> 
        <input type="checkbox" name="surya" value="Surya" />Surya: &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Rs. 20 per piece&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;
              Quantity:   <select name="numofsurya">
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3">3</option>
                          <option value="4">4</option>
                          <option value="5">5</option>
                          <option value="6">6</option>
                          </select> <br>
                          </h4>
       <input type="Submit" value="ORDER"/>
    </form>
</body>
</html>

