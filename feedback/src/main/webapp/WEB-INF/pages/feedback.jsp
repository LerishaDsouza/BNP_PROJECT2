<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
#sub{
text-align:center;
}
</style>
<title>feedback</title>
</head>
<body>
<h1> Feedback Form</h1>
<hr>
<br>
	<form method = "post" action= "/feedback">
		<table bgcolor="LightBlue" align="CENTER" border="0">
	
		    <tr>
		    <td align="CENTER">Full Name:</yd> 
		    <td align="CENTER"> <INPUT type="text" name="uname" required></td>
		    </tr>
		    
		    <tr>
		    <td align="CENTER">Organization:</yd> 
		    <td align="CENTER"> <INPUT type="text" name="org" required></td>
		    </tr>
		    
		    <tr>
		    <td align="CENTER">Country:</yd> 
		    <td align="CENTER">
		    <select name = "country" required>
		    		<option value=""></option>
            	    <option value = "India">India</option>
                   <option value = "America">America</option>
                   <option value = "Other">Other</option>
         	    </select>
         	     </td>
		    </tr>
		    
		    <tr>
		    <td align="CENTER" >Email:</yd> 
		    <td align="CENTER"> <INPUT type="text" name="email" required></td>
		    </tr>
		    <tr>
		    <td align="CENTER">Professor:</yd> 
		    <td align="CENTER"> <INPUT type="text" name="prof" required></td>
		    </tr>
		    <tr>
		    <td align="CENTER">How would you rate the session</td> 
		    <td align="CENTER"> 
		    <input type="radio" name = "rating" value = "Excellent"> Excellent 
		    <INPUT type="radio" name = "rating" value = "Good"> Good 
		    <INPUT type="radio" name = "rating" value = "Average"> Average 
		    <INPUT type="radio" name = "rating" value = "Poor"> Poor 
		    </td>
		    </tr>
		    <tr>
		    <td align="CENTER">Comments or Suggestions:</TD> 
		    <td> 
		     <textarea name="comments" rows="10" cols="60" required>
		     </textarea>
		    </td>
		    </tr>
		    
		</table>
		<p id="sub"><input type="SUBMIT" value="Submit"></p>
	
	</form>
</body>
</html>