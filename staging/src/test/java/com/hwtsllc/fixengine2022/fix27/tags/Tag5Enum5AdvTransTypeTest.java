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

import com.hwtsllc.fixengine2022.fix27.enums.Enum5AdvTransType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag5Enum5AdvTransTypeTest {
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
    void FIX0005Test() {
        FIXType fix5AdvTransType = FIXType.FIX5_ADV_TRANS_TYPE;
        assertEquals( "ADV_TRANS_TYPE", fix5AdvTransType.getName());
        assertEquals( 5, fix5AdvTransType.getNumber());
        assertEquals( "Enum5AdvTransType", fix5AdvTransType.getDescription());
        assertNotEquals( "ADV-TRANS-TYPE", fix5AdvTransType.getName());
        assertNotEquals( 55, fix5AdvTransType.getNumber());
        assertNotEquals( "Adv Trans Type", fix5AdvTransType.getDescription());
    }
    @Test
    void Tag0005Test() {
        Tag5AdvTransType tag5AdvTransType = new Tag5AdvTransType(Enum5AdvTransType.NEW);
        assertEquals( "N", tag5AdvTransType.getDataValue());
        assertNotEquals( "abcdefghij", tag5AdvTransType.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0005Test()");
    }
}