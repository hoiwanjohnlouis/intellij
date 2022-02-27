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
        assertEquals( "ADV_REF_ID", fix3AdvRefID.getFIXName());
        assertEquals( 3, fix3AdvRefID.getFIXNumber());
        assertEquals( "AdvRefId", fix3AdvRefID.getFIXDescription());
        assertNotEquals( "ADV REF_ID", fix3AdvRefID.getFIXName());
        assertNotEquals( 33, fix3AdvRefID.getFIXNumber());
        assertNotEquals( "Adv Ref Id", fix3AdvRefID.getFIXDescription());
    }
    @Test
    void Tag0003Test() {
        TagType tag3AdvRefID = new TagType(FIXType.ADV_REF_ID,"ABC987654321XYZ");
        assertEquals( "ABC987654321XYZ", tag3AdvRefID.getDataValue());
        assertNotEquals( "abcdefghij", tag3AdvRefID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0003Test()");
    }
}