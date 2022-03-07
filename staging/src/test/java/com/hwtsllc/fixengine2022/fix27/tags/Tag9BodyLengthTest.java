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
import com.hwtsllc.fixengine2022.fix27.tags.Tag9BodyLength;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag9BodyLengthTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0009Test() {
        FIXType fix9BodyLength = FIXType.FIX9_BODY_LENGTH;
        assertEquals( "BODY_LENGTH", fix9BodyLength.getFIXName());
        assertEquals( 9, fix9BodyLength.getFIXNumber());
        assertEquals( "BodyLength", fix9BodyLength.getFIXDescription());
        assertNotEquals( "BODY_ LENGTH", fix9BodyLength.getFIXName());
        assertNotEquals( 99, fix9BodyLength.getFIXNumber());
        assertNotEquals( "Body Length", fix9BodyLength.getFIXDescription());
    }
    @Test
    void Tag0009Test() {
        Tag9BodyLength tag9BodyLength = new Tag9BodyLength("120");
        assertEquals( "120", tag9BodyLength.getDataValue());
        assertNotEquals( "6789", tag9BodyLength.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0009Test()");
    }
}