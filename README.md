# Measure ecommerce events on mobile
This Android project demonstrates how to implement ecommerce events so you can measure user behavior through Google Analytics.

## Before you begin
* Install or update [Android Studio](https://developer.android.com/sdk) to its latest version.
* Set up a physical device or use an [emulator](https://developer.android.com/studio/run/managing-avds) to run the project.

## Getting started

To launch the app:

1. Import the project into Android Studio.
1. Build and run the project.

To import the project:

1. Open Android Studio.
1. Click File > New > Project from Version Control > GitHub. 
1. Enter your username and password.
1. Select the repository and click Clone.

## Notes to the team

You only need to worry about these files:

* activity_main.xml
* [AndroidManifest.xml](https://developer.android.com/guide/topics/manifest/manifest-intro)
* [build.gradle (:app)](https://developer.android.com/studio/build#top-level)
* [build.gradle (My Application)](https://developer.android.com/studio/build#module-level)
* [MainActivity.java](https://developer.android.com/guide/components/activities/intro-activities)

### Modify the project 

As long as you don't generate a pull request to this repo with your changes, you can make any changes to the project on your local machine.

### Trigger an event

To trigger an [ecommerce event](https://firebase.google.com/docs/analytics/measure-ecommerce#java_1) (or any other event):

1. Open MainActivity.java.
2. Copy and paste or write the code you want to execute after the other code within the onCreate method.
3. Save the file.
4. Build and run the project.
