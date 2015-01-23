require.config({
  paths: {
    'angular': 'lib/angular/angular/',
    'jquery': 'lib/jquery/jquery'
  },
  shim: {
    'angular': {
      exports: 'angular'
    }
  },
  deps: [
    'bootstrap.js'
  ]
});