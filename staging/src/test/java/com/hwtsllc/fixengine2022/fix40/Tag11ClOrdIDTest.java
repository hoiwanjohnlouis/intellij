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

class Tag11ClOrdIDTest {
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
    void FIX0011Test() {
        FIXType fix11ClOrdID = FIXType.CL_ORD_ID;
        assertEquals( "CL_ORD_ID", fix11ClOrdID.getFIXName());
        assertEquals( 11, fix11ClOrdID.getFIXNumber());
        assertEquals( "ClOrdID", fix11ClOrdID.getFIXDescription());
        assertNotEquals( "CL_ORD_ID CL_ORD_ID", fix11ClOrdID.getFIXName());
        assertNotEquals( 111, fix11ClOrdID.getFIXNumber());
        assertNotEquals( "123 ClOrdID", fix11ClOrdID.getFIXDescription());
    }
    @Test
    void Tag0011Test() {
        TagType tag11ClOrdID = new TagType(FIXType.CL_ORD_ID,"ABCD1234");
        assertEquals( "ABCD1234", tag11ClOrdID.getDataValue());
        assertNotEquals( "abcd", tag11ClOrdID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0011Test()");
    }
}