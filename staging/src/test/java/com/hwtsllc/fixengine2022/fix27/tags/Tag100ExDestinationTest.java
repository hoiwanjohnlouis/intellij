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

class Tag100ExDestinationTest {
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
    void FIX0100Test() {
        FIXType fix100ExDestination = FIXType.FIX100_EX_DESTINATION;
        assertEquals( fix100ExDestination.getName(), "EX_DESTINATION");
        assertEquals( fix100ExDestination.getID(), "100");
        assertEquals( fix100ExDestination.getDescription(), "ExDestination");
        assertNotEquals( fix100ExDestination.getName(), "Not My EX_DESTINATION");
        assertNotEquals( fix100ExDestination.getID(), "2");
        assertNotEquals( fix100ExDestination.getDescription(), "123 Account");
    }
    @Test
    void Tag0100Test() {
        Tag100ExDestination tagData;
        logger.info(WHERE_AM_I + ":Successful Tag0100Test()");
    }
}