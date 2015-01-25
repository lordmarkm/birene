define(
    [
     'angular',
     'modules/common/controller/RootController',
     'modules/common/service/ClassService'
    ],
    function (angular, RootController, ClassService) {
      console.debug('Configuring common.module');
      angular.module('common.module', [])

        .service('ClassService', ClassService)
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