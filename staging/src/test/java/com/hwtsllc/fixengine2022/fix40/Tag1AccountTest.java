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
    void TestTag1() {
        Tag1Account tag1Account = new Tag1Account("1234567890");
        assertEquals( tag1Account.getDataValue(), "1234567890");
        assertNotEquals( tag1Account.getDataValue(), "abcdefghij");
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
    @Test
    void FIX0001Test() {
        FIXType fix1Account = FIXType.ACCOUNT;
        assertEquals( fix1Account.getFIXName(), "ACCOUNT");
        assertEquals( fix1Account.getFIXNumber(), 1);
        assertEquals( fix1Account.getFIXDescription(), "Account");
        assertNotEquals( fix1Account.getFIXName(), "Not My ACCOUNT");
        assertNotEquals( fix1Account.getFIXNumber(), 2);
        assertNotEquals( fix1Account.getFIXDescription(), "123 Account");
    }
    @Test
    void Tag0001Test() {
        TagType tag1Account = new TagType(FIXType.ACCOUNT,"ABC987654321XYZ");
        assertEquals( tag1Account.getFIXName(), "ACCOUNT");
        assertEquals( tag1Account.getFIXNumber(), 1);
        assertEquals( tag1Account.getFIXDescription(), "Account");
        assertNotEquals( tag1Account.getFIXName(), "Not My ACCOUNT");
        assertNotEquals( tag1Account.getFIXNumber(), 2);
        assertNotEquals( tag1Account.getFIXDescription(), "123 Account");
        logger.info(WHERE_AM_I + ":Successful Tag0001Test()");
    }


}