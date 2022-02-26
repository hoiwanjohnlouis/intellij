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

class Tag2AdvIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag2AdvID.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0002Test() {
        FIXType fix2AdvID = FIXType.ADV_ID;
        assertEquals( fix2AdvID.getFIXName(), "ADV_ID");
        assertEquals( fix2AdvID.getFIXNumber(), 2);
        assertEquals( fix2AdvID.getFIXDescription(), "AdvId");
        assertNotEquals( fix2AdvID.getFIXName(), "Not My ADV_ID");
        assertNotEquals( fix2AdvID.getFIXNumber(), 1623);
        assertNotEquals( fix2AdvID.getFIXDescription(), "123 AdvID");
        logger.info(WHERE_AM_I + ":Successful FIX0002Test()");
    }
    @Test
    void Tag0002Test() {
        TagType tag2AdvID = new TagType(FIXType.ADV_ID,"ABC987654321XYZ");
        assertEquals( tag2AdvID.getDataValue(), "ABC987654321XYZ");
        assertNotEquals( tag2AdvID.getDataValue(), "abcdefghij");
        logger.info(WHERE_AM_I + ":Successful Tag0002Test()");
    }
}