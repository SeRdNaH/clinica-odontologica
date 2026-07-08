<%-- 
    Document   : altaUsuario
    Created on : 7 jul. 2026, 11:14:22
    Author     : alonso
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyInicio.jsp"%>

<form class="user" action="svUsuario" method="POST">

    <div class="text-center">
        <h1 class="h4 text-gray-900 mb-4">Registrar usuario del sistema</h1>
    </div>

    <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8">

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="nombre"
                       name="nombre"
                       placeholder="Nombre de usuario">
            </div>

            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="contrasena"
                       name="contrasena"
                       placeholder="Contraseña">
            </div>

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="rol"
                       name="rol"
                       placeholder="Rol">
            </div>

            <button class="btn btn-primary btn-user btn-block" type="submit">
                Registrar
            </button>
        </div>
    </div>
</form>

<%@include file="components/bodyFin.jsp"%>
