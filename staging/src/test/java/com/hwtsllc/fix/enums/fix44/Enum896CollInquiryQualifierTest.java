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

package com.hwtsllc.fix.enums.fix44;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  896
 *  CollInquiryQualifier
 *  int
 *  <p></p>
 *  Collateral inquiry qualifiers:
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Trade Date
 *  <p>    1 - GC Instrument
 *  <p>    2 - Collateral Instrument
 *  <p>    3 - Substitution Eligible
 *  <p>    4 - Not Assigned
 *  <p></p>
 *  <p>    5 - Partially Assigned
 *  <p>    6 - Fully Assigned
 *  <p>    7 - Outstanding Trades (Today < end date)
 */
class Enum896CollInquiryQualifierTest {
    @Test
    void EnumTest() {
        Enum896CollInquiryQualifier enumType;

        enumType = Enum896CollInquiryQualifier.TRADE_DATE;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "TRADE_DATE", enumType.toFIXNameString() );
        assertEquals( "0 - Trade Date", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.GC_INSTRUMENT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "GC_INSTRUMENT", enumType.toFIXNameString() );
        assertEquals( "1 - GC Instrument", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "COLLATERAL_INSTRUMENT", enumType.toFIXNameString() );
        assertEquals( "2 - Collateral Instrument", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "SUBSTITUTION_ELIGIBLE", enumType.toFIXNameString() );
        assertEquals( "3 - Substitution Eligible", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.NOT_ASSIGNED;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "NOT_ASSIGNED", enumType.toFIXNameString() );
        assertEquals( "4 - Not Assigned", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "PARTIALLY_ASSIGNED", enumType.toFIXNameString() );
        assertEquals( "5 - Partially Assigned", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.FULLY_ASSIGNED;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "FULLY_ASSIGNED", enumType.toFIXNameString() );
        assertEquals( "6 - Fully Assigned", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum896CollInquiryQualifier.OUTSTANDING_TRADES;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "OUTSTANDING_TRADES", enumType.toFIXNameString() );
        assertEquals( "7 - Outstanding Trades (Today < end date)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}