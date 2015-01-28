define(function () {
    return ['$scope', '$rootScope', '$state', 'ClassService',
      function ($scope, $rootScope, $state, ClassService) {
        console.debug('Root controller 2 initialized.');
        $rootScope.includes = $state.includes;
      }
    ];
  }
);
