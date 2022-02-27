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

class Tag14CumQtyTest {
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
    void FIX0014Test() {
        FIXType fix14CumQty = FIXType.CUM_QTY;
        assertEquals( "CUM_QTY", fix14CumQty.getFIXName());
        assertEquals( 14, fix14CumQty.getFIXNumber());
        assertEquals( "CumQty", fix14CumQty.getFIXDescription());
        assertNotEquals( "CUM_QTY CUM_QTY", fix14CumQty.getFIXName());
        assertNotEquals( 1414, fix14CumQty.getFIXNumber());
        assertNotEquals( "123 CumQty", fix14CumQty.getFIXDescription());
    }
    @Test
    void Tag0014Test() {
        TagType tag14CumQty = new TagType(FIXType.COMM_TYPE,"100");
        assertEquals( "100", tag14CumQty.getDataValue());
        assertNotEquals( "11", tag14CumQty.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0014Test()");
    }
}