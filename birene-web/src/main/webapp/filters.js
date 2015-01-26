define(['angular'], function(angular) {
  'use strict';
  angular.module('app.filters', [])

  .filter('name', function() {
    return function(nameInfo) {
      if (!nameInfo) return '';
      var name = '';
      if (nameInfo.givenName) name += nameInfo.givenName;
      if (nameInfo.middleName) name += ' ' + nameInfo.middleName;
      if (nameInfo.surname) name += ' ' + nameInfo.surname;
      return name;
    };
  })
  .filter('commaJoin', function() {
    return function(array, prop) {
      if (!array) return '';
      var i = array.length, props = [];
      while (i--) {
        props.push(array[i][prop]);
      }
      return props.join(',');
    };
  });
});
