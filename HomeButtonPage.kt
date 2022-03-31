package com.example.geekbrains_bottom_navigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

class HomeButtonPage {
    private val homeBtn = Espresso.onView(withId(R.id.navigation_home))
    private val homeText = Espresso.onView(withId(R.id.text_home))

    fun clickOnBtnHome() : HomeButtonPage {
        homeBtn.perform(click())
        return this
    }

    fun checkBtnHomeIsEnabled() : HomeButtonPage {
        homeBtn.check(matches(isEnabled()))
        return this
    }

    fun checkBtnHomeIsDisplayed() : HomeButtonPage {
        homeBtn.check(matches(isDisplayed()))
        return this
    }

    fun checkTextHomeIsDisplayed() {
        homeText.check(matches(isDisplayed()))
    }

    fun checkScreenHomeContainsText(text : String) {
        homeText.check(matches(withText(text)))

    }

}