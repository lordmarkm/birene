define(function () {
    return ['$scope', 'LevelService', 'ClassService',
      function ($scope, LevelService, ClassService) {
        console.debug('Guest controller initialized.');
        $scope.levels = LevelService.query();
      }
    ];
  }
);
