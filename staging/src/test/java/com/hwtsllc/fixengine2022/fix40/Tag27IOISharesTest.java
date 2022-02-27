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

class Tag27IOISharesTest {
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
    void FIX0027Test() {
        FIXType fix27IOIShares = FIXType.IOI_SHARES;
        assertEquals( "IOI_SHARES", fix27IOIShares.getFIXName());
        assertEquals( 27, fix27IOIShares.getFIXNumber());
        assertEquals( "IOIShares", fix27IOIShares.getFIXDescription());
        assertNotEquals( "IOI_SHARES IOI_SHARES", fix27IOIShares.getFIXName());
        assertNotEquals( 2020, fix27IOIShares.getFIXNumber());
        assertNotEquals( "123 IOIShares", fix27IOIShares.getFIXDescription());
    }
    @Test
    void Tag0027Test() {
        TagType tag27IOIShares = new TagType(FIXType.IOI_SHARES,"1234");
        assertEquals( "1234", tag27IOIShares.getDataValue());
        assertNotEquals( "11", tag27IOIShares.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0027Test()");
    }
}