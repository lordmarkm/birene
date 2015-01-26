define(function () {
    return ['$scope', 'tutorialCenterAdmins', 'siteAdmins',
      function ($scope, tutorialCenterAdmins, siteAdmins) {
        console.debug('About us controller initialized.');
        $scope.tutorialCenterAdmins = tutorialCenterAdmins;
        $scope.siteAdmins = siteAdmins;
      }
    ];
  }
);
