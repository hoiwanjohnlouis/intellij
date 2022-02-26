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

class Tag7BeginSeqNoTest {
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
    void FIX0007Test() {
        FIXType fix7BeginSeqNo = FIXType.BEGIN_SEQ_NO;
        assertEquals( fix7BeginSeqNo.getFIXName(), "BEGIN_SEQ_NO");
        assertEquals( fix7BeginSeqNo.getFIXNumber(), 7);
        assertEquals( fix7BeginSeqNo.getFIXDescription(), "BeginSeqNo");
        assertNotEquals( fix7BeginSeqNo.getFIXName(), "Not My BEGIN_SEQ_NO");
        assertNotEquals( fix7BeginSeqNo.getFIXNumber(), 163223);
        assertNotEquals( fix7BeginSeqNo.getFIXDescription(), "123 BeginSeqNo");
        logger.info(WHERE_AM_I + ":Successful FIX0007Test()");
    }
    @Test
    void Tag0007Test() {
        TagType tag7BeginSeqNo = new TagType(FIXType.BEGIN_SEQ_NO,"12345");
        assertEquals( tag7BeginSeqNo.getDataValue(), "12345");
        assertNotEquals( tag7BeginSeqNo.getDataValue(), "6789");
        logger.info(WHERE_AM_I + ":Successful Tag0007Test()");
    }
}