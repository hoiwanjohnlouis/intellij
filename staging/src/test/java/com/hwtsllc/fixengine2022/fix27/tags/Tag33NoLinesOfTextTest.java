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

class Tag33NoLinesOfTextTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0033Test() {
        FIXType fix33LinesOfText = FIXType.FIX33_NO_LINES_OF_TEXT;
        assertEquals( "NO_LINES_OF_TEXT", fix33LinesOfText.getName());
        assertEquals( "33", fix33LinesOfText.getID());
        assertEquals( "NoLinesOfText", fix33LinesOfText.getDescription());
        assertNotEquals( "NO_LINES_OF_TEXT NO_LINES_OF_TEXT", fix33LinesOfText.getName());
        assertNotEquals( "3172", fix33LinesOfText.getID());
        assertNotEquals( "NoLinesOfText NoLinesOfText", fix33LinesOfText.getDescription());
    }
    @Test
    void Tag0033Test() {
        Tag33NoLinesOfText tag33LinesOfText = new Tag33NoLinesOfText("1");
        assertEquals( "1", tag33LinesOfText.getDataValue());
        assertNotEquals( "11", tag33LinesOfText.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0033Test()");
    }
}