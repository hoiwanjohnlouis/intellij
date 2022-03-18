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

class Tag41OrigClOrdIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0041Test() {
        FIXType fix41OrigClOrdID = FIXType.FIX41_ORIG_CL_ORD_ID;
        assertEquals( "ORIG_CL_ORD_ID", fix41OrigClOrdID.getName());
        assertEquals( 41, fix41OrigClOrdID.getNumber());
        assertEquals( "OrigClOrdID", fix41OrigClOrdID.getDescription());
        assertNotEquals( "ORIG_CL_ORD_ID ORIG_CL_ORD_ID", fix41OrigClOrdID.getName());
        assertNotEquals( 3123, fix41OrigClOrdID.getNumber());
        assertNotEquals( "OrigClOrdID OrigClOrdID", fix41OrigClOrdID.getDescription());
    }
    @Test
    void Tag0041Test() {
        Tag41OrigClOrdID tag41OrigClOrdID = new Tag41OrigClOrdID("ORD-12345");
        assertEquals( "ORD-12345", tag41OrigClOrdID.getDataValue());
        assertNotEquals( "120391", tag41OrigClOrdID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0041Test()");
    }
}