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
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag23IOIIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0023Test() {
        FIXType fix23IOIID = FIXType.FIX23_IOI_ID;
        assertEquals( "IOI_ID", fix23IOIID.getName());
        assertEquals( "23", fix23IOIID.getID());
        assertEquals( "IOIid", fix23IOIID.getDescription());
        assertNotEquals( "IOI_ID IOI_ID", fix23IOIID.getName());
        assertNotEquals( "2323", fix23IOIID.getID());
        assertNotEquals( "123 IOIid", fix23IOIID.getDescription());
    }
    @Test
    void Tag0023Test() {
        Tag23IOIID tag23IOIID = new Tag23IOIID("A");
        assertEquals( "A", tag23IOIID.getDataValue());
        assertNotEquals( "11", tag23IOIID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0023Test()");
    }
}