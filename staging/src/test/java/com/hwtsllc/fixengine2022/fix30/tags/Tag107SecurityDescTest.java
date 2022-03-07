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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix30.tags.Tag107SecurityDesc;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag107SecurityDescTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

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
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
    @Test
    void FIX0107Test() {
        FIXType fix107SecurityDesc = FIXType.FIX107_SECURITY_DESC;
        assertEquals( fix107SecurityDesc.getFIXName(), "SECURITY_DESC");
        assertEquals( fix107SecurityDesc.getFIXNumber(), 107);
        assertEquals( fix107SecurityDesc.getFIXDescription(), "SecurityDesc");
    }
    @Test
    void Tag0107Test() {
        Tag107SecurityDesc tag107SecurityDesc = new Tag107SecurityDesc("International Widgets, Inc.");
        assertEquals( tag107SecurityDesc.getFIXName(), "SECURITY_DESC");
        assertEquals( tag107SecurityDesc.getFIXNumber(), 107);
        assertEquals( tag107SecurityDesc.getFIXDescription(), "SecurityDesc");
    }
}