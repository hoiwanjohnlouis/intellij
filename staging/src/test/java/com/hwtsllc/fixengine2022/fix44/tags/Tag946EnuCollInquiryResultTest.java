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
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX946_ENU_COLL_INQUIRY_RESULT;
        assertEquals( "946", fixData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_RESULT", fixData.toEnumNameString());
        assertEquals( "CollInquiryResult", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0946Test() {
        Tag946EnuCollInquiryResult tagData;
        Enum946CollInquiryResult oneElement;

        oneElement = Enum946CollInquiryResult.SUCCESSFUL;
        tagData = new Tag946EnuCollInquiryResult( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "946", tagData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_RESULT", tagData.toEnumNameString());
        assertEquals( "CollInquiryResult", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_INSTRUMENT );
        assertEquals( Enum946CollInquiryResult.INVALID_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE );
        assertEquals( Enum946CollInquiryResult.UNKNOWN_COLLATERAL_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_PARTIES );
        assertEquals( Enum946CollInquiryResult.INVALID_PARTIES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE );
        assertEquals( Enum946CollInquiryResult.INVALID_TRANSPORT_TYPE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.INVALID_DESTINATION );
        assertEquals( Enum946CollInquiryResult.INVALID_DESTINATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE );
        assertEquals( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER );
        assertEquals( Enum946CollInquiryResult.NO_COLLATERAL_FOUND_FOR_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED );
        assertEquals( Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY );
        assertEquals( Enum946CollInquiryResult.UNAUTHORIZED_COLLATERAL_INQUIRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag946EnuCollInquiryResult( Enum946CollInquiryResult.OTHER );
        assertEquals( Enum946CollInquiryResult.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag946EnuCollInquiryResult tagData;

        // loop around the ENUM and process
        for ( Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag946EnuCollInquiryResult tagData;

        // loop around the ENUM and process
        for (Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag946EnuCollInquiryResult tagData;

        // loop around the ENUM and process
        for (Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag946EnuCollInquiryResult tagData;

        // loop around the ENUM and process
        for (Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag946EnuCollInquiryResult tagData;

        // loop around the ENUM and process
        for (Enum946CollInquiryResult oneEnum : Enum946CollInquiryResult.values()) {
            tagData = new Tag946EnuCollInquiryResult(oneEnum);
            assertEquals( "Tag946EnuCollInquiryResult\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}