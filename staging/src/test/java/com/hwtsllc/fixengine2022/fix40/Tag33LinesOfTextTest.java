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

class Tag33LinesOfTextTest {
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
    void FIX0033Test() {
        FIXType fix33LinesOfText = FIXType.LINES_OF_TEXT;
        assertEquals( "LINES_OF_TEXT", fix33LinesOfText.getFIXName());
        assertEquals( 33, fix33LinesOfText.getFIXNumber());
        assertEquals( "LinesOfText", fix33LinesOfText.getFIXDescription());
        assertNotEquals( "LINES_OF_TEXT LINES_OF_TEXT", fix33LinesOfText.getFIXName());
        assertNotEquals( 312, fix33LinesOfText.getFIXNumber());
        assertNotEquals( "LinesOfText LinesOfText", fix33LinesOfText.getFIXDescription());
    }
    @Test
    void Tag0033Test() {
        TagType tag33LinesOfText = new TagType(FIXType.LINES_OF_TEXT,"0");
        assertEquals( "0", tag33LinesOfText.getDataValue());
        assertNotEquals( "11", tag33LinesOfText.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0033Test()");
    }
}