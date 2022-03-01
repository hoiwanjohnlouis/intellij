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

import com.hwtsllc.fixengine2022.datatypes.TagType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag10CheckSumTest {
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
    void FIX0010Test() {
        FIXType fix10CheckSum = FIXType.CHECK_SUM;
        assertEquals( "CHECK_SUM", fix10CheckSum.getFIXName());
        assertEquals( 10, fix10CheckSum.getFIXNumber());
        assertEquals( "CheckSum", fix10CheckSum.getFIXDescription());
        assertNotEquals( "CHECK_SUM CHECK_SUM", fix10CheckSum.getFIXName());
        assertNotEquals( 100, fix10CheckSum.getFIXNumber());
        assertNotEquals( "123 CheckSum", fix10CheckSum.getFIXDescription());
    }
    @Test
    void Tag0010Test() {
        TagType tag10CheckSum = new TagType(FIXType.CHECK_SUM,"ABCD");
        assertEquals( "ABCD", tag10CheckSum.getDataValue());
        assertNotEquals( "abcd", tag10CheckSum.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0010Test()");
    }
}