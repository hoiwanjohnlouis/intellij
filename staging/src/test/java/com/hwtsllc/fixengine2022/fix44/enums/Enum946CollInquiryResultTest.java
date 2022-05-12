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
 *  Result returned in response to Collateral Inquiry
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid or unknown instrument
 *      2 - Invalid or unknown collateral type
 *      3 - Invalid Parties
 *      4 - Invalid Transport Type requested
 *      5 - Invalid Destination requested
 *      6 - No collateral found for the trade specified
 *      7 - No collateral found for the order specified
 *      8 - Collateral inquiry type not supported
 *      9 - Unauthorized for collateral inquiry
 *      99 - Other (further information in Text (58) field)
 *
 *      or any value conforming to the data type Reserved100Plus
 */
class Enum946CollInquiryResultTest {
    @Test
    void EnumTest() {
        Enum946CollInquiryResult enumType;

        enumType = Enum946CollInquiryResult.SUCCESSFUL;
        assertEquals( "0", enumType.getID() );
        assertEquals( "SUCCESSFUL", enumType.getName() );
        assertEquals( "0 - Successful (default)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.INVALID_INSTRUMENT;
        assertEquals( "1", enumType.getID() );
        assertEquals( "INVALID_INSTRUMENT", enumType.getName() );
        assertEquals( "1 - Invalid or unknown instrument", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE;
        assertEquals( "2", enumType.getID() );
        assertEquals( "UNKNOWN_COLLATERAL_TYPE", enumType.getName() );
        assertEquals( "2 - Invalid or unknown collateral type", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.INVALID_PARTIES;
        assertEquals( "3", enumType.getID() );
        assertEquals( "INVALID_PARTIES", enumType.getName() );
        assertEquals( "3 - Invalid Parties", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE;
        assertEquals( "4", enumType.getID() );
        assertEquals( "INVALID_TRANSPORT_TYPE", enumType.getName() );
        assertEquals( "4 - Invalid Transport Type requested", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum946CollInquiryResult.INVALID_DESTINATION;
        assertEquals( "5", enumType.getID() );
        assertEquals( "INVALID_DESTINATION", enumType.getName() );
        assertEquals( "5 - Invalid Destination requested", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE;
        assertEquals( "6", enumType.getID() );
        assertEquals( "NO_COLLATERAL_FOUND_FOR_TRADE", enumType.getName() );
        assertEquals( "6 - No collateral found for the trade specified", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER;
        assertEquals( "7", enumType.getID() );
        assertEquals( "NO_COLLATERAL_FOUND_FOR_ORDER", enumType.getName() );
        assertEquals( "7 - No collateral found for the order specified", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED;
        assertEquals( "8", enumType.getID() );
        assertEquals( "COLLATERAL_INQUIRY_NOT_SUPPORTED", enumType.getName() );
        assertEquals( "8 - Collateral inquiry type not supported", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY;
        assertEquals( "9", enumType.getID() );
        assertEquals( "UNAUTHORIZED_COLLATERAL_INQUIRY", enumType.getName() );
        assertEquals( "9 - Unauthorized for collateral inquiry", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum946CollInquiryResult.OTHER;
        assertEquals( "99", enumType.getID() );
        assertEquals( "OTHER", enumType.getName() );
        assertEquals( "99 - Other (further information in Text (58) field)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}