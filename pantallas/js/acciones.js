$(document).ready(function() {
	//metodo para agregar usuarios a un grupo
	$("#agregar").click(function(event) {
		//console.log($("#selUsuario").val());
		//agregar elementos al ul para el control de los usuarios del grupo
		$("#listaUsuarios").append("<li id='"+$("#selUsuario").val()+"' >"+$("#selUsuario option:selected").text()+"</li>");
		return false;
	});

	//metodo para agregar tickets
	$("#agregarTickets").submit(function(event) {
		//obtenemos el nombre del ticket
		var nombre = $("#nomTicket");

		//obtenemos la descripcion del ticket
		var descripcion = $("#descTicket");

		//Obtenemos tipo de ticket
		var tipo = $('#tipoTicket');

		//Obtenemos la prioridad del ticket
		var prioridad = $('#prioridadTicket');

		
		return false;
	});
	


});