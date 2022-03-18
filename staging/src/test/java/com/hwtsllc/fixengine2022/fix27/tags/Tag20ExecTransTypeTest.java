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
import com.hwtsllc.fixengine2022.fix27.enums.Enum20ExecTransType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        FIXType fix20ExecTransType = FIXType.FIX20_EXEC_TRANS_TYPE;
        assertEquals( "EXEC_TRANS_TYPE", fix20ExecTransType.getName());
        assertEquals( "20", fix20ExecTransType.getID());
        assertEquals( "ExecTransType (replaced)", fix20ExecTransType.getDescription());
        assertNotEquals( "EXEC_TRANS_TYPE EXEC_TRANS_TYPE", fix20ExecTransType.getName());
        assertNotEquals( "2020", fix20ExecTransType.getID());
        assertNotEquals( "123 ExecTransType (replaced)", fix20ExecTransType.getDescription());
    }
    @Test
    void Tag0020Test() {
        Tag20ExecTransType tag20ExecTransType = new Tag20ExecTransType(Enum20ExecTransType.NEW.getID());
//        assertEquals( "A", tag20ExecTransType.getDataValue());
//        assertNotEquals( "11", tag20ExecTransType.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0020Test()");
    }
}