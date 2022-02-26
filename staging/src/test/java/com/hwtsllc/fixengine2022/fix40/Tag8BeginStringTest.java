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

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.TagType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag8BeginStringTest {
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
    void FIX0008Test() {
        FIXType fix8BeginString = FIXType.BEGIN_STRING;
        assertEquals( fix8BeginString.getFIXName(), "BEGIN_STRING");
        assertEquals( fix8BeginString.getFIXNumber(), 8);
        assertEquals( fix8BeginString.getFIXDescription(), "BeginString");
        assertNotEquals( fix8BeginString.getFIXName(), "Not My BEGIN_STRING");
        assertNotEquals( fix8BeginString.getFIXNumber(), 163223);
        assertNotEquals( fix8BeginString.getFIXDescription(), "123 BeginString");
        logger.info(WHERE_AM_I + ":Successful FIX0008Test()");
    }
    @Test
    void Tag0008Test() {
        TagType tag8BeginString = new TagType(FIXType.BEGIN_STRING,"FIX4.0");
        assertEquals( tag8BeginString.getDataValue(), "FIX4.0");
        assertNotEquals( tag8BeginString.getDataValue(), "67.89");
        logger.info(WHERE_AM_I + ":Successful Tag0008Test()");
    }
}