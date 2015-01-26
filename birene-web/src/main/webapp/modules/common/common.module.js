define(
    [
     'angular',
     'modules/common/controller/RootController',
     'modules/common/service/ClassService',
     'modules/common/service/PersonService',
     'modules/common/controller/AboutUsController',
     'modules/common/resolve/AdminsResolve'
    ],
    function (angular, RootController, ClassService, PersonService, AboutUsController, AdminsResolve) {
      console.debug('Configuring common.module');
      angular.module('common.module', [])

        .service('ClassService', ClassService)
        .service('PersonService', PersonService)
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
          })          
          .state('default.about_us', {
            url: 'about_us',
            templateUrl: 'modules/common/view/about_us.html',
            controller: AboutUsController,
            resolve: AdminsResolve
          });

        }]);

    });