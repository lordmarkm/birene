define(
    [
     'angular',
     'modules/course/controller/CourseController',
     'modules/course/controller/CourseSearchController',
     'modules/course/service/CourseService',
    ],
    function (angular, CourseController, CourseSearchController, CourseService) {
      angular.module('course.module', [])

        .service('CourseService', CourseService)
        .config(['$stateProvider', function ($stateProvider) {

          $stateProvider.state('default.course', {
            url: 'course',
            template: '<ui-view></ui-view>',
            abstract: true,
            controller: CourseController
          })
          .state('default.course.search', {
            url: '',
            templateUrl: 'modules/course/view/search.html',
            controller: CourseSearchController
          });

        }]);

    });