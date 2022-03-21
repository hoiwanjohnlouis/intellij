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
import com.hwtsllc.fixengine2022.fix40.enums.Enum139MiscFeeType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag139MiscFeeTypeTest {
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
    void FIX0139Test() {
        FIXType fixData = FIXType.FIX139_MISC_FEE_TYPE;
        assertEquals( "MISC_FEE_TYPE", fixData.getName());
        assertEquals( "139", fixData.getID());
        assertEquals( "MiscFeeType", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0139Test() {
        Tag139MiscFeeType tagData;

        /*
         * 1-14 MiscFeeType types
         */
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.REGULATORY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.TAX);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.LOCAL_COMMISSION);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.EXCHANGE_FEES);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.STAMP);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.LEVY);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.OTHER);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.MARKUP);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.CONSUMPTION_TAX);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.PER_TRANSACTION);
        assertEquals( "10", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.CONVERSION);
        assertEquals( "11", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.AGENT);
        assertEquals( "12", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.TRANSFER_FEE);
        assertEquals( "13", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag139MiscFeeType(Enum139MiscFeeType.SECURITY_LENDING);
        assertEquals( "14", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info(WHERE_AM_I + ":Successful Tag0139Test()");
    }
}