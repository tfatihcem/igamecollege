$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/preRegisteration.feature");
formatter.feature({
  "name": "Pre-Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Verify Pre-registration and reaching out the form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PreRegistrationStepDefs.the_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters Pre Registration Button",
  "keyword": "When "
});
formatter.match({
  "location": "PreRegistrationStepDefs.the_user_enters_Pre_Registration_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Apply Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "PreRegistrationStepDefs.the_user_clicks_on_Apply_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page is Application form for candidates",
  "keyword": "Then "
});
formatter.match({
  "location": "PreRegistrationStepDefs.the_page_is_Application_form_for_candidates()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user fills out the Parents / Guardians form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Apply Now Button",
  "keyword": "Given "
});
formatter.match({
  "location": "PreRegistrationStepDefs.the_user_clicks_on_Apply_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the following Parents Guardian credentials",
  "rows": [
    {
      "cells": [
        "firstname",
        "John"
      ]
    },
    {
      "cells": [
        "lastname",
        "Smith"
      ]
    },
    {
      "cells": [
        "email",
        "wwww.google.com"
      ]
    },
    {
      "cells": [
        "phone",
        "12343454567"
      ]
    },
    {
      "cells": [
        "birthdate",
        "1970/09/28"
      ]
    },
    {
      "cells": [
        "address",
        "Frankfurter Strasse"
      ]
    },
    {
      "cells": [
        "city",
        "Frankfurt"
      ]
    },
    {
      "cells": [
        "state",
        "Hessen"
      ]
    },
    {
      "cells": [
        "zipcode",
        "60528"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdmissionStepDefs.the_user_enters_the_following_Parents_Guardian_credentials(String,String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: It is not a valid email address\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat com.college.step_definitions.AdmissionStepDefs.the_user_enters_the_following_Parents_Guardian_credentials(AdmissionStepDefs.java:40)\n\tat ✽.the user enters the following Parents Guardian credentials(file:src/test/resources/features/preRegisteration.feature:13)\n",
  "status": "failed"
});
formatter.step({
  "name": "the user continue",
  "keyword": "Then "
});
formatter.match({
  "location": "AdmissionStepDefs.the_user_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters the following Applicant Information credentials",
  "rows": [
    {
      "cells": [
        "firstname",
        "Jessica"
      ]
    },
    {
      "cells": [
        "lastname",
        "Anna"
      ]
    },
    {
      "cells": [
        "email",
        "test@test.com"
      ]
    },
    {
      "cells": [
        "birthdate",
        "2005/09/28"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdmissionStepDefs.the_user_enters_the_following_Applicant_Information_credentials(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user goes to Application Fee",
  "keyword": "Then "
});
formatter.match({
  "location": "AdmissionStepDefs.the_user_goes_to_Application_Fee()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});