<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/cabecalho.jsp"%>
<div class="container">
  <table style="margin-top:60px;" class="table table-hover table-striped">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Descrição</th>
        <th>Data</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${eventos}" var="evento">
      <tr>
        <td>${evento.nome}</td>
        <td>${evento.descricao}</td>
        <td>${evento.data}</td>
        <td><a href="#"><span class="glyphicon glyphicon-info-sign"/></a>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <%@include file="/WEB-INF/pages/rodape.jsp"%>
  </div>
  