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

import com.hwtsllc.fixengine2022.datatypes.TagType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag40OrdTypeTest {
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
    void FIX0040Test() {
        FIXType fix40OrdType = FIXType.ORD_TYPE;
        assertEquals( "ORD_TYPE", fix40OrdType.getFIXName());
        assertEquals( 40, fix40OrdType.getFIXNumber());
        assertEquals( "OrdType", fix40OrdType.getFIXDescription());
        assertNotEquals( "ORD_TYPE ORD_TYPE", fix40OrdType.getFIXName());
        assertNotEquals( 3123, fix40OrdType.getFIXNumber());
        assertNotEquals( "OrdType OrdType", fix40OrdType.getFIXDescription());
    }
    @Test
    void Tag0040Test() {
        TagType tag40OrdType = new TagType(FIXType.ORD_TYPE,"N");
        assertEquals( "N", tag40OrdType.getDataValue());
        assertNotEquals( "A11", tag40OrdType.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0040Test()");
    }
}