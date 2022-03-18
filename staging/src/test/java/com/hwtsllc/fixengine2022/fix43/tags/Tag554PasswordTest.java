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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag554PasswordTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void FIX0554Test() {
        FIXType fix554Password = FIXType.FIX554_PASSWORD;
        assertEquals( "FIX554_PASSWORD", fix554Password.getEnumName());
        assertEquals( "554", fix554Password.getID());
        assertEquals( "PASSWORD", fix554Password.getName());
        assertEquals( "Password", fix554Password.getDescription());
        assertNotEquals( "Not My FIX554_PASSWORD", fix554Password.getEnumName());
        assertNotEquals( "9999", fix554Password.getID());
        assertNotEquals( "Not My PASSWORD", fix554Password.getName());
        assertNotEquals( "Not My Password", fix554Password.getDescription());
    }
    @Test
    void Tag0554Test() {
        Tag554Password tagData = new Tag554Password("JohnWick");
        assertEquals( "JohnWick", tagData.getDataValue());
        assertNotEquals( "goodbye JohnWick", tagData.getDataValue());
        logger.info("Successful Tag0554Test()");
    }
}