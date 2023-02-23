package com.github.guobasdpbootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static org.hamcrest.Matchers.allOf;

import android.content.Intent;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    //On the main activity, you want to make sure that
    // when the button is clicked an intent is fired and the intent contains the name

    @Test
    public void whenClickButtonActivityFiresAnIntent() {
        Intents.init();
        onView(ViewMatchers.withId(R.id.mainName)).perform(clearText());
        onView(ViewMatchers.withId(R.id.mainName)).perform(typeText("Harry Potter\n"));
        onView(ViewMatchers.withId(R.id.mainGotoButton)).perform(click());
        Matcher<Intent> intentMatcher = allOf(
                hasExtra("UserInputName", "Harry Potter")
        );
        intended(intentMatcher);
        Intents.release();
    }
}
