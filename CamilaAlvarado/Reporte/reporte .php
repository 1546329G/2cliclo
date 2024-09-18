<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <title>Document</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
    .titulo {
      text-align: center;
    }
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
    }
    form {
        max-width: 400px;
        margin: 0 auto;
    }
    label {
        display: block;
        margin-bottom: 8px;
    }
    input, select {
        width: 100%;
        padding: 8px;
        margin-bottom: 16px;
        box-sizing: border-box;
    }
    button {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body class="p-3 m-0 border-0 bd-example m-0 border-0 bd-example-row">
<div class=titulo>
<h2>Formulario de Reporte de Servicio</h2>
</div>

<form action="/submit" method="post">
    <label for="numero">Seleccione N°PC:</label>
    <select id="numero" name="numero" required>
            
<?php
        for ($i = 1; $i <= 20; $i++) {
            echo "<option value=\"$i\">$i</option>";
        }
?>        
     
</select>
<div class="container text-center">
  <div class="row">
    <div class="col">
      N°PC 
    </div>
    <div class="col">
      Descripcion
    </div>
    <div class="col">
      Gasto S/.
    </div>
  </div>
</div>
<button type="submit" class="btn btn-primary">Actualizar</button>
<button type="submit" class="btn btn-primary">Insertar</button>
<button type="submit" class="btn btn-primary">Eliminar</button>
<button type="submit" class="btn btn-primary">Salir</button>
</form>
</body>
</html>