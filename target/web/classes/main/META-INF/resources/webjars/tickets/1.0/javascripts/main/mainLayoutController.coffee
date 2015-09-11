
$('#contentScroll').slimScroll
	alwaysVisible: true
	height: '80%'

$(document).on "click", ".has-drop", (event) ->
	if $(this).hasClass 'clicked'
		$(this).removeClass 'clicked'
	else
		$(this).addClass 'clicked'

$(document).click (event)->
	if!event
		event = window.event
	# console.log event.target
	if event.target.className == 'profileTrigger' 
		$( ".menu-profile" ).fadeToggle 'fast' 
	else
		state = $( ".menu-profile" ).css 'display'
		# console.log(state);
		if state == "block"
			$( ".menu-profile" ).css 'display', 'none'
