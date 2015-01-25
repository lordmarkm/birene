define(
    [
     'angular',
     'modules/common/controller/RootController2'
    ],
    function (angular, RootController) {
      console.debug('Configuring common.module');
      console.debug('Root controller: ' + RootController);
      console.debug('Angular: ' + angular);
      angular.module('common.module', [])

        .config(['$stateProvider', function ($stateProvider) {

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