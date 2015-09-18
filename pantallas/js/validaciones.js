$(document).ready(function() {
	//Validaciones hechas con la libreri de bootstrapValidator consulta en http://www.solvetic.com/tutoriales/article/1339-validaciones-con-bootstrap-validator/
	//vaidaciones del loguin
	$("#loguin").bootstrapValidator({
		message:'este valor no es valido',
		feedbackIcons:{
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
		 	nombre: {
				validators: {
					notEmpty: {
						message: 'El nombre de usuario es requerido'
				 	}
			 	}
		 	},
		 	password: {
			 	validators: {
				 	notEmpty: {
					 	message: 'La contraseña es requerida'
				 	},
				 	stringLength: {
					 	min: 8,
					 	message: 'El password debe contener al menos 8 caracteres'
				 	}
			 	}
		 	}
	 	}
	});

	$('#agregarTickets').bootstrapValidator({
		message:'este valor no es valido',
		feedbackIcons:{
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
	});
});	