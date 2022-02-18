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

package com.hwtsllc.staging2022.fields40;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class Tag1AccountTest {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
        logger.info("@BeforeEach - executes before each test method in this class");
    }
    @AfterEach
    void tearDown() {
        logger.info("@AfterEach - executes after each test method in this class");
    }

    @Test
    void TestTag1() {
        Tag1Account tag1Account = new Tag1Account("1234567890");
        assertEquals( tag1Account.getTag1AccountValue(), "1234567890");
        assertNotEquals( tag1Account.getTag1AccountValue(), "1234567890");
    }


}