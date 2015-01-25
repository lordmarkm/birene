define(function () {
    return ['$scope', 'ClassService',
      function ($scope, ClassService) {
        console.debug('Guest controller initialized.');
        $scope.classes = ClassService.query();
      }
    ];
  }
);
