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
        assertEquals( "399", fixData.toEnumIDString());
        assertEquals( "BID_DESCRIPTOR_TYPE", fixData.toEnumNameString());
        assertEquals( "BidDescriptorType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0399Test() {
        Tag399EnuBidDescriptorType tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.SECTOR);
        assertEquals( Enum399BidDescriptorType.SECTOR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.COUNTRY);
        assertEquals( Enum399BidDescriptorType.COUNTRY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag399EnuBidDescriptorType(Enum399BidDescriptorType.INDEX);
        assertEquals( Enum399BidDescriptorType.INDEX.toEnumIDString(), tagData.getDataValue());
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
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
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