/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;


// this function connects our application to the parse server
// it initializes app id and client key on the server
public class Init_ParseServer extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // connect to the server
    Parse.enableLocalDatastore(this);
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("02dcde4a6cfca1be0d2eaacce630a235b8ed5eb2")
            .clientKey("1bb4d69cacb6a9bfcd22f4bd971c3356b2e17611")
            .server("http://13.59.78.209:80/parse/")
            .build()
    );


    //initiation
    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    defaultACL.setPublicReadAccess(true);
    defaultACL.setPublicWriteAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);

  }
}
