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

class Tag9BodyLengthTest {
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
    void FIX0009Test() {
        FIXType fix9BodyLength = FIXType.BODY_LENGTH;
        assertEquals( fix9BodyLength.getFIXName(), "BODY_LENGTH");
        assertEquals( fix9BodyLength.getFIXNumber(), 9);
        assertEquals( fix9BodyLength.getFIXDescription(), "BodyLength");
        assertNotEquals( fix9BodyLength.getFIXName(), "Not My BODY_LENGTH");
        assertNotEquals( fix9BodyLength.getFIXNumber(), 163223);
        assertNotEquals( fix9BodyLength.getFIXDescription(), "123 BodyLength");
        logger.info(WHERE_AM_I + ":Successful FIX0009Test()");
    }
    @Test
    void Tag0009Test() {
        TagType tag9BodyLength = new TagType(FIXType.BODY_LENGTH,"120");
        assertEquals( tag9BodyLength.getDataValue(), "120");
        assertNotEquals( tag9BodyLength.getDataValue(), "6789");
        logger.info(WHERE_AM_I + ":Successful Tag0009Test()");
    }
}