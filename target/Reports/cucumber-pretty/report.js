$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featureFiles/back-end.feature");
formatter.feature({
  "name": "Back-end tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@back-end"
    }
  ]
});
formatter.scenario({
  "name": "Api POST login saccessfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back-end"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User perform POST operation for \"/login\", with body",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.API_Step.user_perform_POST_operation_for_with_body(java.lang.String,io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status code should be 200 and token: \"QpwL5tke4Pnpja7X4\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.API_Step.status_code_should_be_and_token(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Api GET list of users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back-end"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User perform GET method for \"/users\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.API_Step.user_perform_GET_method_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should be 6 items per page and first_name \"George\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.API_Step.should_be_items_per_page_and_first_name(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/featureFiles/login.feature");
formatter.feature({
  "name": "Login Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@front-end"
    }
  ]
});
formatter.background({
  "name": "Open browser and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "User enters invalid username or invalid password",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_enters_invalid_username_or_invalid_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should be visible message for incorrect credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.should_be_visible_message_for_incorrect_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open browser and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "valid login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "User enter a valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_enter_a_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login successfully and get access to inventory page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_should_login_successfully_and_get_access_to_inventory_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featureFiles/orders.feature");
formatter.feature({
  "name": "Validate ordering",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.background({
  "name": "Open browser and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter a valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_enter_a_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Place item in the shopping cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "clicks button to add item in cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.clicks_button_to_add_item_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should be visible counter red badge on cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.should_be_visible_counter_red_badge_on_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open browser and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter a valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_enter_a_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Place multiple items in the shopping cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "In inventpory page select 3 items",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.in_inventpory_page_select_items(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on shoping cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.user_clicks_on_shoping_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There should be 3 items in the shopping cart list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.there_should_be_items_in_the_shopping_cart_list(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate tax and total",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Sauce Labs Backpack"
      ]
    },
    {
      "cells": [
        "Sauce Labs Bike Light"
      ]
    },
    {
      "cells": [
        "Sauce Labs Bolt T-Shirt"
      ]
    },
    {
      "cells": [
        "Sauce Labs Fleece Jacket"
      ]
    },
    {
      "cells": [
        "Sauce Labs Onesie"
      ]
    },
    {
      "cells": [
        "Test.allTheThings() T-Shirt (Red)"
      ]
    }
  ]
});
formatter.step({
  "name": "User clicks on shoping cart icon",
  "keyword": "And "
});
formatter.step({
  "name": "Clicks Checkout button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter \"\u003cfirstName\u003e\", \"\u003clastName\u003e\" and \"\u003czipCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Clicks Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "Tax should be \"Tax: $10.40\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Total should be \"Total: $140.34\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "zipCode"
      ]
    },
    {
      "cells": [
        "Petar",
        "Petrovic",
        "21000"
      ]
    }
  ]
});
formatter.background({
  "name": "Open browser and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.UI_LoginStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter a valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_enter_a_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.the_user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate tax and total",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@front-end"
    }
  ]
});
formatter.step({
  "name": "User selects",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.user_selects(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on shoping cart icon",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.user_clicks_on_shoping_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.clicks_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"Petar\", \"Petrovic\" and \"21000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.user_enter_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.clicks_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tax should be \"Tax: $10.40\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.tax_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Total should be \"Total: $140.34\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.UI_OrdersStep.total_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});