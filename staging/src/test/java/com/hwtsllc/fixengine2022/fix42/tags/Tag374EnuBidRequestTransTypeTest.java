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

import com.hwtsllc.fixengine2022.fix42.enums.Enum374BidRequestTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  374
 *  Enu
 *  BidRequestTransType
 *  char
 *  <p>
 *  Identifies the Bid Request message type.
 *  <p></p>
 *  Valid values:
 *  <p>    C, and N msg types
 *  <p>    "C - Cancel"
 *  <p>    "N - New"
 */
class Tag374EnuBidRequestTransTypeTest {
    Tag374EnuBidRequestTransType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( "FIX374_ENU_BID_REQUEST_TRANS_TYPE", tagData.toEnumLabelString());
            assertEquals( "374", tagData.toEnumIDString());
            assertEquals( "BID_REQUEST_TRANS_TYPE", tagData.toEnumNameString());
            assertEquals( "BidRequestTransType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * C, and N msg types
         */
        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.CANCEL);
        assertEquals( Enum374BidRequestTransType.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.NEW);
        assertEquals( Enum374BidRequestTransType.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( "Tag374EnuBidRequestTransType\n" +
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