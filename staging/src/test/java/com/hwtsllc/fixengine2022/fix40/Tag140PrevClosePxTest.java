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

class Tag140PrevClosePxTest {
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
    void Test() {
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
    @Test
    void FIX0140Test() {
        FIXType fix140PrevClosePx = FIXType.PREV_CLOSE_PX;
        assertEquals( fix140PrevClosePx.getFIXName(), "PREV_CLOSE_PX");
        assertEquals( fix140PrevClosePx.getFIXNumber(), 140);
        assertEquals( fix140PrevClosePx.getFIXDescription(), "PrevClosePx");
    }
    @Test
    void Tag0140Test() {
        TagType tag140PrevClosePx = new TagType(FIXType.PREV_CLOSE_PX,"10.23");
        assertEquals( tag140PrevClosePx.getFIXName(), "PREV_CLOSE_PX");
        assertEquals( tag140PrevClosePx.getFIXNumber(), 140);
        assertEquals( tag140PrevClosePx.getFIXDescription(), "PrevClosePx");
    }
}