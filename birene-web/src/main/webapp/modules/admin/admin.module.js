define(
    [
     'angular',
     'modules/admin/controller/AdminController',
     'modules/common/service/ClassService'
    ],
    function (angular, AdminController, ClassService) {
      console.debug('Configuring admin.module');
      angular.module('admin.module', [])

        .service('ClassService', ClassService)
        .config(['$stateProvider', function ($stateProvider) {

          $stateProvider.state('default.admin', {
            url: 'admin',
            template: '<ui-view></ui-view>',
            abstract: true,
            controller: AdminController
          })
          .state('default.admin.splash', {
            url: '',
            templateUrl: 'modules/admin/view/splash.html'
          });

        }]);

    });