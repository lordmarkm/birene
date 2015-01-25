require.config({
  paths: {
    'angular': 'lib/angular/angular',
    'angular-animate': 'lib/angular-animate/angular-animate.min',
    'angular-ui-router': 'lib/angular-ui-router/release/angular-ui-router',
    'toaster': 'lib/angularjs-toaster/toaster',
    'bootstrap': 'lib/bootstrap/dist/js/bootstrap',
    'jquery': 'lib/jquery/jquery',
    'domReady': 'lib/requirejs-domready/domReady',
  },
  shim: {
    'angular': {
      exports: 'angular',
      deps: ['jquery']
    },
    'angular-ui-router': {
      deps: ['angular']
    },
    'angular-animate': {
      deps: ['angular']
    },
    'toaster': {
      deps: ['angular']
    },
  }
});

require([
    'angular',
    'angular-animate',
    'toaster',
    'angular-ui-router',
    'bootstrap',
    'modules/common/common.module.js',
    'modules/guest/guest.module.js'
  ], function (angular) {
  angular.element().ready(function () {
    angular.bootstrap(document, [
      'ui.router',
      'ngAnimate',
      'toaster',
      'common.module',
      'guest.module'
    ]);
  });
});