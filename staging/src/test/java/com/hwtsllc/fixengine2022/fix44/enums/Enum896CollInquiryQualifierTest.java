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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

/**
 *  896
 *  CollInquiryQualifier
 *  int
 *  Collateral inquiry qualifiers:
 *  Valid values:
 *      0 - Trade Date
 *      1 - GC Instrument
 *      2 - Collateral Instrument
 *      3 - Substitution Eligible
 *      4 - Not Assigned
 *      5 - Partially Assigned
 *      6 - Fully Assigned
 *      7 - Outstanding Trades (Today < end date)
 */
class Enum896CollInquiryQualifierTest {
    @Test
    void EnumTest() {
        Enum896CollInquiryQualifier enumType;

        enumType = Enum896CollInquiryQualifier.TRADE_DATE;
        assertEquals( "0", enumType.getID() );
        assertEquals( "TRADE_DATE", enumType.getName() );
        assertEquals( "0 - Trade Date", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.GC_INSTRUMENT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "GC_INSTRUMENT", enumType.getName() );
        assertEquals( "1 - GC Instrument", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT;
        assertEquals( "2", enumType.getID() );
        assertEquals( "COLLATERAL_INSTRUMENT", enumType.getName() );
        assertEquals( "2 - Collateral Instrument", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE;
        assertEquals( "3", enumType.getID() );
        assertEquals( "SUBSTITUTION_ELIGIBLE", enumType.getName() );
        assertEquals( "3 - Substitution Eligible", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.NOT_ASSIGNED;
        assertEquals( "4", enumType.getID() );
        assertEquals( "NOT_ASSIGNED", enumType.getName() );
        assertEquals( "4 - Not Assigned", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED;
        assertEquals( "5", enumType.getID() );
        assertEquals( "PARTIALLY_ASSIGNED", enumType.getName() );
        assertEquals( "5 - Partially Assigned", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.FULLY_ASSIGNED;
        assertEquals( "6", enumType.getID() );
        assertEquals( "FULLY_ASSIGNED", enumType.getName() );
        assertEquals( "6 - Fully Assigned", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum896CollInquiryQualifier.OUTSTANDING_TRADES;
        assertEquals( "7", enumType.getID() );
        assertEquals( "OUTSTANDING_TRADES", enumType.getName() );
        assertEquals( "7 - Outstanding Trades (Today < end date)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}