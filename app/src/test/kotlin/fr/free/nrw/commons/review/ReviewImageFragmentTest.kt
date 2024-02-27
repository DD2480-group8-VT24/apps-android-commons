package fr.free.nrw.commons.review

import android.content.Context
import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.test.core.app.ApplicationProvider
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.soloader.SoLoader
import com.nhaarman.mockitokotlin2.doReturn
import fr.free.nrw.commons.Media
import fr.free.nrw.commons.OkHttpConnectionFactory
import fr.free.nrw.commons.R
import fr.free.nrw.commons.TestCommonsApplication
import fr.free.nrw.commons.createTestClient
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import org.powermock.reflect.Whitebox
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config
import org.robolectric.annotation.LooperMode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import java.lang.reflect.Method

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [21], application = TestCommonsApplication::class)
@LooperMode(LooperMode.Mode.PAUSED)
class ReviewImageFragmentTest {
    private lateinit var fragment: ReviewImageFragment

    private lateinit var context: Context

    lateinit var textViewQuestion: TextView

    lateinit var textViewQuestionContext: TextView

    lateinit var yesButton: Button

    lateinit var noButton: Button

    lateinit var view: View

    @Mock
    private lateinit var savedInstanceState: Bundle

    private lateinit var activity: ReviewActivity

    @Before
    fun setUp() {

        MockitoAnnotations.openMocks(this)
        context = ApplicationProvider.getApplicationContext()
        OkHttpConnectionFactory.CLIENT = createTestClient()
        SoLoader.setInTestMode()

        Fresco.initialize(context)
        activity = Robolectric.buildActivity(ReviewActivity::class.java).create().get()
        fragment = ReviewImageFragment()
        val bundle = Bundle()
        bundle.putInt("position", 1)
        fragment.arguments = bundle
        val fragmentManager: FragmentManager = activity.supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(fragment, null)
        fragmentTransaction.commit()

        view = LayoutInflater.from(activity)
            .inflate(R.layout.fragment_review_image, null) as View

        noButton = view.findViewById(R.id.button_no)
        yesButton = view.findViewById(R.id.button_yes)
        textViewQuestion = view.findViewById(R.id.tv_review_question)
        textViewQuestionContext = view.findViewById(R.id.tv_review_question_context)

        fragment.noButton = noButton
        fragment.yesButton = yesButton
        fragment.textViewQuestion = textViewQuestion
        fragment.textViewQuestionContext = textViewQuestionContext
    }

    @Test
    @Throws(Exception::class)
    fun testOnDisableButton() {
        fragment.disableButtons()
        assertThat(yesButton.isEnabled, equalTo( false))
        assertThat(yesButton.alpha, equalTo( 0.5f))
        assertThat(noButton.isEnabled, equalTo( false))
        assertThat(noButton.alpha, equalTo( 0.5f))
    }


    @Test
    @Throws(Exception::class)
    fun testOnEnableButton() {
        fragment.enableButtons()
        assertThat(yesButton.isEnabled, equalTo( true))
        assertThat(yesButton.alpha, equalTo( 1f))
        assertThat(noButton.isEnabled, equalTo( true))
        assertThat(noButton.alpha, equalTo( 1f))
    }


    @Test
    @Throws(Exception::class)
    fun testOnUpdateCategoriesQuestion() {
        shadowOf(Looper.getMainLooper()).idle()
        val media = mock(Media::class.java)
        Whitebox.setInternalState(activity, "media", media)
        assertThat(media, notNullValue())
        val categories = mapOf<String, Boolean>("Category:" to false)
        doReturn(categories).`when`(media).categoriesHiddenStatus
        assertThat(media.categoriesHiddenStatus, notNullValue())
        assertThat(fragment.isAdded, notNullValue())
        val method: Method =
            ReviewImageFragment::class.java.getDeclaredMethod("updateCategoriesQuestion")
        method.isAccessible = true
        method.invoke(fragment)
    }

    @Test
    @Throws(Exception::class)
    fun testOnSaveInstanceState() {
        fragment.onSaveInstanceState(savedInstanceState)
    }

    @Test
    @Throws(Exception::class)
    fun testOnYesButtonClicked() {
        shadowOf(Looper.getMainLooper()).idle()
        fragment.onYesButtonClicked()
    }

    @Test
    @Throws(Exception::class)
    fun testOnGetReviewCallback() {
        val method: Method =
            ReviewImageFragment::class.java.getDeclaredMethod("getReviewCallback")
        method.isAccessible = true
        method.invoke(fragment)
    }

    @Test
    fun testOnGetReviewActivity() {
        val method: Method =
            ReviewImageFragment::class.java.getDeclaredMethod("getReviewActivity")
        method.isAccessible = true
        shadowOf(Looper.getMainLooper()).idle()
        assertThat(method.invoke(fragment), notNullValue())
    }
}