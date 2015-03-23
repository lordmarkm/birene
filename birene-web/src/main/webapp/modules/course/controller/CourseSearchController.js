define(function () {
  return ['$scope', 'ngTableParams', 'CourseService',
    function ($scope, ngTableParams, CourseService) {

    //Taxis table
    $scope.tableParams = new ngTableParams({
      page: 0,
      count: 5,
      sorting: {
        trackingNo: 'asc'
      }
    }, {
      total: 0,
      counts: [5,10,15],
      getData: function($defer, params) {
        CourseService.get(params.$params, function(response) {
          params.total(response.total);
          $defer.resolve(response.data);
        });
      }
    });

  }
  ];
});
