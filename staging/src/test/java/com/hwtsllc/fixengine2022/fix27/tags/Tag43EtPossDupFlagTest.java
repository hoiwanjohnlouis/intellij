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
import com.hwtsllc.fixengine2022.fix27.enums.EnumBoolean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag43EtPossDupFlagTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0043Test() {
        FIXType fixData = FIXType.FIX43_ET_POSS_DUP_FLAG;
        assertEquals( "POSS_DUP_FLAG", fixData.getName());
        assertEquals( "43", fixData.getID());
        assertEquals( "PossDupFlag", fixData.getDescription());
        assertNotEquals( "JunkName", fixData.getName());
        assertNotEquals( "JunkID", fixData.getID());
        assertNotEquals( "JunkDescription", fixData.getDescription());
    }
    @Test
    void Tag0043Test() {
        Tag43EtPossDupFlag tagData;

        tagData = new Tag43EtPossDupFlag(EnumBoolean.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_ST_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0043Test()");
    }
}