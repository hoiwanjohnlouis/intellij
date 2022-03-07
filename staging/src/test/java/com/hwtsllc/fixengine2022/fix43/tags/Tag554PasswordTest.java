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
import com.hwtsllc.fixengine2022.fix43.tags.Tag554Password;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

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
        System.out.println("Starting Tag554PasswordTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Tag554PasswordTest()");
    }

    @Test
    void FIX0554Test() {
        FIXType fix554Password = FIXType.FIX554_PASSWORD;
        assertEquals( "FIX554_PASSWORD", fix554Password.getFIXTypeName());
        assertEquals( 554, fix554Password.getFIXNumber());
        assertEquals( "PASSWORD", fix554Password.getFIXName());
        assertEquals( "Password", fix554Password.getFIXDescription());
        assertNotEquals( "Not My FIX554_PASSWORD", fix554Password.getFIXTypeName());
        assertNotEquals( 9999, fix554Password.getFIXNumber());
        assertNotEquals( "Not My PASSWORD", fix554Password.getFIXName());
        assertNotEquals( "Not My Password", fix554Password.getFIXDescription());
    }
    @Test
    void Tag0554Test() {
        Tag554Password tag554Password = new Tag554Password("JohnWick");
        assertEquals( "JohnWick", tag554Password.getDataValue());
        assertNotEquals( "goodbye JohnWick", tag554Password.getDataValue());
    }
}