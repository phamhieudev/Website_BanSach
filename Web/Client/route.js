var myApp = angular.module("myApp", ["ngRoute"]);

myApp.config(["$routeProvider", function ($routeProvider) {
  $routeProvider
    .when("/home", {
      templateUrl: "views/home.html"
    })
    .when("/shop", {
      templateUrl: "views/shop.html"
    })
    .when("/checkout", {
      templateUrl: "views/checkout.html"
    })
    .when("/myaccount", {
      templateUrl: "views/myaccount.html"
    })
    .when("/blog", {
      templateUrl: "views/blog.html"
    })
    .when("/cart", {
      templateUrl: "views/cart.html"
    })
    .when("/login", {
      templateUrl: "views/login.html"
    })
    .when("/register", {
      templateUrl: "views/register.html"
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

