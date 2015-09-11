$(document).ready(function(){
	//funcion de login
	$("#entrar").click(function(event){
		event.preventDefault();
		var nombres = $("#nombreUsuario").val();
		var pass = $("#password").val();
		alert(nombre + " : " + pass);
		// $.ajax({
  //           url: "/index/entrar",
  //           type: 'POST',
  //           dataType: 'json',
  //           contentType: "application/json",
  //           data: JSON.stringify({nombre:nombres, password:pass,}),
  //           beforeSend: function(){
  //           	alert("enviandsss");
  //           },
  //           error: function(){
  //           	alert("error");
  //           },
  //        }).done(function(data){
  //        	alert(data);
  //        });
         return false;
	});
});