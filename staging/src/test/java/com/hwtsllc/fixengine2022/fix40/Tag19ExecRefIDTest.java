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

import com.hwtsllc.fixengine2022.datatypes.TagType;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag19ExecRefIDTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1Account.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0019Test() {
        FIXType fix19ExecRefID = FIXType.FIX19_EXEC_REF_ID;
        assertEquals( "EXEC_REF_ID", fix19ExecRefID.getFIXName());
        assertEquals( 19, fix19ExecRefID.getFIXNumber());
        assertEquals( "ExecRefID", fix19ExecRefID.getFIXDescription());
        assertNotEquals( "EXEC_REF_ID EXEC_REF_ID", fix19ExecRefID.getFIXName());
        assertNotEquals( 111, fix19ExecRefID.getFIXNumber());
        assertNotEquals( "123 ExecRefID", fix19ExecRefID.getFIXDescription());
    }
    @Test
    void Tag0019Test() {
        TagType tag19ExecRefID = new TagType(FIXType.FIX16_END_SEQ_NO,"6789-XYZ");
        assertEquals( "6789-XYZ", tag19ExecRefID.getDataValue());
        assertNotEquals( "11-ABCD", tag19ExecRefID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0019Test()");
    }
}