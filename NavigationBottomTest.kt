package com.example.geekbrains_bottom_navigation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)

class NavigationBottomTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val homeMessage: String = "This is home Fragment"
    private val dashboardMessage: String = "This is dashboard Fragment"
    private val notificationsMessage: String = "This is notifications Fragment"

    @Test
    fun checkHomeButton() {
        HomeButtonPage()
            .checkBtnHomeIsDisplayed()
            .clickOnBtnHome()
            .checkBtnHomeIsEnabled()
    }

    @Test
    fun checkTextHome() {
        HomeButtonPage()
            .clickOnBtnHome()
            .checkTextHomeIsDisplayed()
    }

    @Test
    fun checkHomeMessage() {
        HomeButtonPage()
            .clickOnBtnHome()
            .checkScreenHomeContainsText(homeMessage)
    }

    @Test
    fun checkDashboardButton() {
        DashboardButtonPage()
            .checkBtnDashboardIsDisplayed()
            .clickOnBtnDashboard()
            .checkBtnDashboardIsEnabled()
    }

    @Test
    fun checkTextDashboard() {
        DashboardButtonPage()
            .clickOnBtnDashboard()
            .checkTextDashboardIsDisplayed()
    }

    @Test
    fun checkDashboardMessage() {
        DashboardButtonPage()
            .clickOnBtnDashboard()
            .checkScreenDashboardContainsText(dashboardMessage)

    }

    @Test
    fun checkNotificationsButton() {
        NotificationsButtonPage()
            .checkBtnNotificationsIsDisplayed()
            .clickOnBtnNotifications()
            .checkBtnNotificationsIsEnabled()
    }

    @Test
    fun checkTextNotifications() {
        NotificationsButtonPage()
            .clickOnBtnNotifications()
            .checkTextNotificationsIsDisplayed()
    }

    @Test
    fun checkNotificationsMessage() {
        NotificationsButtonPage()
            .clickOnBtnNotifications()
            .checkScreenNotificationsContainsText(notificationsMessage)
    }
}

//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



