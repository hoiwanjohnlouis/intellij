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

class Tag3AdvRefIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag3AdvRefID.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0003Test() {
        FIXType fix3AdvRefID = FIXType.ADV_REF_ID;
        assertEquals( fix3AdvRefID.getFIXName(), "ADV_REF_ID");
        assertEquals( fix3AdvRefID.getFIXNumber(), 3);
        assertEquals( fix3AdvRefID.getFIXDescription(), "AdvRefId");
        assertNotEquals( fix3AdvRefID.getFIXName(), "Not My ADV_REF_ID");
        assertNotEquals( fix3AdvRefID.getFIXNumber(), 1623);
        assertNotEquals( fix3AdvRefID.getFIXDescription(), "123 AdvRefId");
        logger.info(WHERE_AM_I + ":Successful FIX0003Test()");
    }
    @Test
    void Tag0003Test() {
        TagType tag3AdvRefID = new TagType(FIXType.ADV_REF_ID,"ABC987654321XYZ");
        assertEquals( tag3AdvRefID.getDataValue(), "ABC987654321XYZ");
        assertNotEquals( tag3AdvRefID.getDataValue(), "abcdefghij");
        logger.info(WHERE_AM_I + ":Successful Tag0003Test()");
    }
}