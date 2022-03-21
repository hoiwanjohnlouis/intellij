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
import com.hwtsllc.fixengine2022.fix27.enums.Enum94EmailType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag94EmailTypeTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0094Test() {
        FIXType fixData = FIXType.FIX94_EMAIL_TYPE;
        assertEquals( "EMAIL_TYPE", fixData.getName());
        assertEquals( "94", fixData.getID());
        assertEquals( "EmailType", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0094Test() {
        Tag94EmailType tagData;

        /*
         * 0-2 email types
         */
        tagData = new Tag94EmailType(Enum94EmailType.NEW);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag94EmailType(Enum94EmailType.REPLY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag94EmailType(Enum94EmailType.ADMIN_REPLY);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0094Test()");
    }
}