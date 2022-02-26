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

class Tag4AdvSideTest {
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
    void FIX0004Test() {
        FIXType fix4AdvSide = FIXType.ADV_SIDE;
        assertEquals( fix4AdvSide.getFIXName(), "ADV_SIDE");
        assertEquals( fix4AdvSide.getFIXNumber(), 4);
        assertEquals( fix4AdvSide.getFIXDescription(), "AdvSide");
        assertNotEquals( fix4AdvSide.getFIXName(), "Not My ADV_SIDE");
        assertNotEquals( fix4AdvSide.getFIXNumber(), 163223);
        assertNotEquals( fix4AdvSide.getFIXDescription(), "123 AdvSide");
        logger.info(WHERE_AM_I + ":Successful FIX0004Test()");
    }
    @Test
    void Tag0004Test() {
        TagType tag4AdvSide = new TagType(FIXType.ADV_REF_ID,"ABC987654321XYZ");
        assertEquals( tag4AdvSide.getDataValue(), "ABC987654321XYZ");
        assertNotEquals( tag4AdvSide.getDataValue(), "abcdefghij");
        logger.info(WHERE_AM_I + ":Successful Tag0004Test()");
    }
}