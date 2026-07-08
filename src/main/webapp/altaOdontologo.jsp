<%-- 
    Document   : altaOdontologo
    Created on : 7 jul. 2026, 07:45:12
    Author     : alonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyInicio.jsp"%>

<form class="user">

    <div class="text-center">
        <h1 class="h4 text-gray-900 mb-4">Registrar odontólogo</h1>
    </div>

    <div class="row justify-content-center">
        <div class="col-lg-6 col-md-8">

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="boleta"
                       placeholder="Boleta">
            </div>

            <div class="form-group">
                <input type="text"
                       class="form-control form-control-user"
                       id="nombres"
                       placeholder="Nombres">
            </div>

            <div class="form-group">
                <input type="email"
                       class="form-control form-control-user"
                       id="apellidos"
                       placeholder="Apellidos">
            </div>

            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="telefono"
                       placeholder="Teléfono">
            </div>

            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="direccion"
                       placeholder="Dirección">
            </div>
            
            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="fecha"
                       placeholder="Fecha de nacimiento">
            </div>
            
            <div class="form-group">
                <input type="password"
                       class="form-control form-control-user"
                       id="especialidad"
                       placeholder="Especialidad">
            </div>

            <a href="login.html" class="btn btn-primary btn-user btn-block">
                Registrar
            </a>
        </div>
    </div>
</form>

<%@include file="components/bodyFin.jsp"%>
