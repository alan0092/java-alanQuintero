<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../../../resources/layout/taglib.jsp"%>

<div>

	<h1>Results</h1>

	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>Movie</th>
				<th>Rating</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${movie}" var="movie">
				<c:choose>
					<c:when test="${empty movie.code}">
						<c:out value="${movie.title}" />
						<tr>
							<td>There are not Movies</td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td><a
								href="<spring:url value="/movie/${movie.code}.html" />"> <c:out
										value="${movie.title}" /> <font color="gray">(<c:out
											value="${movie.year}" />)
								</font>
							</a></td>
							<td><c:out value="${movie.rating}" /></td>
						</tr>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</tbody>
	</table>

</div>