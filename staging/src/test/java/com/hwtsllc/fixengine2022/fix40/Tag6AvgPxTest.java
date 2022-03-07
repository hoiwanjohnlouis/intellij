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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag6AvgPxTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0006Test() {
        FIXType fix6AvgPx = FIXType.FIX6_AVG_PX;
        assertEquals( "AVG_PX", fix6AvgPx.getFIXName());
        assertEquals( 6, fix6AvgPx.getFIXNumber());
        assertEquals( "AvgPx", fix6AvgPx.getFIXDescription());
        assertNotEquals( "AVG PX", fix6AvgPx.getFIXName());
        assertNotEquals( 6666, fix6AvgPx.getFIXNumber());
        assertNotEquals( "Avg Px", fix6AvgPx.getFIXDescription());
    }
    @Test
    void Tag0006Test() {
        Tag6AvgPx tag6AvgPx = new Tag6AvgPx("123.45");
        assertEquals( "123.45", tag6AvgPx.getDataValue());
        assertNotEquals( "67.89", tag6AvgPx.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0006Test()");
    }
}