'use strict';

angular.
  module('core.admin').
  factory('Admin', ['$resource','$httpParamSerializer',
    function($resource, $httpParamSerializer) {
      return $resource('http://localhost:8080/MVCNew/admin/:operation', {}, {
        query: {
          method: 'GET',
          params: {operation: 'status'},
          isArray: true
        },
        update: {
          method: 'POST',
          params: {operation: 'new-user'},
          transformRequest: function(data) {
            return $httpParamSerializer(data);
          },
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
          }  
        }
      });
    }
  ]);
