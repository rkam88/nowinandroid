This is a fork of the official [Now in Android repository](https://github.com/android/nowinandroid) to showcase a way to fully automate screenshot testing for Jetpack Compose @Previews.

Most of the code is in the [PreviewTests class](https://github.com/rkam88/nowinandroid/blob/main/screenshot-test/src/test/java/com/google/samples/apps/nowinandroid/screenshottest/PreviewTests.kt), with some helpers in the [core:ui module](https://github.com/rkam88/nowinandroid/tree/main/core/ui/src/main/java/com/google/samples/apps/nowinandroid/core/ui/screenshottest).

Snapshots can be generated with: `./gradlew clean screenshot-test:recordPaparazziProdRelease`
After generating and saving snapshots, you can verify them with: `./gradlew clean screenshot-test:verifyPaparazziProdRelease`
