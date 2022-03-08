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
import com.hwtsllc.fixengine2022.fix27.tags.Tag32LastQty;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag32LastQtyTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0032Test() {
        FIXType fix32LastQty = FIXType.FIX32_LAST_QTY;
        assertEquals( "LAST_QTY", fix32LastQty.getFIXName());
        assertEquals( 32, fix32LastQty.getFIXNumber());
        assertEquals( "LastQty", fix32LastQty.getFIXDescription());
        assertNotEquals( "LAST_QTY LAST_QTY", fix32LastQty.getFIXName());
        assertNotEquals( 312, fix32LastQty.getFIXNumber());
        assertNotEquals( "LastQty LastQty", fix32LastQty.getFIXDescription());
    }
    @Test
    void Tag0032Test() {
        Tag32LastQty tag32LastQty = new Tag32LastQty(200);
//        assertEquals( "200", tag32LastQty.getDataValue());
//        assertNotEquals( "2222", tag32LastQty.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0032Test()");
    }
}