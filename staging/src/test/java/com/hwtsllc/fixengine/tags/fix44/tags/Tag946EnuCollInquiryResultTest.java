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

import com.hwtsllc.fixengine2022.fix44.enums.Enum946CollInquiryResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag946EnuCollInquiryResultTest {
    Tag946EnuCollInquiryResult tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( "FIX946_ENU_COLL_INQUIRY_RESULT", tagData.toFIXLabelString());
            assertEquals( "946", tagData.toFIXIDString());
            assertEquals( "COLL_INQUIRY_RESULT", tagData.toFIXNameString());
            assertEquals( "CollInquiryResult", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  946
         *  CollInquiryResult
         *  int
         *  <p>    0 - Successful (default)
         *  <p>    1 - Invalid or unknown instrument
         *  <p>    2 - Invalid or unknown collateral type
         *  <p>    3 - Invalid Parties
         *  <p>    4 - Invalid Transport Type requested
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.SUCCESSFUL );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_INSTRUMENT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_PARTIES );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Invalid Destination requested
         *  <p>    6 - No collateral found for the trade specified
         *  <p>    7 - No collateral found for the order specified
         *  <p>    8 - Collateral inquiry type not supported
         *  <p>    9 - Unauthorized for collateral inquiry
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_DESTINATION );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other (further information in Text (58) field)
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( "Tag946EnuCollInquiryResult\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}