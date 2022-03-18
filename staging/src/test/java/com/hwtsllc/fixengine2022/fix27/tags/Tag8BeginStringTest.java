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

import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag8BeginStringTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0008Test() {
        FIXType fix8BeginString = FIXType.FIX8_BEGIN_STRING;
        assertEquals( "BEGIN_STRING", fix8BeginString.getName());
        assertEquals( "8", fix8BeginString.getID());
        assertEquals( "BeginString", fix8BeginString.getDescription());
        assertNotEquals( "BEGIN STRING", fix8BeginString.getName());
        assertNotEquals( "88", fix8BeginString.getID());
        assertNotEquals( "123 BeginString", fix8BeginString.getDescription());
    }
    @Test
    void Tag0008Test() {
        Tag8BeginString tag8BeginString = new Tag8BeginString(Enum8BeginString.BEGIN_STRING_4_2);
        assertEquals( "FIX.4.2", tag8BeginString.getDataValue());
        assertNotEquals( "FIX.4.22", tag8BeginString.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0008Test()");
    }
}