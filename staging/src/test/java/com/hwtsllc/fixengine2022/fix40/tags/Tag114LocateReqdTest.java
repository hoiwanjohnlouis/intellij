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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag114LocateReqdTest {
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
    }
    @Test
    void FIX0114Test() {
        FIXType fix114LocateReqd = FIXType.FIX114_LOCATE_REQD;
        assertEquals( fix114LocateReqd.getName(), "LOCATE_REQD");
        assertEquals( fix114LocateReqd.getNumber(), 114);
        assertEquals( fix114LocateReqd.getDescription(), "LocateReqd");
    }
    @Test
    void Tag0114Test() {
        FIXType tag114LocateReqd = FIXType.FIX114_LOCATE_REQD;
        assertEquals( tag114LocateReqd.getName(), "LOCATE_REQD");
        assertEquals( tag114LocateReqd.getNumber(), 114);
        assertEquals( tag114LocateReqd.getDescription(), "LocateReqd");
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
}