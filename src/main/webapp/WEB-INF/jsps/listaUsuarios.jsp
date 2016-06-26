<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tiles:insertDefinition name="layout.default">

	<tiles:putAttribute name="title"> Listar Usuários Cadastrados </tiles:putAttribute>
	
	<tiles:putAttribute name="body">
	
		<table>
		
			<c:forEach items ="${listaUsuarios}" var="usuario">
				
				<tr>
					<td>${usuario.codigo}</td>
					<td><c:out value="${usuario.nomeCompleto}"/></td>
					<td><c:out value="${usuario.usuario}"/></td>
					<td><c:out value="${usuario.senha}"/></td>
				</tr>
			</c:forEach>	
				
		</table>
	</tiles:putAttribute>
</tiles:insertDefinition>