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
import com.hwtsllc.fixengine2022.fix27.enums.Enum22SecurityIDSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tag22SecurityIDSourceTest {
    private static final Logger logger = LogManager.getRootLogger();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void FIX0022Test() {
        FIXType fixData = FIXType.FIX22_SECURITY_ID_SOURCE;
        assertEquals( "SECURITY_ID_SOURCE", fixData.getName());
        assertEquals( "22", fixData.getID());
        assertEquals( "SecurityIDSource", fixData.getDescription());
        assertNotEquals( FIXType.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIXType.JUNK_NAME, fixData.getName());
        assertNotEquals( FIXType.JUNK_ID, fixData.getID());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0022Test() {
        Tag22SecurityIDSource tagData;

        /*
         * 1-9 Securiy ID Source
         */
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.CUSIP);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.SEDOL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.QUIK);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.ISIN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.RIC);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.CTA);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        /*
         * A-L Securiy ID Source
         */
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.DUTCH);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.VALOREN);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.SICOVAM);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.COMMON);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag22SecurityIDSource(Enum22SecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( FIXType.JUNK_DATA_VALUE, tagData.getDataValue());

        logger.info("Successful Tag0022Test()");
    }
}