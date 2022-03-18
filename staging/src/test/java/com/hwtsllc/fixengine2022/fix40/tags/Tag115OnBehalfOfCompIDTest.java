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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag115OnBehalfOfCompIDTest {
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
    void Test() {
        assertEquals(1,1);
        assertNotEquals(2,1);
    }
    @Test
    void FIX0115Test() {
        FIXType fix115OnBehalfOfCompID = FIXType.FIX115_ON_BEHALF_OF_COMP_ID;
        assertEquals( fix115OnBehalfOfCompID.getName(), "ON_BEHALF_OF_COMP_ID");
        assertEquals( fix115OnBehalfOfCompID.getNumber(), 115);
        assertEquals( fix115OnBehalfOfCompID.getDescription(), "OnBehalfOfCompID");
    }
    @Test
    void Tag0115Test() {
        FIXType tag115OnBehalfOfCompID = FIXType.FIX115_ON_BEHALF_OF_COMP_ID;
        assertEquals( tag115OnBehalfOfCompID.getName(), "ON_BEHALF_OF_COMP_ID");
        assertEquals( tag115OnBehalfOfCompID.getNumber(), 115);
        assertEquals( tag115OnBehalfOfCompID.getDescription(), "OnBehalfOfCompID");
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
}