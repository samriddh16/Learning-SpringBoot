<%@ page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red;text-align:center"> Student Registration Form </h1>

<!-- REMEMBER:-
     1) When we use jsp form tags then by default method type is POST so we need not to mention 
        it in the form tag
     2) Giving modelAttribute is mandatory
     3) If the request path of form launching is same as request path of form submission (like here is
        "register") then we and remove action attribute in the form tag
 -->
<frm:form action="./register" method="POST" modelAttribute="stud">
   <table border="0"  bgcolor="coral" align="center">
      <tr>
         <td>Student Id :: </td>
         <!-- Here name should be same as model class attribute name -->
         <td><frm:input path="sroll"/> </td>
      </tr>
        <tr>
         <td>Student Name :: </td>
         <td><frm:input path="sname"/> </td>
      </tr>
       <tr>
         <td>Student Age :: </td>
         <td><frm:input path="sage"/> </td>
      </tr>
      <tr>
        <tr>
         <td>Student Address:: </td>
         <td><frm:input path="saddr"/> </td>
      </tr>
        <td colspan="2" style="text-align: center;"><input type="submit" value="Register"> </td>
      </tr>
   
   </table>

</frm:form>