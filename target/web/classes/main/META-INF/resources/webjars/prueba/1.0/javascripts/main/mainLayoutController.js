(function() {
  $('#contentScroll').slimScroll({
    alwaysVisible: true,
    height: '80%'
  });

  $(document).on("click", ".has-drop", function(event) {
    if ($(this).hasClass('clicked')) {
      return $(this).removeClass('clicked');
    } else {
      return $(this).addClass('clicked');
    }
  });

  $(document).click(function(event) {
    var state;
    if (!event) {
      event = window.event;
    }
    if (event.target.className === 'profileTrigger') {
      return $(".menu-profile").fadeToggle('fast');
    } else {
      state = $(".menu-profile").css('display');
      if (state === "block") {
        return $(".menu-profile").css('display', 'none');
      }
    }
  });

}).call(this);

//# sourceMappingURL=mainLayoutController.js.map
