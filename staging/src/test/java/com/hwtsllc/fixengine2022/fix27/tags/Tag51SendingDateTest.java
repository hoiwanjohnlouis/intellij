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
import com.hwtsllc.fixengine2022.fix27.tags.Tag51SendingDate;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Deprecated
class Tag51SendingDateTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Test() {
        logger.info(WHERE_AM_I + ":Successful Test()");
    }
    @Test
    void FIX0051Test() {
        FIXType fix51SendingDate = FIXType.FIX51_SENDING_DATE;
        assertEquals( "SENDING_DATE", fix51SendingDate.getFIXName());
        assertEquals( 51, fix51SendingDate.getFIXNumber());
        assertEquals( "SendingDate (no longer used)", fix51SendingDate.getFIXDescription());
        assertNotEquals( "SENDING_DATE SENDING_DATE", fix51SendingDate.getFIXName());
        assertNotEquals( 3123, fix51SendingDate.getFIXNumber());
        assertNotEquals( "SendingDate SendingDate", fix51SendingDate.getFIXDescription());
    }
    @Test
    void Tag0051Test() {
        Tag51SendingDate tag50SenderSubID = new Tag51SendingDate();
        assertEquals( "BEST", tag50SenderSubID.getDataValue());
        assertNotEquals( "A11", tag50SenderSubID.getDataValue());
        logger.info(WHERE_AM_I + ":Successful Tag0050Test()");
    }
}