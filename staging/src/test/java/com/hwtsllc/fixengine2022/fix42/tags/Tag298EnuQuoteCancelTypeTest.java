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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag298EnuQuoteCancelTypeTest {
    @Test
    void FIX0298Test() {
        FIX42 fixData = FIX42.FIX298_ENU_QUOTE_CANCEL_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-5 msg types
     */
    CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL",
                               "1 - Cancel for Symbol(s)" ),
    CANCEL_FOR_SECURITY_TYPE( "2", "CANCEL_FOR_SECURITY_TYPE",
                                      "2 - Cancel for Security Type(s)" ),
    CANCEL_FOR_UNDERLYING_SYMBOL( "3", "CANCEL_FOR_UNDERLYING_SYMBOL",
                                          "3 - Cancel for Underlying Symbol" ),
    CANCEL_ALL_QUOTES( "4", "CANCEL_ALL_QUOTES",
                               "4 - Cancel All Quotes" ),
    CANCEL_QUOTEID_QUOTE("5", "CANCEL_QUOTEID_QUOTE",
                                 "5 - Cancel quote specified in QuoteID" ),
    @Test
    void Tag0298Test() {
        Tag298EnuQuoteCancelType tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}