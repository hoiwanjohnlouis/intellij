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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Deprecated
class Tag20ExecTransTypeTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0020Test() {
        FIXType fixData = FIXType.FIX20_EXEC_TRANS_TYPE;
        assertEquals( "EXEC_TRANS_TYPE", fixData.getName());
        assertEquals( "20", fixData.getID());
        assertEquals( "ExecTransType (replaced)", fixData.getDescription());
        assertNotEquals( "EXEC_TRANS_TYPE EXEC_TRANS_TYPE", fixData.getName());
        assertNotEquals( "2020", fixData.getID());
        assertNotEquals( "123 ExecTransType (replaced)", fixData.getDescription());
    }
    @Test
    void Tag0020Test() {
        Tag20ExecTransType tagData = new Tag20ExecTransType(Tag20ExecTransType.TESTA_EXEC_TRANS_TYPE);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( "11", tagData.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0020Test()");
    }
}