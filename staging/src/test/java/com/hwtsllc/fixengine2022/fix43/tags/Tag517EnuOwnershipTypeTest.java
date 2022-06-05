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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag517EnuOwnershipType;
import com.hwtsllc.fixengine2022.fix43.enums.Enum517OwnershipType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  517
 *  OwnershipType
 *  char
 *  <p></p>
 *  The relationship between Registration parties.
 *  <p></p>
 *  Valid values:
 *  <p>    J - Joint Investors
 *  <p>    T - Tenants in Common
 *  <p>    2 - Joint Trustees
 */
class Tag517EnuOwnershipTypeTest {
    @Test
    void FIX0517Test() {
        FIX43 fixData = FIX43.FIX517_ENU_OWNERSHIP_TYPE;
        assertEquals( "517", fixData.toFIXIDString());
        assertEquals( "OWNERSHIP_TYPE", fixData.toFIXNameString());
        assertEquals( "OwnershipType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0517Test() {
        Tag517EnuOwnershipType tagData;

        /*
         * J, T,and 2 types
         */

        /*
         *  J, type
         */
        tagData = new Tag517EnuOwnershipType( Enum517OwnershipType.JOINT_INVESTORS );
        assertEquals( Enum517OwnershipType.JOINT_INVESTORS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  T, type
         */
        tagData = new Tag517EnuOwnershipType( Enum517OwnershipType.TENANTS_IN_COMMON );
        assertEquals( Enum517OwnershipType.TENANTS_IN_COMMON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  2, type
         */
        tagData = new Tag517EnuOwnershipType( Enum517OwnershipType.JOINT_TRUSTEES );
        assertEquals( Enum517OwnershipType.JOINT_TRUSTEES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag517EnuOwnershipType tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag517EnuOwnershipType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag517EnuOwnershipType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag517EnuOwnershipType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag517EnuOwnershipType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag517EnuOwnershipType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag517EnuOwnershipType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag517EnuOwnershipType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag517EnuOwnershipType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag517EnuOwnershipType(oneEnum);
            assertEquals( "Tag517EnuOwnershipType\n" +
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