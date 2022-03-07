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
import com.hwtsllc.fixengine2022.fix27.tags.Tag22SecurityIDSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag22SecurityIDSourceTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0022Test() {
        FIXType fix22IDSource = FIXType.FIX22_SECURITY_ID_SOURCE;
        assertEquals( "SECURITY_ID_SOURCE", fix22IDSource.getFIXName());
        assertEquals( 22, fix22IDSource.getFIXNumber());
        assertEquals( "SecurityIDSource", fix22IDSource.getFIXDescription());
        assertNotEquals( "SECURITY_ID_SOURCE SECURITY_ID_SOURCE", fix22IDSource.getFIXName());
        assertNotEquals( 2222, fix22IDSource.getFIXNumber());
        assertNotEquals( "SecurityIDSource SecurityIDSource", fix22IDSource.getFIXDescription());
    }
    @Test
    void Tag0022Test() {
        Tag22SecurityIDSource tag22SecurityIDSource;
        //= new Tag22SecurityIDSource(FIXType.FIX22_SECURITY_ID_SOURCE,"A");
//        assertEquals( "A", tag22SecurityIDSource.getDataValue());
//        assertNotEquals( "11", tag22SecurityIDSource.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0022Test()");
    }
}