/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final String WHERE_AM_I = Main.class.getSimpleName();
    private static final Logger logger = LogManager.getLogger(Main.class);


    /*
     *
     */
    public static void main(String[] args) {
        String hello = "hello"
                .concat(" ")
                .concat("from main.");
        //System.out.println(hello);

        String goodbye = "goodbye"
                .concat(" ")
                .concat("from main.");
        //System.out.println(goodbye);

        logger.trace(WHERE_AM_I + ".1:Hello from Main");
        logger.info(WHERE_AM_I + ".2:Hello from Main");
        logger.warn(WHERE_AM_I + ".3:Hello from Main");
        logger.error(WHERE_AM_I + ".4:Hello from Main");
    }
}
