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
        assertEquals( "ADV_ID", fix2AdvID.getFIXName());
        assertEquals( 2, fix2AdvID.getFIXNumber());
        assertEquals( "AdvId", fix2AdvID.getFIXDescription());
        assertNotEquals( "ADV ID", fix2AdvID.getFIXName());
        assertNotEquals( 22, fix2AdvID.getFIXNumber());
        assertNotEquals( "Adv Id", fix2AdvID.getFIXDescription());
    }
    @Test
    void Tag0002Test() {
        TagType tag2AdvID = new TagType(FIXType.ADV_ID,"ABC987654321XYZ");
        assertEquals( "ABC987654321XYZ", tag2AdvID.getDataValue());
        assertNotEquals( "abcdefghij", tag2AdvID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0002Test()");
    }
}