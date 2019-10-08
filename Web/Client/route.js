var myApp = angular.module("myApp", ["ngRoute"]);

myApp.config(["$routeProvider", function ($routeProvider) {
  $routeProvider
    .when("/home", {
      templateUrl: "views/home.html"
    })
    .when("/clicksearch/:name", {
      templateUrl: "views/search-result.html",
      controller: "SearchCtrl"
    })
    .when("/clickdetail/:id", {
      templateUrl: "views/book-detail.html",
      controller: "DetailCtrl"
    })
    .otherwise({
      redirectTo: "/home"
    });
}]);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
myApp.controller('SearchCtrl', function ($scope, $http, $routeParams) {

});

