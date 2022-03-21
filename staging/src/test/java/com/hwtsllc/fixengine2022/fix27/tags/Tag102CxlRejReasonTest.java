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
import com.hwtsllc.fixengine2022.fix27.enums.Enum102CxlRejReason;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag102CxlRejReasonTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0102Test() {
        FIXType fixData = FIXType.FIX102_CXL_REJ_REASON;
        assertEquals( fixData.getName(), "CXL_REJ_REASON");
        assertEquals( fixData.getID(), "102");
        assertEquals( fixData.getDescription(), "CxlRejReason");
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0102Test() {
        Tag102CxlRejReason tagData;

        /*
         * 0-6, 18, 99 CxlRejReason type
         */
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.TOO_LATE_TO_CANCEL);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.UNKNOWN_ORDER);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.BROKER_OR_EXCHANGE_OPTION);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.PENDING_STATUS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.UNABLE_TO_PROCESS_MASS_CANCEL_REQUEST);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.UNMATCHED_ORIG_ORD_MOD_TIME);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.DUPLICATE_CLORDID);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.INVALID_PRICE_INCREMENT);
        assertEquals( "18", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag102CxlRejReason(Enum102CxlRejReason.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0102Test()");
    }
}