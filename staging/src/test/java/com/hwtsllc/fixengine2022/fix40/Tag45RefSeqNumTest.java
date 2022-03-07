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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag45RefSeqNumTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0045Test() {
        FIXType fix45RefSeqNum = FIXType.FIX45_REF_SEQ_NUM;
        assertEquals( "REF_SEQ_NUM", fix45RefSeqNum.getFIXName());
        assertEquals( 45, fix45RefSeqNum.getFIXNumber());
        assertEquals( "RefSeqNum", fix45RefSeqNum.getFIXDescription());
        assertNotEquals( "REF_SEQ_NUM REF_SEQ_NUM", fix45RefSeqNum.getFIXName());
        assertNotEquals( 3123, fix45RefSeqNum.getFIXNumber());
        assertNotEquals( "RefSeqNum RefSeqNum", fix45RefSeqNum.getFIXDescription());
    }
    @Test
    void Tag0045Test() {
        Tag45RefSeqNum tag45RefSeqNum = new Tag45RefSeqNum();
        assertEquals( "6789", tag45RefSeqNum.getDataValue());
        assertNotEquals( "11", tag45RefSeqNum.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0045Test()");
    }
}