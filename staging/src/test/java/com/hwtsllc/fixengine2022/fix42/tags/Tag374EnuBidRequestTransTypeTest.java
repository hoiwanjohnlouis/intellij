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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
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
    @Test
    void FIX0374Test() {
        FIX42 fixData = FIX42.FIX374_ENU_BID_REQUEST_TRANS_TYPE;
        assertEquals( "374", fixData.toFIXIDString());
        assertEquals( "BID_REQUEST_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "BidRequestTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0374Test() {
        Tag374EnuBidRequestTransType tagData;


        /*
         * C, and N msg types
         */
        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.CANCEL);
        assertEquals( Enum374BidRequestTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag374EnuBidRequestTransType(Enum374BidRequestTransType.NEW);
        assertEquals( Enum374BidRequestTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag374EnuBidRequestTransType tagData;

        // loop around the ENUM and process
        for (Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag374EnuBidRequestTransType tagData;

        // loop around the ENUM and process
        for (Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag374EnuBidRequestTransType tagData;

        // loop around the ENUM and process
        for (Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag374EnuBidRequestTransType tagData;

        // loop around the ENUM and process
        for (Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag374EnuBidRequestTransType tagData;

        // loop around the ENUM and process
        for (Enum374BidRequestTransType oneEnum : Enum374BidRequestTransType.values()) {
            tagData = new Tag374EnuBidRequestTransType(oneEnum);
            assertEquals( "Tag374EnuBidRequestTransType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}