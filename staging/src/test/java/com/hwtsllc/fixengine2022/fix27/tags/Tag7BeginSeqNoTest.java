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

class Tag7BeginSeqNoTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0007Test() {
        FIXType fix7BeginSeqNo = FIXType.FIX7_BEGIN_SEQ_NO;
        assertEquals( "BEGIN_SEQ_NO", fix7BeginSeqNo.getName());
        assertEquals( 7, fix7BeginSeqNo.getNumber());
        assertEquals( "BeginSeqNo", fix7BeginSeqNo.getDescription());
        assertNotEquals( "BEGIN;SEQ_NO", fix7BeginSeqNo.getName());
        assertNotEquals( 77, fix7BeginSeqNo.getNumber());
        assertNotEquals( "Begin Seq No", fix7BeginSeqNo.getDescription());
    }
    @Test
    void Tag0007Test() {
        Tag7BeginSeqNo tag7BeginSeqNo = new Tag7BeginSeqNo("12345");
        assertEquals( "12345", tag7BeginSeqNo.getDataValue());
        assertNotEquals( "6789", tag7BeginSeqNo.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0007Test()");
    }
}