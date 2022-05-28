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
import com.hwtsllc.fixengine2022.fix42.enums.Enum399BidDescriptorType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  399
 *  BidDescriptorType
 *  int
 *  <p>
 *  Code to identify the type of BidDescriptor (400).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Sector
 *  <p>    2 - Country
 *  <p>    3 - Index
 */
class Tag399EnuBidDescriptorTypeTest {
    @Test
    void FIX0399Test() {
        FIX42 fixData = FIX42.FIX399_ENU_BID_DESCRIPTOR_TYPE;
        assertEquals( "399", fixData.toFIXIDString());
        assertEquals( "BID_DESCRIPTOR_TYPE", fixData.toFIXNameString());
        assertEquals( "BidDescriptorType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0399Test() {
        Tag399EnuBidDescriptorType tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.SECTOR);
        assertEquals( Enum399BidDescriptorType.SECTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.COUNTRY);
        assertEquals( Enum399BidDescriptorType.COUNTRY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.INDEX);
        assertEquals( Enum399BidDescriptorType.INDEX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag399EnuBidDescriptorType tagData;

        // loop around the ENUM and process
        for (Enum399BidDescriptorType oneEnum : Enum399BidDescriptorType.values()) {
            tagData = new Tag399EnuBidDescriptorType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag399EnuBidDescriptorType tagData;

        // loop around the ENUM and process
        for (Enum399BidDescriptorType oneEnum : Enum399BidDescriptorType.values()) {
            tagData = new Tag399EnuBidDescriptorType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag399EnuBidDescriptorType tagData;

        // loop around the ENUM and process
        for (Enum399BidDescriptorType oneEnum : Enum399BidDescriptorType.values()) {
            tagData = new Tag399EnuBidDescriptorType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag399EnuBidDescriptorType tagData;

        // loop around the ENUM and process
        for (Enum399BidDescriptorType oneEnum : Enum399BidDescriptorType.values()) {
            tagData = new Tag399EnuBidDescriptorType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag399EnuBidDescriptorType tagData;

        // loop around the ENUM and process
        for (Enum399BidDescriptorType oneEnum : Enum399BidDescriptorType.values()) {
            tagData = new Tag399EnuBidDescriptorType(oneEnum);
            assertEquals( "Tag399EnuBidDescriptorType\n" +
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