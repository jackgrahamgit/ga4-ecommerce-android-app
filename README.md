# Implement ecommerce events on a mobile app

This project demonstrates how to implement ecommerce events in an Android mobile app so you can measure user behavior in a Google Analytics 4 property.

## Before you begin

* Install or update [Android Studio](https://developer.android.com/studio) to its latest version.
* Set up an emulator or physical device to run the project.

## Get started

To launch the app:

1. Import the project into Android Studio.
2. Build and run the project.

To import the project:

1. In Android Studio, click **File** > **New** > **Project from Version Control...**
2. Select **Git** as the version control system.
4. Enter the URL to the repository.
5. Choose the directory where you want to save the project and click **Clone**.

## Connect to Google Analytics

To collect data from the app in your Analytics property, add an Android app data stream to your property. Once you connect the app to your property, [enable debug mode](https://developers.devsite.corp.google.com/analytics/devguides/collection/ga4/debug?technology=apps#android) so you can see the ecommerce events in realtime.

To connect the app to your property:

1. In Google Analytics, go to **Admin** > **Data Streams**.
1. Click **Add stream** > **Android app**.
2. Follow the steps on the screen to connect the app.
