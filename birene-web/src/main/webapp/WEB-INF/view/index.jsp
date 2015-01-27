<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

<head>
<title>Birene Tutorial</title>
<link rel="icon" type="image/x-icon" href="<@spring.url '/images/teachers_day_24_hot.ico' />" />
<link rel="stylesheet" href="<@spring.url '/lib/bootstrap/dist/css/bootstrap.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/font-awesome/css/font-awesome.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/angularjs-toaster/toaster.css' />" />

<link rel="stylesheet" href="<@spring.url '/lib/metisMenu/dist/metisMenu.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/startbootstrap-sb-admin-2/dist/css/sb-admin-2.css' />" />

<script src="<@spring.url '/lib/jquery/jquery.min.js' />"></script>
<script data-main="<@spring.url '/main.js' />" src="<@spring.url '/lib/requirejs/require.js' />"></script>

</head>

<body>
  <div id="wrapper">
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
      <div class="navbar-header">
        <a ui-sref="default.guest.splash" class="navbar-brand"><@spring.message "main.banner" /></a>
      </div>
      <ul class="nav navbar-nav">
        <li ui-sref-active="active"><a ui-sref="default.splash">Home</a></li>
        <li ui-sref-active="active"><a ui-sref="default.about_us">About us</a></li>
      </ul>
    </nav>
  </div>

  <!-- Main Banner -->
  <div class="container">
    <div class="row">
      <h1>Banner</h1>
    </div>
  </div>

  <!-- Main Content -->
  <div class="container">
    <toaster-container toaster-options="{'time-out': 4000, 'limit' : 3}"></toaster-container>
    <div class="row">
      <div class="main">
        <div ui-view>Loading resources...</div>
      </div>
    </div>
  </div>

  <div style="margin-bottom: 30px;"></div>
</body>

</html>