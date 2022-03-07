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
import com.hwtsllc.fixengine2022.fix27.tags.Tag12Commission;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag12CommissionTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0012Test() {
        FIXType fix12Commission = FIXType.FIX12_COMMISSION;
        assertEquals( "COMMISSION", fix12Commission.getFIXName());
        assertEquals( 12, fix12Commission.getFIXNumber());
        assertEquals( "Commission", fix12Commission.getFIXDescription());
        assertNotEquals( "Not My COMMISSION", fix12Commission.getFIXName());
        assertNotEquals( 163223, fix12Commission.getFIXNumber());
        assertNotEquals( "123 Commission", fix12Commission.getFIXDescription());
    }
    @Test
    void Tag0012Test() {
        Tag12Commission tag12Commission = new Tag12Commission("10");
        assertEquals( "10", tag12Commission.getDataValue());
        assertNotEquals( "11", tag12Commission.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0012Test()");
    }
}