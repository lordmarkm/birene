define(
    [
     'angular',
     'modules/registration/controller/RegistrationController',
    ],
    function (angular, RegistrationController) {
      angular.module('registration.module', [])

        .config(['$stateProvider', function ($stateProvider) {

          $stateProvider.state('default.registration', {
            url: 'registration',
            template: '<ui-view></ui-view>',
            abstract: true,
            controller: RegistrationController
          })
          .state('default.registration.form', {
            url: '/form',
            templateUrl: 'modules/registration/view/form.html'
          });

        }]);

    });