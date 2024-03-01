# Report for assignment 4

## Project

Name: apps-android-commons (group 8)

URL: https://github.com/commons-app/apps-android-commons

This project is android app where you users can upload pictures to the wikimedia commons

## Onboarding experience

### Did you choose a new project or continue on the previous one?

We choose a new project compared to the previous one which was [karate](https://github.com/karatelabs/karate)
which was a single framework/tool that included API test automation, mocks, performance-testing and
UI automation all in one package. The reason for switching project was because **karate** has very
few issues which limited the final issue that we could select. Furthermore no issues are labelled good
first issue or something like that and as we talked about in the previous assignment this project has
great documentation for how to use the project as user but very limited documentation for contributors.

### If you changed the project, how did your experience differ from before?

The project that we chose was **apps-android-commons** which is an Android app (written in Kotlin&Java)
where users can share and upload images, the goal is to create a database with free-to-use images and
other media. Ultimately these images are to be used in Wikipedia. Compared to **karate** this project
is far much better as a choice for this exercise because it has more issues and many of them are good
as a first issue. Furthermore, the project has more documentation for contributors which makes it
easier to start working. Overall the experience of setting up the project, building it and running
the app was great and straight forward. There was one problem in which one was required to remove a
specific folder (we still don't know why) but the good thing was that this [issue](https://github.com/commons-app/apps-android-commons/issues/5571)
was brought up in GitHub which made it possible for us to find the solution.

## Effort spent

For each team member, how much time was spent in

1. plenary discussions/meetings;

2. discussions within parts of the group;

3. reading documentation;

4. configuration and setup;

5. analyzing code/output;

6. writing documentation;

7. writing code;

8. running code?

For setting up tools and libraries (step 4), enumerate all dependencies
you took care of and where you spent your time, if that time exceeds
30 minutes.

### Jonatan Tuvstedt

0. preliminary issue and project search

   **2.5 hours** - Scouting projects and finding JabRef to be really great. Then looking into their issues while trying to get it to run, which I had a lot of problems with. Including scouting project and issues, and getting them to run.

   **1 hour** - Redoing the job searching when I did not get it to work and 5 other groups had chosen JabRef

1. plenary discussions/meetings;

   **0.5 hours** - Start up meeting

   **1 hour** - Issue selection meeting

   **1 hour** - Reevaluating our issue choice after consultation with Cyrille and finding a new one

   **0.5 hours** - Project plan meeting for issue #5284

   **0.5 hours** - Stand up meeting

2. discussions within parts of the group;

   **0.5 hours** - syncing

   **0.5 hours** - Reviewing and discussing Melissas code

3. reading documentation;

   **1 hour** - Initial analysis work for issue #3463, getting an understanding of the issue and solution (and the problem with having it as our main issue)

   **1 hour** - Reading documentation related to issue #5284, more specifically how uploading works

4. configuration and setup;

   **1 hour** - Getting the project and Android Studio to run

   **1 hour** - Getting android emulator to run

5. analyzing code/output;

   **1 hour** - Analysing how picture uploading works and how we can determine why an upload failed.

   **2 hours** - Digging deep into how UploadWorker and the whole image uploading workflow works to find how and where we can determine why a upload attempt failed which can then be used to determine if a retry is worth while.

6. writing documentation;

   **0.5 hours** - Documenting the failure points and what kind of failures could be the cause of failing for this position

7. writing code;

   **0.5 hours** - Initial manual work on issue #3463

   **0.5 hours** - pair programming mvp

8. running code?

   **1.5 hours** - Running app to try and reproduce the failure states.

   **0.5 hours** - trying to reproduce invalid file name error

9. Writing report

   **1 hour** - Refactoring and writing description of issue #5284

**0.5 hours** - project plan

#### Total: 20 hours

### Atheer Salilm

0. preliminary issue and project search

   **3** hours spent on finding the initial issue, the consisted of first looking if anything could be
   done in the **karate** project. Then started to look at other project that are suitable and fulfill the
   requirements for the task and started to scout the issues that are labelled as good first issue and getting a basic
   understanding of them in terms of what they are about and what one is supposed to do.

   Below is a list of all the issues that I gathered as potential issues that we in the group could tackle.

   - [issue1](https://github.com/pixijs/pixijs/issues/10162)
   - [issue2](https://github.com/serverless/serverless/issues/11978)
   - [issue3](https://github.com/pytorch/pytorch/issues/106377)
   - [issue4](https://github.com/pytorch/pytorch/issues/93553)
   - [issue5](https://github.com/pytorch/pytorch/issues/93701)
   - [issue6](https://github.com/commons-app/apps-android-commons/issues/3463)

1. plenary discussions/meetings;

   **0.5** hours - Start up meeting

   **1** hour - Issue selection meeting

   **1** hour - Reevaluating our issue choice after consultation with Cyrille and finding a new one

   **0.5** hours - Project plan meeting for issue #5284

   **0.5** hours - stand up meeting for issue #5284

2. discussions within parts of the group;

   **0.5** hours - syncing

3. reading documentation;

   **1** hours - reading documentation for the issue #3463 and looking up how assertThat works and how
   they differ from Junit asserts.

   **2** hours - reading documentation, man pages and looking at other website on how to use the commands
   that were suggested by Cyrille that could help automate large part of issue #3463. The commands
   in question were xargs, sed and regular expressions (regex).

   **1** hours - reading documentation and code for issue #5284, this also includes reading documentation on
   how to run the different flavours i.e builds of the app.

4. configuration and setup;

   **1** hours - installation of android studio & gradle, and setting up the project
   to be able to run the app and run the full test suite and saving the results.

5. analyzing code/output;

   **0.8** hours - understanding the current testing code structure for the issue #3463

   **0.5** hours - understanding at a very basic level how the image uploading works for issue #5284

   **1.2** hours - diving deeper into the testing suite built by the project focusing specially on testing code that is relevant for the issue #5284.
   the goal was figure out how to write test to test the added functionality for the issue, thus this included understanding how their current test suite works, how they write their test.
   This also includes reading documentation for mockito and how it's used since the project uses it a lot in their tests.

6. writing documentation;

   **0.5** hours - documentation of the onboarding experience for the project

   **1** hours - documentation of the work that I have done for the assignment

7. writing code;

   **2** hours - Rewriting all of the assert for the entire test suite using the commands which is linked
   below. Here also time was spent on adding the required imports for the tests and removing the ones no longer
   used. This also includes creating the final command (shown further below) and testing that it
   works commands that it works and the output is correct.

8. running code?

   **1** hours - running all of the tests and making sure that they work in the exact same way as before.
   This work also includes changing back some of the test because that failed because of the rewrite.

   **1** hours - Trying from the app side using the simulator figure out how to recreate a genuine image upload fail
   for the issue #5284. This also includes figuring out how to even upload pictures to the app in the first place,
   it seems silly but the debug version didn't specify that you had to create an account so gets the
   ability to upload images. This was only shown in the prod version of the build.

#### total hours: 20.0

### Melissa Mazura

0. preliminary issue and project search

   **1** hour spent on going through the different repos and try to find an issue that would work. I settled on this [issue](https://github.com/sirixdb/sirix/issues/625)

1. plenary discussions/meetings

   **0.5 hours** - Start up meeting

   **1 hour** - Issue selection meeting

   **1 hour** - Reevaluating our issue choice after consultation with Cyrille and finding a new one

   **0.5 hours** - Project plan meeting for issue #5284

2. discussions within parts of the group

   **0.5 hours** - syncing

3. reading documentation;

   **1 hour** reading up on not chosen issue [issue](https://github.com/sirixdb/sirix/issues/625)
   **1 hour** Reading documentation related to issue #5284 and on how the app works as a whole

4. configuration and setup;

   **1 hour** downloading Android Studios and Gradle, running the code and running the tests

5. analyzing code/output;

   **1 hour** trying to understand the code for issue #5284 and how to try and solve for it

6. writing documentation;

   **0.5** writing my own part and add the technical part for issue #5284

7. writing code;

   **2 hours** writing the code for the issue #5284
   **0.5 hours** peer programming with Jonatan

8. running code?

   **1 hour** running the tests again to see whether the build fails; trying to check if the function fails in its current state or not

#### Total: 12.5 hours

## Overview of issue(s) and work done.

### Title: Remove usages of assert #3463

URL: https://github.com/commons-app/apps-android-commons/issues/3463

#### Summary

This issue addresses that the project uses the Junit assert in their kotlin test but they want to upgrade
it to use appropriate AssertThat which comes from the ([hamcrest](https://hamcrest.org/JavaHamcrest/tutorial) dependency).

#### Scope

The scope of this function is both very extensive, as the project has ~1500 tests, and quite limited as most of tests can be changes using relatively simple `grep` pattern matching.

The final result of the assertion change to assertThat should be that the test results are identical.

#### the final command that was used to rewrite the assert to assertThat

```
find . -name '*.kt' | xargs grep -l 'Assert.assertNotNull' | xargs sed -i '' -e 's/Assert.assertNotNull(\(.*\))/assertThat(\1, notNullValue())/g' &&
find . -name '*.kt' | xargs grep -l 'assertNotNull' | xargs sed -i '' -e 's/assertNotNull(\(.*\))/assertThat(\1, notNullValue())/g' &&
find . -name '*.kt' | xargs grep -l 'assertNull' | xargs sed -i '' -e 's/assertNull(\(.*\))/assertThat(\1, nullValue())/g' &&
find . -name '*.kt' | xargs grep -l 'Assert.assertEquals' | xargs sed -i '' -e 's/Assert.assertEquals(\(.*\),\(.*\))/assertThat(\1, equalTo(\2))/g' &&
find . -name '*.kt' | xargs grep -l 'assertEquals' | xargs sed -i '' -e 's/assertEquals(\(.*\),\(.*\))/assertThat(\1, equalTo(\2))/g' &&
find . -name '*.kt' | xargs grep -l 'Assert.assertTrue' | xargs sed -i '' -e 's/Assert.assertTrue(\(.*\))/assertThat(\1, `is`(true))/g' &&
find . -name '*.kt' | xargs grep -l 'assertTrue' | xargs sed -i '' -e 's/assertTrue(\(.*\))/assertThat(\1, `is`(true))/g' &&
find . -name '*.kt' | xargs grep -l 'Assert.assertFalse' | xargs sed -i '' -e 's/Assert.assertFalse(\(.*\))/assertThat(\1, `is`(false))/g' &&
find . -name '*.kt' | xargs grep -l 'assertFalse' | xargs sed -i '' -e 's/assertFalse(\(.*\))/assertThat(\1, `is`(false))/g'
```

### Title: Prevent retries for genuinely failed uploads #5284

URL: https://github.com/commons-app/apps-android-commons/issues/5284

#### Summary

This issue is about stopping automatic retries when a picture fails for a reason which obviously won't change when trying again, for example if it has an invalid filename.

The main location to start looking is [here](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669), as well as more details can be found [here](https://github.com/commons-app/apps-android-commons/pull/5257#discussion_r1304662562). This in turn calls restartUpload which then calls [contributionsPresenter.saveContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsPresenter.java#L69) where the actuall upload is reattempted. Currently there does not seem to be any way to see why the attempt failed, which likely will be what we need to implement, so that it can then be used to terminate the reuploads early.

The actual location where the outcome of the upload attempt is determined seems to be in [UploadWorker](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/8c63d74beed20d785d7789f1fea571f9ab164368/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt#L299), so this is likely where we want to add code to be able to tell the reupload why a attempt failed.

Overview of how uploading photos works can be found [here](<https://github.com/commons-app/commons-app-documentation/blob/master/android/Code-walkthrough-for-new-devs-(draft).md>) under Uploading Pictures (this is quite out of date).

#### Scope

The scope of this issue is a bit difficult to predetermine as the upload functionality is spread out over more than 50 files, meaning that getting an overview of how it works is a significant task in it self.

#### Requirements

- Change behaviour of [retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669) to stop if reason for failure won't change (like invalid filepath).

- This require us to have information on why the attempted failed at retryUpload, maybe through changing adding a value to [Contribution.state](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt#L96) for genuine failure, or maybe we can use the field [hasInvalidLocation](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt#L45) though this will only cover this specific case. Also we should really avoid changing contribution if we can avoid it as they store this object in a DB.

- This the requires us to determine and save why the attempt failed, start looking in [contributionsPresenter.saveContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsPresenter.java#L69).

- Finally we need documentation of any thing we do, JavaDocs and maybe in https://github.com/commons-app/commons-app-documentation, but that might be outdated. And unit tests of this functionality.

## Requirements for the new feature or requirements affected by functionality being refactored

Optional (point 3): trace tests to requirements.

## Code changes

### Patch

(copy your changes or the add git command to show them)

git diff ...

Optional (point 4): the patch is clean.

Optional (point 5): considered for acceptance (passes all automated checks).

## Test results

Overall results with link to a copy or excerpt of the logs (before/after
refactoring).

[Original test suite results](https://github.com/DD2480-group8-VT24/apps-android-commons/tree/main/original_test_log)

[test suite result after refactoring assert to assertThat](https://github.com/DD2480-group8-VT24/apps-android-commons/tree/testsuite_log_after_refactor_from_assert_to_assertthat/refactor_assert_to_assertThat_test_log/testBetaDebugUnitTest)

## UML class diagram and its description

### Key changes/classes affected

Optional (point 1): Architectural overview.

Optional (point 2): relation to design pattern(s).

## Overall experience

What are your main take-aways from this project? What did you learn?

**Jonatan Tuvstedt** - My main take away from this project is that trying to get to grips with a large code base as a group is very hard. I have previous experience with digging in into a large unknown code base, but only on my own. Trying to sync this effort to avoid everyone having to duplicate the same work in understanding how the code base works and where our issue fits into this is very difficult. On the one hand everyone will need to get to grips with the general code layout to be able to understand the problem, but on the other hand not everyone needs to dig into the nitty gritty of every part. Determining where that line lies and how to best sync what we have learned has probably been the biggest challenge, but is also a very important take away.

### Essence standard

For **Seeded** we haven't really moved much since lab 2. We still fulfil all the bullet points (that are relevant) except for governance and leadership which is still very ad hoc. One point where we might have regressed somewhat is regarding constraints on where and how the work is carried out which is a lot harder to nail down with such an open ended assignment, when compared to lab 2. Regarding **Formed** we have actually gotten a better score, but only because we actually have external stakeholders which we didn't for lab 2. And here as well we achieve some points to a lesser extent than before just because the assignment is harder to structure when so much effort needs to be put into defining what needs to be done.

On the **Collaborating** front we have done a bit better, mostly due to us coming to terms with some of us having a very different schedule. This in combination with the fact that we did not just try and split the work in 5 but instead worked more iteratively made the collaboration run more smoothly. Finally with regards to **Performing** we also out progressed since lab 2 with us being more adaptive and better at avoiding wasted work, mostly due to improvements in **Collaborating**.
