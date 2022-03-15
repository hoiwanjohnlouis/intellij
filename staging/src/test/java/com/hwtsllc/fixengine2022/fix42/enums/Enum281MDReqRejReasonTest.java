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

package com.hwtsllc.fixengine2022.fix42.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

class Enum281MDReqRejReasonTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0281Test() {
        Enum281MDReqRejReason enumType;

        /*
         * 0-9 msg types
         */
        enumType = Enum281MDReqRejReason.UNKNOWN_SYMBOL;
        enumType = Enum281MDReqRejReason.DUPLICATE_MDREQID;
        enumType = Enum281MDReqRejReason.INSUFFICIENT_BANDWIDTH;
        enumType = Enum281MDReqRejReason.INSUFFICIENT_PERMISSIONS;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_MARKETDEPTH;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDUPDATETYPE;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_AGGREGATEDBOOK;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDENTRYTYPE;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_TRADINGSESSIONID;

        /*
         * A-D msg types
         */
        enumType = Enum281MDReqRejReason.UNSUPPORTED_SCOPE;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_OPENCLOSESETTLEFLAG;
        enumType = Enum281MDReqRejReason.UNSUPPORTED_MDIMPLICITDELETE;
        enumType = Enum281MDReqRejReason.INSUFFICIENT_CREDIT;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}