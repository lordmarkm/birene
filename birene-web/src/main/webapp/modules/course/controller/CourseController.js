define(function () {
  return ['$scope', 'CourseService',
    function ($scope, CourseService) {
      $scope.courses = CourseService.get();
    }
  ];
});
