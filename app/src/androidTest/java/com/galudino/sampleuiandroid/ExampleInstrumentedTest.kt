/**
 *  @file   ExampleInstrumentedTest.kt
 *  @brief  TODO doc
 *
 *  @author Gemuele Aludino
 *  @date   26 Sep 2021
 */

package com.galudino.sampleuiandroid

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    /**
     * TODO doc
     */
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.galudino.sampleuiandroid", appContext.packageName)
    }
}