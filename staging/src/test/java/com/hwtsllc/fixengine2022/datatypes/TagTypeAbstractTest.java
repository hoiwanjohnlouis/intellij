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

import com.hwtsllc.fixengine2022.fix27.tags.Tag58Text;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        assertEquals( "FIX58_TEXT", fix58Text.getEnumName());
        assertEquals( "58", fix58Text.getID());
        assertEquals( "TEXT", fix58Text.getName());
        assertEquals( "Text", fix58Text.getDescription());
        assertNotEquals( "FIX58_TEXT FIX58_TEXT", fix58Text.getEnumName());
        assertNotEquals( "100", fix58Text.getID());
        assertNotEquals( "TEXT TEXT", fix58Text.getName());
        assertNotEquals( "123 TEXT", fix58Text.getDescription());
    }
    @Test
    void Tag0058Test() {
        Tag58Text tagData = new Tag58Text("hello from main routine");
        assertEquals( "hello from main routine", tagData.getDataValue());
        logger.info("Successful Tag0058Test()");
    }
}