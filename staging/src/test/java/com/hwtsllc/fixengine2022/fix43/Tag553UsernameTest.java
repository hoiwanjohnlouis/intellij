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

package com.hwtsllc.fixengine2022.fix43;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Tag553UsernameTest {
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
        System.out.println("Starting Tag553UsernameTest()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Completed Tag553UsernameTest()");
    }

    @Test
    void FIX0553Test() {
        FIXType fix553Username = FIXType.FIX553_USERNAME;
        assertEquals( "FIX553_USERNAME", fix553Username.getFIXTypeName());
        assertEquals( 553, fix553Username.getFIXNumber());
        assertEquals( "USERNAME", fix553Username.getFIXName());
        assertEquals( "Username", fix553Username.getFIXDescription());
        assertNotEquals( "Not My FIX553_USERNAME", fix553Username.getFIXTypeName());
        assertNotEquals( 9999, fix553Username.getFIXNumber());
        assertNotEquals( "Not My USERNAME", fix553Username.getFIXName());
        assertNotEquals( "Not My Username", fix553Username.getFIXDescription());
    }
    @Test
    void Tag0553Test() {
        Tag553Username tag553Username = new Tag553Username("JohnWick");
        assertEquals( "JohnWick", tag553Username.getDataValue());
        assertNotEquals( "goodbye JohnWick", tag553Username.getDataValue());
    }

}