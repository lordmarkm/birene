define([], function() {
  'use strict';
  return {
    tutorialCenterAdmins: ['PersonService', function (PersonService) {
      return PersonService.query({type:'TUTORIAL_CENTER_ADMIN'}).$promise;
    }],
    siteAdmins: ['PersonService', function (PersonService) {
      return PersonService.query({type:'SITE_ADMIN'}).$promise;
    }]
  };
});