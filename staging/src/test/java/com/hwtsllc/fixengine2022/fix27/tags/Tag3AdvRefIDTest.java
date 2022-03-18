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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Tag3AdvRefIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0003Test() {
        FIXType fix3AdvRefID = FIXType.FIX3_ADV_REF_ID;
        assertEquals( "FIX3_ADV_REF_ID", fix3AdvRefID.getEnumName());
        assertEquals( "3", fix3AdvRefID.getID());
        assertEquals( "ADV_REF_ID", fix3AdvRefID.getName());
        assertEquals( "AdvRefId", fix3AdvRefID.getDescription());
        assertNotEquals( "Not My FIX3_ADV_REF_ID", fix3AdvRefID.getEnumName());
        assertNotEquals( "9999", fix3AdvRefID.getID());
        assertNotEquals( "Not My ADV_REF_ID", fix3AdvRefID.getName());
        assertNotEquals( "Not My AdvRefId", fix3AdvRefID.getDescription());
    }
    @Test
    void Tag0003Test() {
        Tag3AdvRefID tag3AdvRefID = new Tag3AdvRefID("hello from main routine");
        assertEquals( "hello from main routine", tag3AdvRefID.getDataValue());
        assertNotEquals( "goodbye from main routine", tag3AdvRefID.getDataValue());
    }
}