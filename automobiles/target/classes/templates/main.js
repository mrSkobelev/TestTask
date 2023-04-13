$(function() {
  const appendCar = function(data) {
    var carCode = '<a href="#" data-id="' + data.id + '">' + data.name + '</a><br>';
    $('#car-make-list').append('<div>' + carCode + '</div>');
  };

  $.get('/cars/', function(response)) {
    for (i in response) {
      appendCar(response[i])
    };
  };

})