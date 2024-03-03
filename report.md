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

One issue that was common among the team was that the test results seemed to differ depending on the environment,
those that had Windows machines seemed to get between 200~300 failing test cases in total but one team member who
has a Mac OS environment across all tests has only 5 failing tests. This is weird, we didn't try to resolve or
find out why the test results differ between environments. All of the testing logs that we refer to were run on the same environment
and the same machine.

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

   **0.5 hours** - Syncing meeting infor presentation

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

   **1 hour** - Writing essence standard evaluation and finishing issue description.

**0.5 hours** - project plan

#### Total: 21.5 hours

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

   **0.5** hours - meeting infor the presentation

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

   **0.6** hours - documentation of the onboarding experience for the project

   **1** hours - documentation of the work that I have done for the assignment

   **1** hours - improve the documentation of issue #3463 in the report

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

#### total hours: 21.6

### Mert Demirsü

1. plenary discussions/meetings

   **0.5 hours** Start up meeting

   **1 hour** Issue selection meeting

2. discussions within parts of the group

   **1 hours** General Discussion

3. configuration and setup

   **1 hour** Downloading and installing Android Studios, Gradle and setting it up to run the tests with.

4. analyzing code/output

   **2 hour** trying to understand the test cases for issue #5284 and how to implement working tests for our implemented code (With Melissa):

5. running and testing code

   **1 hour** running the tests with coverage in order to plan for further implementation of our own (With Melissa):

#### Total hours: 6.5

### Melissa Mazura

