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

@Deprecated
class Tag24IOIOthSvcTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0024Test() {
        FIXType fix24IOIOthSvc = FIXType.FIX24_IOI_OTH_SVC;
        assertEquals( "IOI_OTH_SVC", fix24IOIOthSvc.getFIXName());
        assertEquals( 24, fix24IOIOthSvc.getFIXNumber());
        assertEquals( "IOIOthSvc (no longer used)", fix24IOIOthSvc.getFIXDescription());
        assertNotEquals( "IOI_OTH_SVC IOI_OTH_SVC", fix24IOIOthSvc.getFIXName());
        assertNotEquals( 2424, fix24IOIOthSvc.getFIXNumber());
        assertNotEquals( "123 IOIOthSvc (no longer used)", fix24IOIOthSvc.getFIXDescription());
    }
    @Test
    void Tag0024Test() {
        TagType tag24IOIOthSvc = new TagType(FIXType.FIX24_IOI_OTH_SVC,"A");
        assertEquals( "A", tag24IOIOthSvc.getDataValue());
        assertNotEquals( "11", tag24IOIOthSvc.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0024Test()");
    }
}