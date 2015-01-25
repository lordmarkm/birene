<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

<head>
<title>Birene Tutorial</title>
<link rel="icon" type="image/x-icon" href="<@spring.url '/images/teachers_day_24_hot.ico' />" />
<link rel="stylesheet" href="<@spring.url '/lib/bootstrap/dist/css/bootstrap.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/font-awesome/css/font-awesome.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/angularjs-toaster/toaster.css' />" />

<script src="<@spring.url '/lib/jquery/jquery.min.js' />"></script>
<script data-main="<@spring.url '/main.js' />" src="<@spring.url '/lib/requirejs/require.js' />"></script>

</head>

<body>
  <!-- Main Content -->
  <div class="container-fluid">
    <toaster-container toaster-options="{'time-out': 4000, 'limit' : 3}"></toaster-container>
    <div class="row">
      <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div ui-view>Loading resources...</div>
      </div>
    </div>
  </div>

  <div style="margin-bottom: 30px;"></div>
</body>

</html>