# Implement ecommerce events on a mobile app

This project demonstrates how to implement ecommerce events in an Android mobile app so you can
measure user behavior in a Google Analytics 4 property.

## Before you begin

* Install or update [Android Studio](https://developer.android.com/studio) to its latest version.
* Set up an emulator or physical device to run the project.

## Get started

To launch the app:

1. Import the project into Android Studio.
1. Build and run the project.

To import the project:

1. In Android Studio, click **File** > **New** > **Project from Version Control...**
1. Select **Git** as the version control system.
1. Enter the URL to the repository.
1. Choose the directory where you want to save the project and click **Clone**.

## Connect to Google Analytics

To collect data from the app in your Analytics property, add an Android app data stream to your
property and then add your google-services.json to the src/ folder. Once you connect the app to your
property, [enable debug mode](https://support.google.com/analytics/answer/7201382)
so you can see the ecommerce events in realtime.

To connect the app to your property:

1. In Google Analytics, go to **Admin** > **Data Streams**.
1. Click **Add stream** > **Android app**.
1. Follow the steps on the screen to connect the app.
