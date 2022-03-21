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
import com.hwtsllc.fixengine2022.fix27.enums.Enum81ProcessCode;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag81ProcessCodeTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0081Test() {
        FIXType fixData = FIXType.FIX81_PROCESS_CODE;
        assertEquals( "PROCESS_CODE", fixData.getName());
        assertEquals( "81", fixData.getID());
        assertEquals( "ProcessCode", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0081Test() {
        Tag81ProcessCode tagData;

        /*
         * 0-6 AllocRejCode types
         */
        tagData = new Tag81ProcessCode(Enum81ProcessCode.REGULAR);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.SOFT_DOLLAR);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.STEP_IN);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.STEP_OUT);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_IN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.SOFT_DOLLAR_STEP_OUT);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag81ProcessCode(Enum81ProcessCode.PLAN_SPONSOR);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0081Test()");
    }
}