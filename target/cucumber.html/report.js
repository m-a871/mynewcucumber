$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/tagdemo.feature");
formatter.feature({
  "line": 3,
  "name": "ECommerce Application",
  "description": "",
  "id": "ecommerce-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Successful Login",
  "description": "",
  "id": "ecommerce-application;successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    },
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "UnSuccessful Login",
  "description": "",
  "id": "ecommerce-application;unsuccessful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 39,
  "name": "Remove a product from bag",
  "description": "",
  "id": "ecommerce-application;remove-a-product-from-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@SmokeTest"
    },
    {
      "line": 37,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 47,
  "name": "Remove all products from bag",
  "description": "",
  "id": "ecommerce-application;remove-all-products-from-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});