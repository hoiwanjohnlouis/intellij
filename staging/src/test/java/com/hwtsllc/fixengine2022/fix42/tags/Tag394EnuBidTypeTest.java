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
import com.hwtsllc.fixengine2022.fix42.enums.Enum394BidType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  394
 *  BidType
 *  int
 *  <p>
 *  Code to identify the type of Bid Request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - "Non Disclosed" style (e.g. US/European)
 *  <p>    2 - "Disclosed" style (e.g. Japanese)
 *  <p>    3 - No bidding process
 */
class Tag394EnuBidTypeTest {
    @Test
    void FIX0394Test() {
        FIX42 fixData = FIX42.FIX394_ENU_BID_TYPE;
        assertEquals( "394", fixData.toEnumIDString());
        assertEquals( "BID_TYPE", fixData.toEnumNameString());
        assertEquals( "BidType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0394Test() {
        Tag394EnuBidType tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag394EnuBidType(Enum394BidType.NON_DISCLOSED);
        assertEquals( Enum394BidType.NON_DISCLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag394EnuBidType(Enum394BidType.DISCLOSED);
        assertEquals( Enum394BidType.DISCLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag394EnuBidType(Enum394BidType.NO_BIDDING);
        assertEquals( Enum394BidType.NO_BIDDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag394EnuBidType tagData;

        // loop around the ENUM and process
        for (Enum394BidType oneEnum : Enum394BidType.values()) {
            tagData = new Tag394EnuBidType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag394EnuBidType tagData;

        // loop around the ENUM and process
        for (Enum394BidType oneEnum : Enum394BidType.values()) {
            tagData = new Tag394EnuBidType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag394EnuBidType tagData;

        // loop around the ENUM and process
        for (Enum394BidType oneEnum : Enum394BidType.values()) {
            tagData = new Tag394EnuBidType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag394EnuBidType tagData;

        // loop around the ENUM and process
        for (Enum394BidType oneEnum : Enum394BidType.values()) {
            tagData = new Tag394EnuBidType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag394EnuBidType tagData;

        // loop around the ENUM and process
        for (Enum394BidType oneEnum : Enum394BidType.values()) {
            tagData = new Tag394EnuBidType(oneEnum);
            assertEquals( "Tag394EnuBidType\n" +
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