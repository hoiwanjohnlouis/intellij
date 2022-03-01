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

class Tag41OrigClOrdIDTest {
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
    void FIX0041Test() {
        FIXType fix41OrigClOrdID = FIXType.ORIG_CL_ORD_ID;
        assertEquals( "ORIG_CL_ORD_ID", fix41OrigClOrdID.getFIXName());
        assertEquals( 41, fix41OrigClOrdID.getFIXNumber());
        assertEquals( "OrigClOrdID", fix41OrigClOrdID.getFIXDescription());
        assertNotEquals( "ORIG_CL_ORD_ID ORIG_CL_ORD_ID", fix41OrigClOrdID.getFIXName());
        assertNotEquals( 3123, fix41OrigClOrdID.getFIXNumber());
        assertNotEquals( "OrigClOrdID OrigClOrdID", fix41OrigClOrdID.getFIXDescription());
    }
    @Test
    void Tag0041Test() {
        TagType tag41OrigClOrdID = new TagType(FIXType.ORIG_CL_ORD_ID,"12345");
        assertEquals( "12345", tag41OrigClOrdID.getDataValue());
        assertNotEquals( "11", tag41OrigClOrdID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0041Test()");
    }
}