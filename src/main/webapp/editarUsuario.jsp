<%-- 
    Document   : editarUsuario
    Created on : 8 jul. 2026, 11:24:41
    Author     : alonso
--%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyInicio.jsp"%>

<% Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");%>

<form class="user" action="svEditarUsuario" method="POST">

    <div class="text-center">
        <h1 class="h4 text-gray-900 mb-4">Editar usuario</h1>
    </div>

    <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8">

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="nombre"
                       name="nombre"
                       placeholder="Nombre de usuario" value="<%=usuario.getNombre()%>">
            </div>

            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="contrasena"
                       name="contrasena"
                       placeholder="Contraseña" value="<%=usuario.getContrasena()%>">
            </div>

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="rol"
                       name="rol"
                       placeholder="Rol" value="<%=usuario.getRol()%>">
            </div>

            <button class="btn btn-primary btn-user btn-block" type="submit">
                Actualizar
            </button>
        </div>
    </div>
</form>

<%@include file="components/bodyFin.jsp"%>
