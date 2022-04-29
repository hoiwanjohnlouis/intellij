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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum303QuoteRequestType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag303EnuQuoteRequestTypeTest {
    @Test
    void FIX0303Test() {
        FIX42 fixData = FIX42.FIX303_ENU_QUOTE_REQUEST_TYPE;
        assertEquals( "303", fixData.getID());
        assertEquals( "QUOTE_REQUEST_TYPE", fixData.getName());
        assertEquals( "QuoteRequestType", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  303
     *  QuoteRequestType
     *
     *      1-2 msg types
     *      MANUAL( "1", "MANUAL", "1 - Manual" ),
     *      AUTOMATIC( "2", "AUTOMATIC", "2 - Automatic" ),
     */
    @Test
    void Tag0303Test() {
        Tag303EnuQuoteRequestType tagData;

        /**
         * 1-2 msg types
         */
        tagData = new Tag303EnuQuoteRequestType(Enum303QuoteRequestType.MANUAL);
        assertEquals( Enum303QuoteRequestType.MANUAL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag303EnuQuoteRequestType(Enum303QuoteRequestType.AUTOMATIC);
        assertEquals( Enum303QuoteRequestType.AUTOMATIC.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}