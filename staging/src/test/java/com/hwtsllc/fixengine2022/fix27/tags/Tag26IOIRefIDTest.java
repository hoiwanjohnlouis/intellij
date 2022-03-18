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

class Tag26IOIRefIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0026Test() {
        FIXType fix26IOIRefID = FIXType.FIX26_IOI_REF_ID;
        assertEquals( "IOI_REF_ID", fix26IOIRefID.getName());
        assertEquals( 26, fix26IOIRefID.getNumber());
        assertEquals( "IOIRefID", fix26IOIRefID.getDescription());
        assertNotEquals( "IOI_REF_ID IOI_REF_ID", fix26IOIRefID.getName());
        assertNotEquals( 2020, fix26IOIRefID.getNumber());
        assertNotEquals( "123 IOIRefID", fix26IOIRefID.getDescription());
    }
    @Test
    void Tag0026Test() {
        Tag26IOIRefID tag26IOIRefID = new Tag26IOIRefID("A");
        assertEquals( "A", tag26IOIRefID.getDataValue());
        assertNotEquals( "11", tag26IOIRefID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0026Test()");
    }
}