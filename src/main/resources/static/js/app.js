var app = angular.module('appController', []);

app.controller("ctr",function($scope,$http){
	
	 $http.get("http://localhost:8080/dizimista")
	    .then(function(response) {
	        $scope.result = response.data;
	    });
	
});