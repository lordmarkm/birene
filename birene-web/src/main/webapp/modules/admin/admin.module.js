define([
  '/app.js'
  ], 
  function(app) {
    'use strict';
    return app.config(function($stateProvider) {
      $stateProvider.state('admin', {
        url: '/admin',
      });
    }
  );
});