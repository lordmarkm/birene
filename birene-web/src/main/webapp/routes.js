define([
    'app.js'
  ], function(app) {
  'use strict';
  return app.config(function($stateProvider) {
    $stateProvider.state('home', {
      url: '/',
      views: {
        main: {
          templateUrl: 'tenant/view/home.html',
          controller: 'TenantHomeController',
          resolve: TenantResolve
        },
        sidebar: {
          templateUrl: 'tenant/view/sidebar.html',
          controller: 'SidebarController',
          resolve: SidebarResolve
        }
      }
    });
  });
});