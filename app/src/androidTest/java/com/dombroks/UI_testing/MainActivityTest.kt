package com.dombroks.UI_testing

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    @Test
    fun isActivityInView() {
        val ActivityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonNext)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonNext)).perform(click())
        onView(withId(R.id.secondActivity)).check(matches(isDisplayed()))


    }
}


