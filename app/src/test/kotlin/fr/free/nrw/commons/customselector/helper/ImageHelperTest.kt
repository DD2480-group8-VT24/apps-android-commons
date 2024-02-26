package fr.free.nrw.commons.customselector.helper

import android.net.Uri
import fr.free.nrw.commons.customselector.model.Folder
import fr.free.nrw.commons.customselector.model.Image
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo

import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Custom Selector Image Helper Test
 */
internal class ImageHelperTest {

    var uri: Uri = mock(Uri::class.java)
    private val folderImage1 = Image(1, "image1", uri, "abc/abc", 1, "bucket1")
    private val folderImage2 = Image(2, "image1", uri, "xyz/xyz", 2, "bucket2")
    private val mockImageList = ArrayList<Image>(listOf(folderImage1, folderImage2))
    private val folderImageList1 = ArrayList<Image>(listOf(folderImage1))
    private val folderImageList2 = ArrayList<Image>(listOf(folderImage2))

    /**
     * Test folder list from images.
     */
    @Test
    fun folderListFromImages() {
        val folderList = ArrayList<Folder>(listOf(Folder(1, "bucket1", folderImageList1), Folder(2, "bucket2", folderImageList2)))
        assertThat(folderList, equalTo(ImageHelper.folderListFromImages(mockImageList)))
    }

    /**
     * Test filter images.
     */
    @Test
    fun filterImages() {
        assertThat(folderImageList1, equalTo(ImageHelper.filterImages(mockImageList, 1)))
    }

    /**
     * Test get index from image list.
     */
    @Test
    fun getIndex() {
        assertThat(1,equalTo(ImageHelper.getIndex(mockImageList, folderImage2)))
    }

    /**
     * Test get index list.
     */
    @Test
    fun getIndexList() {
        assertThat(ArrayList<Int>(listOf(0)), equalTo(ImageHelper.getIndexList(mockImageList, folderImageList2)))
    }
}