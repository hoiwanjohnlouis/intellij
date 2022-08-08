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
            assertEquals( "FIX946_ENU_COLL_INQUIRY_RESULT", tagData.toEnumLabelString());
            assertEquals( "946", tagData.toEnumIDString());
            assertEquals( "COLL_INQUIRY_RESULT", tagData.toEnumNameString());
            assertEquals( "CollInquiryResult", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Successful (default)
         *  <p>    1 - Invalid or unknown instrument
         *  <p>    2 - Invalid or unknown collateral type
         *  <p>    3 - Invalid Parties
         *  <p>    4 - Invalid Transport Type requested
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.SUCCESSFUL );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_INSTRUMENT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_PARTIES );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - Invalid Destination requested
         *  <p>    6 - No collateral found for the trade specified
         *  <p>    7 - No collateral found for the order specified
         *  <p>    8 - Collateral inquiry type not supported
         *  <p>    9 - Unauthorized for collateral inquiry
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_DESTINATION );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED );
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY );
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    99 - Other (further information in Text (58) field)
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.OTHER );
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}