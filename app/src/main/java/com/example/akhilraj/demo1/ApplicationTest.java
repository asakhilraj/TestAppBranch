package com.example.akhilraj.demo1;

import android.app.Application;
import android.test.ApplicationTestCase;

import io.branch.referral.Branch;




/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends Application {

    public void onCreate() {
        super.onCreate();
        Branch.enableLogging();

        // Initialize the Branch object
        Branch.getAutoInstance(this);


    }
}