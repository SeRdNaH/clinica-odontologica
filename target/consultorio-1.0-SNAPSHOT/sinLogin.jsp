<%-- 
    Document   : loginError.jsp
    Created on : 9 jul. 2026, 09:00:15
    Author     : alonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Iniciar sesión</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary d-flex align-items-center justify-content-center" style="min-height:100vh;">

    <div class="container">

        <div class="row justify-content-center">

            <!-- Ancho del login -->
            <div class="col-xl-4 col-lg-5 col-md-7">

                <div class="card border-0 shadow-lg">
                    <div class="card-body p-5">

                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Iniciar sesión</h1>
                        </div>

                        <form class="user" action="svLogin" method="POST">
                            <div class="alert alert-danger" role="alert">
                            Por favor, inicia sesión.
                            </div>

                            <div class="form-group">
                                <input type="text"
                                       class="form-control form-control-user"
                                       id="usuario"
                                       placeholder="Usuario"
                                       name="usuario">
                            </div>

                            <div class="form-group">
                                <input type="password"
                                       class="form-control form-control-user"
                                       id="contrasena"
                                       placeholder="Contraseña"
                                       name="contrasena">
                            </div>

                            <button type="submit" class="btn btn-primary btn-user btn-block">
                                Iniciar sesión
                            </button>

                        </form>

                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

</body>
</html>
