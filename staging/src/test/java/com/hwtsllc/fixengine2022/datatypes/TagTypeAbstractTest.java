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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.TagMine;
import com.hwtsllc.fixengine2022.fix40.Tag58Text;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagTypeAbstractTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0058Test() {
        FIXType fix58Text = FIXType.FIX58_TEXT;
        assertEquals( "FIX58_TEXT", fix58Text.getFIXTypeName());
        assertEquals( 58, fix58Text.getFIXNumber());
        assertEquals( "TEXT", fix58Text.getFIXName());
        assertEquals( "Text", fix58Text.getFIXDescription());
        assertNotEquals( "FIX58_TEXT FIX58_TEXT", fix58Text.getFIXTypeName());
        assertNotEquals( 100, fix58Text.getFIXNumber());
        assertNotEquals( "TEXT TEXT", fix58Text.getFIXName());
        assertNotEquals( "123 TEXT", fix58Text.getFIXDescription());
    }
    @Test
    void Tag0058Test() {
        Tag58Text tag58Text = new Tag58Text("hello from main routine");
        assertEquals( "FIX58_TEXT", tag58Text.getFIXTypeName());
        assertEquals( 58, tag58Text.getFIXNumber());
        assertEquals( "TEXT", tag58Text.getFIXName());
        assertEquals( "Text", tag58Text.getFIXDescription());
        assertEquals( "hello from main routine", tag58Text.getDataValue());
        assertNotEquals( "FIX58_TEXT FIX58_TEXT", tag58Text.getFIXTypeName());
        assertNotEquals( 100, tag58Text.getFIXNumber());
        assertNotEquals( "TEXT TEXT", tag58Text.getFIXName());
        assertNotEquals( "123 TEXT", tag58Text.getFIXDescription());
        assertNotEquals( "goodbye from main routine", tag58Text.getDataValue());
    }
}