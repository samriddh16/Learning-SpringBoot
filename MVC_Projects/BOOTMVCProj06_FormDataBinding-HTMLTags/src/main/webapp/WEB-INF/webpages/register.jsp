<h1 style="color:red;text-align:center"> Student Registration Form </h1>

<form action="./register" method="POST">
   <table border="0"  bgcolor="coral" align="center">
      <tr>
         <td>Student Id :: </td>
         <!-- Here name should be same as model class attribute name -->
         <td><input type="text" name="sroll"> </td>
      </tr>
        <tr>
         <td>Student Name :: </td>
         <td><input type="text" name="sname"> </td>
      </tr>
       <tr>
         <td>Student Age :: </td>
         <td><input type="text" name="sage"> </td>
      </tr>
      <tr>
        <tr>
         <td>Student Address:: </td>
         <td><input type="text" name="saddr"> </td>
      </tr>
        <td colspan="2" style="text-align: center;"><input type="submit" value="Register"> </td>
      </tr>
   
   </table>

</form>