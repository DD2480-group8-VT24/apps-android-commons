# Report for assignment 4

## Project

Name: apps-android-commons (group 8)

URL: https://github.com/commons-app/apps-android-commons

This project is android app where you users can upload pictures to the wikimedia commons

## Onboarding experience

Did you choose a new project or continue on the previous one?

If you changed the project, how did your experience differ from before?

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

   **2.5 hours** - Including scouting project and issues, and getting them to run. And then redoing the job when 5 other groups had chosen JabRef

1. plenary discussions/meetings;

   **3 hours** - Meetings covering project start up, selection of issue and project, and reevaluating our issue choice after consultation with Cyrille

2. discussions within parts of the group;

3. reading documentation;

   **1 hour** - Initial analysis work for issue #3463, getting an understanding of the issue and solution (and the problem with having it as our main issue)

   **1 hour** - Reading documentation related to issue #5284, more specifically how uploading works

4. configuration and setup;

   **1 hour** - Getting the project and Android Studio to run

5. analyzing code/output;
   **1 hour** - Analysing how picture uploading works and how we can determine why an upload failed.

6. writing documentation;

   **1 hour**

7. writing code;
   **30 min** - Initial manual work on issue #3463

8. running code?

#### Total: 11 hours

## Overview of issue(s) and work done.

### Title: Remove usages of assert #3463

URL: https://github.com/commons-app/apps-android-commons/issues/3463

#### Summary

This issue addresses that the project uses the Junit assert in their kotlin test but they want to upgrade
it to use appropriate AssertThat which comes from the ([hamcrest](https://hamcrest.org/JavaHamcrest/tutorial) dependency).

#### Scope

The scope of this function is both very extensive, as the project has ~1500 tests, and quite limited as most of tests can be changes using relatively simple `grep` pattern matching.

The final result of the assertion change to assertThat should be that the test results are identical.

### Title: Prevent retries for genuinely failed uploads #5284

URL: https://github.com/commons-app/apps-android-commons/issues/5284

#### Summary

This issue is about stopping automatic retries when a picture fails for a reason which obviously won't change when trying again, for example if it has an invalid filename. 

The main location to start looking is [here](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669), as well as more details can be found [here](https://github.com/commons-app/apps-android-commons/pull/5257#discussion_r1304662562). This in turn calls restartUpload which then calls [contributionsPresenter.saveContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsPresenter.java#L69) where the actuall upload is reattempted. Currently there does not seem to be any way to see why the attempt failed, which likely will be what we need to implement, so that it can then be used to terminate the reuploads early.

The actual location where the outcome of the upload attempt is determined seems to be in [UploadWorker](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/main/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt), so this is likely where we want to add code to be able to tell the reupload why a attempt failed.

Overview of how uploading photos works can be found [here](https://github.com/commons-app/commons-app-documentation/blob/master/android/Code-walkthrough-for-new-devs-(draft).md) under Uploading Pictures (this is quite out of date).

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

## UML class diagram and its description

### Key changes/classes affected

Optional (point 1): Architectural overview.

Optional (point 2): relation to design pattern(s).

## Overall experience

What are your main take-aways from this project? What did you learn?

How did you grow as a team, using the Essence standard to evaluate yourself?

Optional (point 6): How would you put your work in context with best software engineering practice?

Optional (point 7): Is there something special you want to mention here?
