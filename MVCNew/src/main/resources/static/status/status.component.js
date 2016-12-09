'use strict';

// Register `phoneList` component, along with its associated controller and template
angular.
  module('status').
  component('status', {
    templateUrl: 'status/status.template.html',
    controller: ['Admin',
      function StatusController(Admin) {
        var self = this;
        self.users = [];
        var result = Admin.query({},function(v) {
          self.users = v.map(function(user) {
            var s = "Name: " + user.name +
                    ", Education: " + user.education +
                    ", Gender: " + user.gender +
                    ", Colors: ";
            for (var c of user.colors) {
              s += c + ",";
            }
            return s;
          });
        });
      }
    ]
  });
