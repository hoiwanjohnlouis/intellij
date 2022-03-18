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

class Tag25IOIQltyIndTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0025Test() {
        FIXType fix25IOIQltyInd = FIXType.FIX25_IOI_QLTY_IND;
        assertEquals( "IOI_QLTY_IND", fix25IOIQltyInd.getName());
        assertEquals( 25, fix25IOIQltyInd.getNumber());
        assertEquals( "IOIQltyInd", fix25IOIQltyInd.getDescription());
        assertNotEquals( "IOI_QLTY_IND IOI_QLTY_IND", fix25IOIQltyInd.getName());
        assertNotEquals( 2525, fix25IOIQltyInd.getNumber());
        assertNotEquals( "123 IOIQltyInd", fix25IOIQltyInd.getDescription());
    }
    @Test
    void Tag0025Test() {
        Tag25IOIQltyInd tag25IOIQltyInd;
        // = new Tag25IOIQltyInd();
//        assertEquals( "A", tag25IOIQltyInd.getDataValue());
//        assertNotEquals( "11", tag25IOIQltyInd.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0025Test()");
    }
}