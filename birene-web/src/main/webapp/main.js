require.config({
  paths: {
    'angular': 'lib/angular/angular',
    'angular-animate': 'lib/angular-animate/angular-animate.min',
    'angular-ui-router': 'lib/angular-ui-router/release/angular-ui-router',
    'angular-resource': 'lib/angular-resource/angular-resource.min',
    'angular-ngtable': 'lib/ng-table/dist/ng-table.min',
    'toaster': 'lib/angularjs-toaster/toaster',
    'bootstrap': 'lib/bootstrap/dist/js/bootstrap',
    'jquery': 'lib/jquery/jquery'
  },
  shim: {
    'angular': {
      exports: 'angular',
      deps: ['jquery']
    },
    'angular-resource': {
      deps: ['angular']
    },
    'angular-ui-router': {
      deps: ['angular']
    },
    'angular-animate': {
      deps: ['angular']
    },
    'angular-ngtable': {
      deps: ['angular']
    },
    'toaster': {
      deps: ['angular']
    },
  }
});

require([
    'angular',
    'angular-resource',
    'angular-animate',
    'angular-ngtable',
    'toaster',
    'angular-ui-router',
    'bootstrap',
    'filters.js',
    'modules/common/common.module.js',
    'modules/admin/admin.module.js',
    'modules/guest/guest.module.js',
    'modules/course/course.module.js'
  ], function (angular) {
  angular.element().ready(function () {
    angular.bootstrap(document, [
      'ui.router',
      'ngResource',
      'ngAnimate',
      'ngTable',
      'toaster',
      'app.filters',
      'common.module',
      'admin.module',
      'guest.module',
      'course.module'
    ]);
  });
});