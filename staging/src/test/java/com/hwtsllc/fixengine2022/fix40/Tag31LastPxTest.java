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

class Tag31LastPxTest {
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
    void FIX0031Test() {
        FIXType fix31LastPx = FIXType.FIX31_LAST_PX;
        assertEquals( "LAST_PX", fix31LastPx.getFIXName());
        assertEquals( 31, fix31LastPx.getFIXNumber());
        assertEquals( "LastPx", fix31LastPx.getFIXDescription());
        assertNotEquals( "LAST_PX LAST_PX", fix31LastPx.getFIXName());
        assertNotEquals( 312, fix31LastPx.getFIXNumber());
        assertNotEquals( "LastPx LastPx", fix31LastPx.getFIXDescription());
    }
    @Test
    void Tag0031Test() {
        TagType tag31LastPx = new TagType(FIXType.FIX31_LAST_PX,"98.23");
        assertEquals( "98.23", tag31LastPx.getDataValue());
        assertNotEquals( "91", tag31LastPx.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0031Test()");
    }
}