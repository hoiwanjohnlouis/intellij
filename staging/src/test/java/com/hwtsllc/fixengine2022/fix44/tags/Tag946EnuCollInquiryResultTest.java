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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum946CollInquiryResult;
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
class Tag946EnuCollInquiryResultTest {
    @Test
    void FIX0946Test() {
        FIX44 fixData = FIX44.FIX946_ENU_COLL_INQUIRY_RESULT;
        assertEquals( "946", fixData.getID());
        assertEquals( "COLL_INQUIRY_RESULT", fixData.getName());
        assertEquals( "CollInquiryResult", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0946Test() {
        Tag946EnuCollInquiryResult tagData;

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.SUCCESSFUL );
        assertEquals( Enum946CollInquiryResult.SUCCESSFUL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_INSTRUMENT );
        assertEquals( Enum946CollInquiryResult.INVALID_INSTRUMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE );
        assertEquals( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_PARTIES );
        assertEquals( Enum946CollInquiryResult.INVALID_PARTIES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE );
        assertEquals( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_DESTINATION );
        assertEquals( Enum946CollInquiryResult.INVALID_DESTINATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE );
        assertEquals( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER );
        assertEquals( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED );
        assertEquals( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY );
        assertEquals( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.OTHER );
        assertEquals( Enum946CollInquiryResult.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}