# Project notes

Notes about [the project](https://docs.google.com/presentation/d/1HCLVgkLAgYqzFOGFftDMcDaJHkLinUl5lb5M6MkILSc/edit#slide=id.p):

## Work with a Git repository

CURRENT ACCESS TOKEN: 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

To checkout the code locally:

1. Open GitHub.
1. If you're not the owner, you may need to Fork the repository before cloning (on the top right).
1. Click **Code**.
1. Copy the git address in the HTTPS tab.
1. In your terminal, enter `git clone [paste-the-address]`.
1. Enter your username and access token. If you get an error, see below.
1. Change directory (cd) into the directory.

Create a branch for your changes:

1. In your terminal, enter `git checkout -b [name-of-your-branch]`. Remember the name of this branch for later.
1. Make your changes.

After you make changes:

1. In your terminal, enter `git add .` to add everything.
1. Enter commit -m `"[enter a message]"`.
1. Enter `git push origin [name-of-your-branch]`.
1. Enter your username and access token. If you get an error, see below.

Create a pull request:

1. In GitHub, click `Compare & pull request`.
1. (Optional) Enter some message.
1. Click **Create pull request**.
1. If you ARE NOT an owner of the repository, message the owner.
1. If you ARE an owner, click **Merge pull request** > **Confirm merge**.

If you get this error when cloning:

_remote: Support for password authentication was removed on August 13, 2021. Please use a personal access token instead._
_remote: Please see https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ for more information._
_fatal: Authentication failed for 'https://github.com/jackgrahamgit/ecommerce-app.git/'_

Here's what you do:

1. Click your profile (top right).
1. Go to **Developer settings** > **Personal access tokens**.
1. Click **Generate new token**.
1. Enter a name for the token.
1. Select all the scopes you want.
1. Click **Generate token**.

You can then use that token for the life of the token.

## Accounts

* Google AdMob: https://apps.admob.com/v2/home?_ga=2.142530674.1772752223.1630625596-1486055455.1630625596
* Google Analytics: https://analytics.google.com/analytics/web/ > `property-app` property.
* Google Firebase: https://console.firebase.google.com/u/2/project/property-app-38f5f/overview
* Google Play: [TBD - when we have in-app purchases]

## Credentials

* Username: jackandaritestanalytics@gmail.com
* Password: Go to [Valentine](https://valentine.corp.google.com/#/show/1628709612021205)

## Project details

* Name: Android App for Google Analytics 4
* Package name: com.exemplary.androidappforgoogleanalytics4
* Language: Java
* Minimum SDK: API 16: Android 4.1 (Jelly Bean)

## Important files

To import the files:

1. Open Android Studio.
1. Choose the "ecommerce-app" folder from the existing app option in the Android Studio dialog.
1. Click Import.

Once you import the project, you can see each file by opening the Project window on the top left. To see the project files easily:

1. Click the "Android" drop down.
1. Click "Project".
1. Expand the "Android App for Google Analytics 4" project.

These are the primary files we'll work on:

* **app > src > main > java > com.exemplary.androidappforgoogleanalytics4 > MainActivity**

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

## Run the app

To run the project in an emulator:

1. In the toolbar, click "Make Project" (the green hammer-looking button).
1. After the project builds, click "Run" (the green play button).

## Add a string

As a best practice (and to simplify implementation), we can add strings to a resource file.

To add a string to the resource file:

1. Open `strings.xml`.
1. Click "Open editor" on the top right.
1. Click "Add key" (the plus).
1. Enter the key you want to use in the "Key" field.
1. Enter the message in the "Default Value" field.
1. Click "OK".

To add the string in a UI element:

1. Open an Activity (for exemplary, activity_main.xml).
1. Open "Attributes" on the right.
1. Click "Pick a Resource" (the gray rectangle all the way to the right)

## Ads

Ad name: home_screen_banner_ad

Test:
* App ID: ca-app-pub-3940256099942544~3347511713

Prod:
* App ID: ca-app-pub-5430752373775862~1101865194
* Banner ID: ca-app-pub-5430752373775862/1021155907

**To do**: Provide steps on how to do this.
