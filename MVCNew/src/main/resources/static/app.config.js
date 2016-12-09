'use strict';

angular.
  module('adminApp').
  config(['$locationProvider' ,'$routeProvider',
    function config($locationProvider, $routeProvider) {
      $locationProvider.hashPrefix('!');

      $routeProvider.
        when('/status', {
          template: '<status></status>'
        }).
        when('/newuser', {
          template: '<new-user></new-user>'
        }).
        otherwise('/status');
    }
  ]);
