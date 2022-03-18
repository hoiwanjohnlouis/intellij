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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tag1000UnderlyingTimeUnitTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX1000Test() {
        FIXType fix1000UnderlyingTimeUnit = FIXType.FIX1000_UNDERLYING_TIME_UNIT;
        assertEquals( "UNDERLYING_TIME_UNIT", fix1000UnderlyingTimeUnit.getName());
        assertEquals( "1000", fix1000UnderlyingTimeUnit.getID());
        assertEquals( "UnderlyingTimeUnit", fix1000UnderlyingTimeUnit.getDescription());
    }
    @Test
    void Tag1000Test() {
        Tag1000UnderlyingTimeUnit tagData;
        logger.info("Successful Tag1000Test()");
    }
}