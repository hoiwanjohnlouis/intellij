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

package com.hwtsllc.fixengine2022.factories;

import com.hwtsllc.fixengine2022.fix40.Tag35MsgType;
import com.hwtsllc.fixengine2022.fix40.Tag55Symbol;
import com.hwtsllc.fixengine2022.views.TradeView;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIXBodyTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1Account.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Test() {
        assertEquals(1,1);
        assertNotEquals(2,1);
        logger.info(WHERE_AM_I + ":Successful Test(). More testing is needed.");
    }
    @Test
    void TestFIXBody1() {
        FIXBody record =
                new FIXBody.Builder()
                        .buildOpeningPrice(12.34D)
                        .buildPreviousDaysClosingPrice(56.78D)
                        .buildLastTradePrice(90.12D)
                        .buildLastTradeQuantity(123.4D)
                        .buildLastTradeTimeStamp("102346 EST")
                        .build();

        System.out.println(record);
        System.out.println(record.toLogStringVerbose());
    }
}