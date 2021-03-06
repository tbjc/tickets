console.log('Modulo de empleado');
$(function() {
   var arrayJsonObject;
   var varRecords;
   var uri = "/empleado";
   var defaultTemplate = _.template($("#object-Template").html());
   var contentTemplate;
   Evomatik.console.log("empleado");
   //poblar el select
   $.ajax({
            url: '/departamento/list',
            type: 'GET',
            dataType: 'json',
            async: false,
            //data: {param1: 'value1'},
         }).done(function(deptos){
            Evomatik.console.log(deptos);
            $.each(deptos, function(numero,depa){
               Evomatik.console.log("<option value= "+depa.id+" > "+depa.nombre+" </option>");
               $(".depto").append("<option value="+depa.id+">"+depa.nombre+"</option>");
            });
         });

   $.ajax({
         url: uri+"/list",
         type: 'GET',
         dataType: 'json',
         // contentType: 'application/json',
         // data: '{"descripcion":"Cambiado descripcion"}',
      })
      .done(function(data) {
         Evomatik.console.log("DATA: "+data);
         Evomatik.console.log(data);
         Evomatik.console.log("success");
         arrayJsonObject = data;
         var varRecords = {records:[]};
         varRecords.records.push(arrayJsonObject);
         Evomatik.console.log(varRecords);
         //varRecords = JSON.parse(change);
         contentTemplate = defaultTemplate({Objects : arrayJsonObject});
         $(".construct-content").html(contentTemplate);
         $('.contentTable').DataTable();
      })
      .fail(function(data) {
         Evomatik.console.log(data);
         Evomatik.console.log("error");
      })
      .always(function() {
         Evomatik.console.log("complete");
      });


   $("body").on('click', '#editActionbtn', function(event) {
         event.preventDefault();
         var id = $(this).attr('data-id');

         //obtener al empleado
         $.ajax({
            url: uri+'/show/'+id,
            type: 'GET',
            dataType: 'json',
            async: false,
            //data: {param1: 'value1'},
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log("DATA: "+data);
            Evomatik.console.log(data);
            $("#nombre[data-edit='true']").val(data.nombre);
            $("input[id='id']").val(data.id);
            $("#editModal").addClass('active');
            $("#depto").val(data.departamento.id);

         })
         .fail(function(data) {
            Evomatik.console.log(data);
            Evomatik.console.log("error");
            alert("error al cargar la informacion del registro, Intentalo nuevamente.");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });   
      });



      $(document).on('click', '.createAction', function(event) {
         event.preventDefault();
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         var data = form.toJsonObject();
         var datos = '{"nombre":"'+$("#nombre2").val()+'","departamento":{"id":"'+$(".depto").val()+'"}}';
         Evomatik.console.log(data);
         $.ajax({
            url: uri,
            type: 'POST',
            contentType: 'application/json',
            data: datos,
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log(data);
            Evomatik.contentTemplate = defaultTemplate({Objects : arrayJsonObject});
            $(".construct-content").html(contentTemplate);
            modal.removeClass('active');
            var t = $('.contentTable').DataTable();
            var rowNode = t.row.add([
                  '<span id="_'+data.id+'">'+data.id+'</span>',
                  '<span id="dis_'+data.id+'">'+data.nombre+'</span>',
                  '<span id="dis_'+data.id+'">'+data.departamento.id+'</span>',
                  '<div class="medium warning btn icon-right icon-pencil"><a href="#" id="editActionbtn" data-id='+data.id+'>Editar</a></div> <div class="medium danger btn icon-right icon-cancel-circled"><a href="#" id="deleteAction" data-id='+data.id+'> Eliminar</a></div>',
               ]).draw().node();

            var prevNode = $(rowNode).prev();
            if(prevNode.hasClass('odd')){
               $(rowNode).attr('class', "object even");
            }else{
                $(rowNode).attr('class', "object odd");
            }
            $(rowNode).attr('data-row', "_"+data.id);
            $(rowNode).attr('role', "row");

         })
         .fail(function() {
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
      });   

      $(document).on('click', '.editAction', function(event) {
         event.preventDefault();
         var id = $("input[id='id']").val();
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         var data = form.toJsonObject();
         var datos = '{"nombre":"'+$("#nombre").val()+'","departamento":{"id":"'+$(".depto").val()+'"}}';
         Evomatik.console.log(form.serialize());
         Evomatik.console.log(datos);
         $.ajax({
            url: uri+'/'+id,
            type: 'PUT',
            contentType: 'application/json',
            data: datos,
            // data: data2,
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log(data);
            $("#dis_"+data.id).text(data.nombre);
            form.resetear();
            modal.removeClass('active');
         })
         .fail(function(data) {
            Evomatik.console.log(data);
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
      }); 

   $(document).on('click', '#deleteAction', function(event) {
      event.preventDefault();
      var id = $(this).attr('data-id');
      $.ajax({
            url: uri+'/'+id,
            type: 'DELETE',
         })
         .done(function() {
            Evomatik.console.log("success deleted");
            var t = $('.contentTable').DataTable();
            t.row('.object[data-row="_'+id+'"]').remove().draw( false );   
         })
         .fail(function() {
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
   });



      $(document).on('click', '.cancelAction', function(event) {
         event.preventDefault();
         /* Act on the event */
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         form.resetear();
         $("input[id='id']").val("");
         modal.removeClass('active');
      }); 



});