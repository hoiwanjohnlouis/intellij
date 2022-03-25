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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag127EtDKReasonTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();
    // private static final Logger logger = LogManager.getLogger(Tag1StAccount.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0127Test() {
        FIXType fixData = FIXType.FIX127_ET_DK_REASON;
        assertEquals( fixData.getName(), "DK_REASON");
        assertEquals( fixData.getID(), "127");
        assertEquals( fixData.getDescription(), "DKReason");
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0127Test() {
        Tag127EtDKReason tagData;

        /*
         * A-F, Z DKReason type
         */
        tagData = new Tag127EtDKReason(Enum127DKReason.UNKNOWN_SYMBOL);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag127EtDKReason(Enum127DKReason.WRONG_SIDE);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag127EtDKReason(Enum127DKReason.QUANTITY_EXCEEDS_ORDER);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag127EtDKReason(Enum127DKReason.NO_MATCHING_ORDER);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag127EtDKReason(Enum127DKReason.PRICE_EXCEEDS_LIMIT);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag127EtDKReason(Enum127DKReason.CALCULATION_DIFFERENCE);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag127EtDKReason(Enum127DKReason.OTHER);
        assertEquals( "Z", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info(WHERE_AM_I + ":Successful Tag0127Test()");
    }
}