0. preliminary issue and project search

   **1** hour spent on going through the different repos and try to find an issue that would work. I settled on this [issue](https://github.com/sirixdb/sirix/issues/625)

1. plenary discussions/meetings

   **0.5 hours** Start up meeting

   **1 hour** Issue selection meeting

   **1 hour** Reevaluating our issue choice after consultation with Cyrille and finding a new one

   **0.5 hours** Project plan meeting for issue #5284

   **0.5 hours** meeting for issue #5284 and further discussion

2. discussions within parts of the group

   **0.5 hours** syncing

3. reading documentation

   **1 hour** reading up on not chosen issue [issue](https://github.com/sirixdb/sirix/issues/625)

   **1 hour** Reading documentation related to issue #5284 and on how the app works as a whole

4. configuration and setup

   **1 hour** downloading Android Studios and Gradle, running the code and running the tests

5. analyzing code/output;

   **1 hour** trying to understand the code for issue #5284 and how to try and solve for it

   **1 hour** looking at invalidFilePath and understanding how that works

   **2 hour** understanding the test suites and the current test state with Mert

6. writing documentation

   **1 hour** writing my own part and add the technical part for issue #5284

   **1 hour** creating the UML diagram

7. writing code

   **0.5 hours** writing first solution for issue #5284

   **0.5 hours** peer programming with Jonatan

   **1 hour** writing proper solution for issue #5284

   **0.5 hours** cleaning up code

8. running code?

   **1 hour** running the tests again to see whether the build fails; trying to check if the function fails in its current state or not

   **1 hour** checking test cases and their coverage for our function with Mert

#### Total: 18.5 hours

## Overview of issue(s) and work done.

### Issue #3463: Remove usages of assert

URL: https://github.com/commons-app/apps-android-commons/issues/3463

#### Summary

This issue addresses that the project uses the Junit assert in their Kotlin tests but they want to
update the assert statements to instead use appropriate AssertThat statements which come from the
([hamcrest](https://hamcrest.org/JavaHamcrest/tutorial) dependency).

#### Scope

This issue essentially affects all of the existing test cases since the entire test suite has to be updated
to use assertThat. Furthermore, the scope of this issue is both very extensive, as the project has ~1500 tests,
and quite limited as most of the test cases use the same assert patterns which can be automatically
rewritten to appropriate assertThat statements with the help of regular expression (more about this below).

#### Requirements

The requirements for this issue is very straight forward

##### requirement 1

###### Title: refactor test suite to use assertThat statements

###### Description

- refactor the existing Junit assert statements to appropriate assertThat statements for a given test case
- do the above step for the entire test suite

##### requirement 2

###### Title: a succeeding test before refactor should still succeed after refactor

###### Description

- After a test case has been rewritten using a appropriate assertThat statements if the test case
  succeeded before the rewrite then it has also to succeed after the rewrite.

#### work plan

The initial work plan for this issue was that each person work one folder at a time. The project had
divided close related tests into the same folder thus the person was in charge of rewriting that entire
folder of tests to use assertThat. We were unsure if this issue counted towards being non-trivial thus
we contacted Cyrille and discussed the issue with him and he pointed us that the issue can
largely be automated by regular expression and some unix commands. We were instructed to investigate
if this issue could largely be solved using regular expression and if that is the case then we would have
to find a new issue, which was what we ultimately did.

Atheer Salim, investigated the commands and regular expressions if it did help or not and the result
was that it did, but atheer was allowed to spend as small amount of time as possible on rewriting the test
cases using the automatic command and could then join the other team members in working on the new issue

#### the final command that was used to rewrite the assert to assertThat

This is the final command that was constructed to help automatically rewrite the entire test suite from
assert to AssertThat this was possible since the entire test suite consisted of very few different assert
patterns.

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

##### Explanation of the command

`find` - this command was used to find all files that ended with .kt which is used to denote
kotlin files, which is where the test cases resided.

`xargs` - this is a general command that was used to help read the output of the previous command

`grep` - this command was used to find the lines of code that contained the first part of the assert pattern

`sed` - this was the command that was used to read in and pattern match for a pattern that will
be replaced with a corresponding appropriate assertThat using regular expression.

#### code changes

The code was changed using the command shown previously and since the different assert patterns was few
this made it possible to refactor the majority of the test to use assertThat statements. To note there
are few test cases that still Junit assert statements and the reason for this is that the automatic rewrite
made those test cases fail when they actually succeeded before the rewrite and as Cyrille requested
no time was allocated for solving those.

The entire code that was changed can be viewed using the following [PR](https://github.com/commons-app/apps-android-commons/pull/5574) which was submitted to the repo.

### Issue #5284: Prevent retries for genuinely failed uploads

URL: https://github.com/commons-app/apps-android-commons/issues/5284

#### Summary

This issue is about stopping automatic retries when an upload attempt for a picture fails for a reason which can't be solved by just trying again, for example if it has an invalid filename. The purpose of this is primarily to improve the UX while also freeing up system resources.

The part of the code which deals with retrying uploads is in [ContributionsFragment.retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669), where the decision whether to try again is made. The actual (re)uploading is managed by [UploadWorker.uploadContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/8c63d74beed20d785d7789f1fea571f9ab164368/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt#L299), and this is where the succes or failure of the upload attempt is determined. This information is then stored in the [Contribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/39f624a1d3d289f81305509c1e8e09db86c2ccf4/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt) object which contains all the context and information about the picture. Currently the only info about the upload status stored in Contribution is whether it succeeded, is paused or failed.

#### Scope

Ascertaining the scope of this issue was a somewhat difficult task with the size of the code base. But at its most basic the scope of this issue boils down to 2 requirements. Passing on the reason for why an upload failed to the retryUpload function, and there determining if said failure reason qualifies as a genuine failure. However this last step is challenging as determining which failure reasons are genuine requires us to determine what failures and exceptions can even be thrown, meaning we need to reproduce any number of errors.

#### Requirements

The actual requirements for this issue then is quite simple:

##### Requirement 2.1: Failure identification

Change behaviour of [uploadContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/8c63d74beed20d785d7789f1fea571f9ab164368/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt#L299) to pass on failure reasons

##### Requirement 2.2: Failure classification

Use said failure reasons to determine if the failure is a genuine one in [retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669).

##### Requirement 2.3: User notification (somewhat optional)

Good to have but not strictly necessary: We should tell the user about why the upload failed, either if it is a genuine failure or if it has just timed out

#### Work plan

Our plan to implement this is as follows:

1. Add fields to the Contribution class describing failure reason and/or failure exception
2. At all failure points in [uploadContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/8c63d74beed20d785d7789f1fea571f9ab164368/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt#L299) set said fields
3. In [retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/baa6ddc21b68ebac06a93964c4fa45972367bed0/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L669) create a function which determines if a failure is a genuine one

   - Our plan is to do this as a white list where we determine some patterns of failures and/or exceptions which should be considered a genuine failure, and if the failure reason doesn't match this list then we fall back on the current behaviour of just retrying 10 times.
   - The biggest challenge here is to determine the kind of patterns which should constitute genuine failures. Especially as we are having trouble even reproducing the example error for this issue (invalid filename).

4. Use said function to determine if a upload should be reattempted.
5. Inform the user about the status of their failed upload

## Code changes

To change the code according according to the work plan, we had to change three different files. The solution for this can be found on this [branch](https://github.com/DD2480-group8-VT24/apps-android-commons/tree/issue-5284_Prevent_retries_for_genuinely_failed_uploads).

1. [Contribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt#L22)

   To update the contribution class, we have created two different variables. The first one, [errorMessage](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt#L32C30-L32C31), makes certain that we can save custom error messages to a field in the contribution. The second change correlates to the variable [exceptionMessage](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/Contribution.kt#L33C9-L33C25) which will store the exception as a string. Both of these variables are set to null in the beginning to ensure a genunine error analysis.

2. [UploadContribution](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/8c63d74beed20d785d7789f1fea571f9ab164368/app/src/main/java/fr/free/nrw/commons/upload/worker/UploadWorker.kt#L299)

   This function had to be changed more severely by using the existing contribution object and updating the errorMessage and expectionMessage accordingly. Starting by setting

3. [retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L677)

   In [this function](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L687), we check, before retrying the upload, whether the mistake was genuine or not. When it was a genuine failure, we do not try to reupload. For that, we call a new function called [isGenuineError](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L713).

   These arrays [STASH_ERROR_CODES](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L121) and [STASH_EXCEPTIONS](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L121) simply store the different types of error codes to be then used later on.

   The function [isGenuineError](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L713) compares the errorMessage to the errorCodes and the expetionMessage to its counterpart of stashed exceptions.

4. It should then tell the user what actually happened in the code by modifying the error message that will be send in [retryUpload](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/d75c3a6086b3f9f6ef035a2b69cedb889a0756dd/app/src/main/java/fr/free/nrw/commons/contributions/ContributionsFragment.java#L677).

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

[test suite result after working on issue #5284](https://github.com/DD2480-group8-VT24/apps-android-commons/tree/issue-5284-test-log/issue-5284-full-test-suite-log)

## UML class diagram and its description

### Key changes/classes affected

Before the changes to the code:

![alt text](https://raw.githubusercontent.com/DD2480-group8-VT24/apps-android-commons/main/uml_before.png)

After the changes to the code:

![alt text](https://github.com/DD2480-group8-VT24/apps-android-commons/blob/main/uml_after.png?raw=true)

## Overall experience

What are your main take-aways from this project? What did you learn?

**Jonatan Tuvstedt** - My main take away from this project is that trying to get to grips with a large code base as a group is very hard. I have previous experience with digging in into a large unknown code base, but only on my own. Trying to sync this effort to avoid everyone having to duplicate the same work in understanding how the code base works and where our issue fits into this is very difficult. On the one hand everyone will need to get to grips with the general code layout to be able to understand the problem, but on the other hand not everyone needs to dig into the nitty gritty of every part. Determining where that line lies and how to best sync what we have learned has probably been the biggest challenge, but is also a very important take away.

**Melissa Mazura** - My experience is that working on this type of project is very hard. I was not expecting it to be so difficult to try and find out what the reason for this failure is and how to solve for it. Additionally, working as a group proved to be rather difficult too for such a task, as it is fairly difficult to separate tasks effectively. I also conclude that trying to understand someone else's code can be very difficult, as well as finding the spot in the code that needs to be changed and analysed for an effective test case that can be used. Additionally, I am not very well versed in Java, which proved to be a small problem when trying to analyse the code and error handling as a whole. But I think that I really learned how to work thorugh a code base from someone else and how to find the spots that will be needed to be changed to solve a problem. It has also taught me that working in a team requires a lot of times where people will have to do the same task (like running the app or finding the error in the code) for it to be successful in the end.

### Essence standard

For **Seeded** we haven't really moved much since lab 2. We still fulfil all the bullet points (that are relevant) except for governance and leadership which is still very ad hoc. One point where we might have regressed somewhat is regarding constraints on where and how the work is carried out which is a lot harder to nail down with such an open ended assignment, when compared to lab 2. Regarding **Formed** we have actually gotten a better score, but only because we actually have external stakeholders which we didn't for lab 2. And here as well we achieve some points to a lesser extent than before just because the assignment is harder to structure when so much effort needs to be put into defining what needs to be done.

On the **Collaborating** front we have done a bit better, mostly due to us coming to terms with some of us having a very different schedule. This in combination with the fact that we did not just try and split the work in 5 but instead worked more iteratively made the collaboration run more smoothly. Finally with regards to **Performing** we also progressed since lab 2 with us being more adaptive and better at avoiding wasted work, mostly due to improvements in **Collaborating**.
