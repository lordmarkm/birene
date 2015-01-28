define(
    [
     'angular',
     'modules/guest/controller/GuestController',
     'modules/common/service/ClassService'
    ],
    function (angular, GuestController, ClassService) {
      console.debug('Configuring guest.module');
      angular.module('guest.module', [])

        .service('ClassService', ClassService)
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
          })

          //Tour AKA Course catalogue
          .state('default.guest.tour', {
            url: '/tour',
            templateUrl: 'modules/guest/view/tour.html',
            abstract: true
          })
          .state('default.guest.tour.overview', {
            url: '',
            templateUrl: 'modules/guest/view/tour_overview.html'
          })
          .state('default.guest.tour.ECH', {
            url: '/ECH',
            templateUrl: 'modules/guest/view/tour_ECH.html'
          })
          .state('default.guest.tour.ELM', {
            url: '/ELM',
            templateUrl: 'modules/guest/view/tour_ECH.html'
          })
          .state('default.guest.tour.HSC', {
            url: '/HSC',
            templateUrl: 'modules/guest/view/tour_ECH.html'
          })
          .state('default.guest.tour.COL', {
            url: '/COL',
            templateUrl: 'modules/guest/view/tour_ECH.html'
          })
          .state('default.guest.tour.GRD', {
            url: '/GRD',
            templateUrl: 'modules/guest/view/tour_ECH.html'
          });

        }]);

    });