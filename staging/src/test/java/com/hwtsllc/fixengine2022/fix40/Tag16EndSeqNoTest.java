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

class Tag16EndSeqNoTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0016Test() {
        FIXType fix16EndSeqNo = FIXType.FIX16_END_SEQ_NO;
        assertEquals( "END_SEQ_NO", fix16EndSeqNo.getFIXName());
        assertEquals( 16, fix16EndSeqNo.getFIXNumber());
        assertEquals( "EndSeqNo", fix16EndSeqNo.getFIXDescription());
        assertNotEquals( "END_SEQ_NO END_SEQ_NO", fix16EndSeqNo.getFIXName());
        assertNotEquals( 111, fix16EndSeqNo.getFIXNumber());
        assertNotEquals( "123 EndSeqNo", fix16EndSeqNo.getFIXDescription());
    }
    @Test
    void Tag0016Test() {
        Tag16EndSeqNo tag16EndSeqNo = new Tag16EndSeqNo("6789");
        assertEquals( "6789", tag16EndSeqNo.getDataValue());
        assertNotEquals( "11", tag16EndSeqNo.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0016Test()");
    }
}