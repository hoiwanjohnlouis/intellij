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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class  Tag1AccountTest {
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
    void FIX0001Test() {
        FIXType fix1Account = FIXType.ACCOUNT;
        assertEquals( "ACCOUNT", fix1Account.getFIXName());
        assertEquals( 1, fix1Account.getFIXNumber());
        assertEquals( "Account", fix1Account.getFIXDescription());
        assertNotEquals( "Not My ACCOUNT", fix1Account.getFIXName());
        assertNotEquals( 11, fix1Account.getFIXNumber());
        assertNotEquals( "123 Account", fix1Account.getFIXDescription());
    }
    @Test
    void Tag0001Test() {
        TagType tag1Account = new TagType(FIXType.ACCOUNT,"ABC987654321XYZ");
        assertEquals( "ABC987654321XYZ", tag1Account.getDataValue());
        assertNotEquals( "abcdefghij", tag1Account.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0001Test()");
    }
}