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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag42OrigTimeTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0042Test() {
        FIXType fixData = FIXType.FIX42_ORIG_TIME;
        assertEquals( "ORIG_TIME", fixData.getName());
        assertEquals( "42", fixData.getID());
        assertEquals( "OrigTime", fixData.getDescription());
        assertNotEquals( "JunkName", fixData.getName());
        assertNotEquals( "JunkID", fixData.getID());
        assertNotEquals( "JunkDescription", fixData.getDescription());
    }
    @Test
    void Tag0042Test() {
        Tag42OrigTime tagData;

        tagData = new Tag42OrigTime("20220131");
        assertEquals( "20220131", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0042Test()");
    }
}