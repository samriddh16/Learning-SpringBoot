<%@page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- For Simple Values -->
<%-- <h2 style= "color:coral; text-align: center;">Name- ${name}<br> Designation- ${desig} </h2> --%>

<!-- For Collections Values -->
<!-- Here we are writing java code in the jsp pages (its not a good practice) -->
<%-- <h2 style= "color:coral; text-align: center;">Names- <%=Arrays.toString((String[])request.getAttribute("names")) %> </h2>
<h2 style= "color:coral; text-align: center;">Desinations- ${desigs}<br> IDs- ${ids} </h2> --%>

<!-- Using JSTL Library for collections -->

<!-- This forEach is not working due to some reason so just learn the concept like how we use jstl 
syntax for display -->
<c:if test="${!empty names}">
	<br>
	<b> Names :: </b>
	<c:forEach var="name" items="${names}">
                 ${name},
           </c:forEach>
</c:if>
<br>

<c:if test="${!empty desigs}">
	<br>
	<b> Desginations :: </b>
	<c:forEach var="desig" items="${desigs}">
                 ${desig},
           </c:forEach>
</c:if>
<br>

<c:if test="${!empty ids}">
	<br>
	<b> IDs :: </b>
	<c:forEach var="id" items="${ids}">
                 ${id},
           </c:forEach>
</c:if>
<br>

<c:if test="${!empty idDetails}">
	<br>
	<b> the idDetails are :: </b>
	<c:forEach var="id" items="${idDetails}">
                 ${id},
           </c:forEach>
</c:if>
<br>

 <b> Emp Data  :: ${empData}  </b>  <br>
   
   <c:if  test="${!empty empData}">
         <b> Emp Data  :: ${empData}  </b>
   </c:if>
   
   <c:choose>
     <c:when test="${!empty empsList}">
        <table bgcolor="yellow"  align="center" border="1">
           <tr> <th> eno</th>  <th> ename</th> <th> eaddrs</th> <th> salary</th> </tr>
           <c:forEach var="emp" items="${empsList}">
              <tr>
                <td>${emp.eno}  </td>
                <td>${emp.ename}  </td>
                <td>${emp.eaddrs}  </td>
                <td>${emp.salary}  </td>
              </tr>
           </c:forEach> 
        
        </table>
     
     </c:when>
   </c:choose>