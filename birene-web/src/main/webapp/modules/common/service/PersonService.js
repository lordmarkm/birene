define(function () {
  return ['$resource', function ($resource) {
    return $resource('person/:type');
  }];
});