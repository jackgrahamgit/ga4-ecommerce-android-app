## Accounts

* Google AdMob: https://apps.admob.com/v2/home?_ga=2.142530674.1772752223.1630625596-1486055455.1630625596
* Google Analytics: https://analytics.google.com/analytics/web/ > `property-app` property.
* Google Firebase: https://console.firebase.google.com/u/2/project/property-app-38f5f/overview
* Google Play: [TBD - when we have in-app purchases]

## Credentials

* Username: jackandaritestanalytics@gmail.com
* Password: Go to [Valentine](https://valentine.corp.google.com/#/show/1628709612021205)

## Important files

These are the primary files we'll work on:

* **app > src > main > java > com.exemplary.itsAnApp > MainActivity**

    The entry point of the app. When you build and run the app, the system launches an instance of this Activity and loads its layout.

* **app > src > main > res > layout > activity_main.xml**

    This XML file (click "Code" on the top right) defines the layout for the activity's FE.

    Whatever you do in the WYSIWYG editor (click "Design" on the top right), the XML file gets updated.

* **app > src > main > AndroidManifest.xml**

    The manifest file describes the fundamental characteristics of the app and defines each of its components.

* **app > build.gradle**

    (app-level) Control how the Gradle plugin builds your app (mostly for packages to import). When you make changes to this file, click "Sync Now" on the top right.

* **build.gradle**

    (project-level) Control how the Gradle plugin builds your app (mostly for packages to import).

* **app > src > main > res > values > strings.xml**

    We can specify all the UI strings here so they're easily searchable and localizable.

* **app > google-services.json**

    This connects our app with Firebase Analytics. Customers will need to replace this file/we'll probably exclude it when we release to customers.
