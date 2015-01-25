define(
    [
     'angular',
     'modules/common/controller/RootController'
    ],
    function (angular, RootController) {
      console.debug('Configuring common.module');
      angular.module('common.module', [])

        .config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

          $urlRouterProvider
            .when('', '/');

          $stateProvider.state('default', {
            url: '/',
            template: '<ui-view>Hello world</ui-view>',
            abstract: true,
            controller: RootController
          })
          .state('default.splash', {
            url: '',
            templateUrl: 'modules/common/view/splash.html'
          });

        }]);

    });