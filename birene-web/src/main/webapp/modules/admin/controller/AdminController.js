define(function () {
    return ['$scope', 'LevelService', 'ClassService',
      function ($scope, LevelService, ClassService) {
        console.debug('Admin controller initialized.');
        $scope.levels = LevelService.query();
        $scope.controllerName = 'Admin controller';
      }
    ];
  }
);
