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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "TRADE_DATE", enumType.toEnumNameString() );
        assertEquals( "0 - Trade Date", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.GC_INSTRUMENT;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "GC_INSTRUMENT", enumType.toEnumNameString() );
        assertEquals( "1 - GC Instrument", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "COLLATERAL_INSTRUMENT", enumType.toEnumNameString() );
        assertEquals( "2 - Collateral Instrument", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "SUBSTITUTION_ELIGIBLE", enumType.toEnumNameString() );
        assertEquals( "3 - Substitution Eligible", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.NOT_ASSIGNED;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "NOT_ASSIGNED", enumType.toEnumNameString() );
        assertEquals( "4 - Not Assigned", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED;
        assertEquals( "5", enumType.toEnumIDString() );
        assertEquals( "PARTIALLY_ASSIGNED", enumType.toEnumNameString() );
        assertEquals( "5 - Partially Assigned", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.FULLY_ASSIGNED;
        assertEquals( "6", enumType.toEnumIDString() );
        assertEquals( "FULLY_ASSIGNED", enumType.toEnumNameString() );
        assertEquals( "6 - Fully Assigned", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum896CollInquiryQualifier.OUTSTANDING_TRADES;
        assertEquals( "7", enumType.toEnumIDString() );
        assertEquals( "OUTSTANDING_TRADES", enumType.toEnumNameString() );
        assertEquals( "7 - Outstanding Trades (Today < end date)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}