package com.example.geekbrains_bottom_navigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

class NotificationsButtonPage {
    private val notificationsBtn = Espresso.onView(withId(R.id.navigation_notifications))
    private val notificationsText = Espresso.onView(withId(R.id.text_notifications))

    fun clickOnBtnNotifications() : NotificationsButtonPage {
        notificationsBtn.perform(click())
        return this
    }

    fun checkBtnNotificationsIsEnabled() : NotificationsButtonPage {
        notificationsBtn.check(matches(isEnabled()))
        return this
    }

    fun checkBtnNotificationsIsDisplayed() : NotificationsButtonPage {
        notificationsBtn.check(matches(isDisplayed()))
        return this
    }

    fun checkTextNotificationsIsDisplayed() {
        notificationsText.check(matches(isDisplayed()))
    }

    fun checkScreenNotificationsContainsText(text : String) {
        notificationsText.check(matches(withText(text)))

    }
}