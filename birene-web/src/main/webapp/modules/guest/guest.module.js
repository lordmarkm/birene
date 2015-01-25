define(
    [
     'angular',
     'modules/guest/controller/GuestController'
    ],
    function (angular, GuestController) {
      console.debug('Configuring guest.module');
      angular.module('guest.module', [])

        .config(['$stateProvider', function ($stateProvider) {

          $stateProvider.state('default.guest', {
            url: 'guest',
            template: '<ui-view>Guest root</ui-view>',
            abstract: true,
            controller: GuestController
          })
          .state('default.guest.splash', {
            url: '',
            templateUrl: 'modules/guest/view/splash.html'
          });

        }]);

    });