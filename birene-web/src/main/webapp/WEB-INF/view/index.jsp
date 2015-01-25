<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

<head>
<title>Apptodate</title>
<link rel="icon" type="image/x-icon" href="<@spring.url '/images/teachers_day_24_hot.ico' />" />
<link rel="stylesheet" href="<@spring.url '/lib/bootstrap/dist/css/bootstrap.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/font-awesome/css/font-awesome.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/angularjs-toaster/toaster.css' />" />

<script src="<@spring.url '/lib/jquery/jquery.min.js' />"></script>
<script data-main="<@spring.url '/main.js' />" src="<@spring.url '/lib/requirejs/require.js' />"></script>

</head>

<body>
  <!-- NAVIGATION -->
  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="<@spring.url '/#/' />">Apptodate</a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right" ng-controller="AuthController">
        <li class="dropdown ng-hide" ng-show="principal.principal">
          <a href="javascript:;" class="dropdown-toggle">
            {{principal.principal.username}}<span class="caret" style="margin-left: 5px;"></span>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li ng-if="!hasRole('ROLE_ADMIN')"><a href="<@spring.url '/#/' />">Home</a></li>
            <li ng-if="hasRole('ROLE_ADMIN')"><a href="<@spring.url '/#/admin' />">Home</a></li>
            <li ng-if="hasRole('ROLE_ADMIN')"><a ui-sref="admin_txn">Transaction & Reports</a></li>
            <li><a href="<@spring.url '/logout' />">Logout</a></li>
          </ul>
        </li>
      </ul>
      <form ng-controller="NavSearchController" class="navbar-form navbar-right" style="width: 300px;">
        <input type="text" ng-model="typeahead"
         typeahead-watch-changes
         onclick="this.select();"
         typeahead="record as record.customerName for record in searchCustomers($viewValue)"
         typeahead-template-url="customTemplate.html"
         typeahead-loading="loadingLocations"
         typeahead-input-formatter="gotoPreview($model)"
         class="form-control" placeholder="Search {{tenant.name}} Customers..." style="width: 100%;">
      </form>
      </div>
    </div>
  </nav>

  <!-- Main Content -->
  <div class="container-fluid">
    <toaster-container toaster-options="{'time-out': 4000, 'limit' : 3}"></toaster-container>
    <div class="row">
      <div ui-view="sidebar"></div>
      <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div ui-view="main">Loading resources...</div>
      </div>
    </div>
  </div>

  <div style="margin-bottom: 30px;"></div>
</body>

</html>