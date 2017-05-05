var appDizimista = angular.module('myApp', []);
appDizimista.controller('myCtrl', function($scope, $http) {
	 $http.get("http://localhost:8080/dizimista")
	    .then(function(response) {
	        $scope.myWelcome = response.data;
	    });
	   
   
});