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
 *  946
 *  CollInquiryResult
 *  int
 *  <p></p>
 *  Result returned in response to Collateral Inquiry
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid or unknown instrument
 *  <p>    2 - Invalid or unknown collateral type
 *  <p>    3 - Invalid Parties
 *  <p>    4 - Invalid Transport Type requested
 *  <p></p>
 *  <p>    5 - Invalid Destination requested
 *  <p>    6 - No collateral found for the trade specified
 *  <p>    7 - No collateral found for the order specified
 *  <p>    8 - Collateral inquiry type not supported
 *  <p>    9 - Unauthorized for collateral inquiry
 *  <p></p>
 *  <p>    99 - Other (further information in Text (58) field)
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum946CollInquiryResultTest {
    @Test
    void EnumTest() {
        Enum946CollInquiryResult enumType;

        enumType = Enum946CollInquiryResult.SUCCESSFUL;
        assertEquals( "0", enumType.toFIXIDString() );
        assertEquals( "SUCCESSFUL", enumType.toFIXNameString() );
        assertEquals( "0 - Successful (default)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.INVALID_INSTRUMENT;
        assertEquals( "1", enumType.toFIXIDString() );
        assertEquals( "INVALID_INSTRUMENT", enumType.toFIXNameString() );
        assertEquals( "1 - Invalid or unknown instrument", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE;
        assertEquals( "2", enumType.toFIXIDString() );
        assertEquals( "UNKNOWN_COLLATERAL_TYPE", enumType.toFIXNameString() );
        assertEquals( "2 - Invalid or unknown collateral type", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.INVALID_PARTIES;
        assertEquals( "3", enumType.toFIXIDString() );
        assertEquals( "INVALID_PARTIES", enumType.toFIXNameString() );
        assertEquals( "3 - Invalid Parties", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE;
        assertEquals( "4", enumType.toFIXIDString() );
        assertEquals( "INVALID_TRANSPORT_TYPE", enumType.toFIXNameString() );
        assertEquals( "4 - Invalid Transport Type requested", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum946CollInquiryResult.INVALID_DESTINATION;
        assertEquals( "5", enumType.toFIXIDString() );
        assertEquals( "INVALID_DESTINATION", enumType.toFIXNameString() );
        assertEquals( "5 - Invalid Destination requested", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE;
        assertEquals( "6", enumType.toFIXIDString() );
        assertEquals( "NO_COLLATERAL_FOUND_FOR_TRADE", enumType.toFIXNameString() );
        assertEquals( "6 - No collateral found for the trade specified", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER;
        assertEquals( "7", enumType.toFIXIDString() );
        assertEquals( "NO_COLLATERAL_FOUND_FOR_ORDER", enumType.toFIXNameString() );
        assertEquals( "7 - No collateral found for the order specified", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED;
        assertEquals( "8", enumType.toFIXIDString() );
        assertEquals( "COLLATERAL_INQUIRY_NOT_SUPPORTED", enumType.toFIXNameString() );
        assertEquals( "8 - Collateral inquiry type not supported", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY;
        assertEquals( "9", enumType.toFIXIDString() );
        assertEquals( "UNAUTHORIZED_COLLATERAL_INQUIRY", enumType.toFIXNameString() );
        assertEquals( "9 - Unauthorized for collateral inquiry", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum946CollInquiryResult.OTHER;
        assertEquals( "99", enumType.toFIXIDString() );
        assertEquals( "OTHER", enumType.toFIXNameString() );
        assertEquals( "99 - Other (further information in Text (58) field)", enumType.toFIXDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}