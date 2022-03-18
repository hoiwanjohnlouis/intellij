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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag42OrigTimeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0042Test() {
        FIXType fix42OrigTime = FIXType.FIX42_ORIG_TIME;
        assertEquals( "ORIG_TIME", fix42OrigTime.getName());
        assertEquals( 42, fix42OrigTime.getNumber());
        assertEquals( "OrigTime", fix42OrigTime.getDescription());
        assertNotEquals( "ORIG_TIME ORIG_TIME", fix42OrigTime.getName());
        assertNotEquals( 3123, fix42OrigTime.getNumber());
        assertNotEquals( "OrigTime OrigTime", fix42OrigTime.getDescription());
    }
    @Test
    void Tag0042Test() {
        Tag42OrigTime tag42OrigTime;
//        assertEquals( "20220131", tag42OrigTime.getDataValue());
//        assertNotEquals( "A11", tag42OrigTime.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0042Test()");
    }
}