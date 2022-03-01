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

class Tag50SenderSubIDTest {
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
    void FIX0050Test() {
        FIXType fix50SenderSubID = FIXType.SENDER_SUB_ID;
        assertEquals( "SENDER_SUB_ID", fix50SenderSubID.getFIXName());
        assertEquals( 50, fix50SenderSubID.getFIXNumber());
        assertEquals( "SenderSubID", fix50SenderSubID.getFIXDescription());
        assertNotEquals( "SENDER_SUB_ID SENDER_SUB_ID", fix50SenderSubID.getFIXName());
        assertNotEquals( 3123, fix50SenderSubID.getFIXNumber());
        assertNotEquals( "SenderSubID SenderSubID", fix50SenderSubID.getFIXDescription());
    }
    @Test
    void Tag0050Test() {
        TagType tag50SenderSubID = new TagType(FIXType.SENDER_SUB_ID,"BEST");
        assertEquals( "BEST", tag50SenderSubID.getDataValue());
        assertNotEquals( "A11", tag50SenderSubID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0050Test()");
    }
}