'use strict';

// Register `phoneDetail` component, along with its associated controller and template
angular.
  module('newUser').
  component('newUser', {
    templateUrl: 'new-user/new-user.template.html',
    controller: ['$routeParams', 'Admin',
      function NewUserController($routeParams, Admin) {
        var self = this;
        self.userName="Hello";
        self.education="";
        self.gender="male";
        self.color = {black: false, red: false, green: false, blue: false};
        self.success = false;
        self.existingName = false;
        self.send = function() {
          var colors = Object.keys(self.color).filter(function(c){
              return self.color[c];
          });
          var params = {userName:self.userName,
                        education:self.education,
                        gender:self.gender,
                        color: colors};
          var results = Admin.update(params, function(v) {
            if (v.code == "existing-name") {
              self.existingName = true;
            } else {
              self.existingName = false;
            }
          });
        };
      }
    ]
  });
