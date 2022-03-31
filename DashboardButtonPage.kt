package com.example.geekbrains_bottom_navigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

class DashboardButtonPage {

    private val dashboardBtn = Espresso.onView(withId(R.id.navigation_dashboard))
    private val dashboardText = Espresso.onView(withId(R.id.text_dashboard))

    fun clickOnBtnDashboard() : DashboardButtonPage {
        dashboardBtn.perform(click())
        return this
    }

    fun checkBtnDashboardIsEnabled() : DashboardButtonPage {
        dashboardBtn.check(matches(isEnabled()))
        return this
    }

    fun checkBtnDashboardIsDisplayed() : DashboardButtonPage {
        dashboardBtn.check(matches(isDisplayed()))
        return this
    }

    fun checkTextDashboardIsDisplayed() {
        dashboardText.check(matches(isDisplayed()))
    }

    fun checkScreenDashboardContainsText(text : String) {
        dashboardText.check(matches(withText(text)))

    }
}