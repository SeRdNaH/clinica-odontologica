<%-- 
    Document   : consultarUsuario
    Created on : 8 jul. 2026, 08:34:42
    Author     : alonso
--%>

<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyInicio.jsp"%>


                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Consultar usuarios</h1>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Usuarios actuales</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre</th>
                                            <th>Rol</th>
                                            <th style="white-space: nowrap;">Acción</th>
                                        </tr>
                                    </thead>
                                    <%
                                        List<Usuario> usuarios = (List) request.getSession().getAttribute("usuarios");
                                    %>
                                    <tbody>
                                        <%for (Usuario usuario1 : usuarios) {%>
                                        <tr>
                                            <td id="id<%=usuario1.getId()%>"><%=usuario1.getId()%></td>
                                            <td><%=usuario1.getNombre()%></td>
                                            <td><%=usuario1.getRol()%></td>
                                            
                                            <td style="white-space: nowrap;">
                                                <div class="d-flex justify-content-center">
                                                    <form action="svEliminarUsuario" method="POST" class="mr-2 mb-0">
                                                        <input type="hidden" name="id" value="<%=usuario1.getId()%>">

                                                        <button type="submit" class="btn btn-danger btn-sm px-2">
                                                            <i class="fas fa-trash-alt mr-1"></i> Eliminar
                                                        </button>
                                                    </form>

                                                    <form action="svEditarUsuario" method="GET" class="mb-0">
                                                        <input type="hidden" name="id" value="<%=usuario1.getId()%>">

                                                        <button type="submit" class="btn btn-primary btn-sm px-2">
                                                            <i class="fas fa-pencil-alt mr-1"></i> Editar
                                                        </button>
                                                    </form>
                                                </div>
                                            </td>
                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

<%@include file="components/bodyFin.jsp"%>
