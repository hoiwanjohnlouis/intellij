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

import com.hwtsllc.fixengine2022.fix44.enums.Enum857AllocNoOrdersType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  857
 *  AllocNoOrdersType
 *  int
 *  <p></p>
 *  Indicates how the orders being booked and allocated by an Allocation Instruction or Allocation
 *  <p></p>
 *  Report message are identified, i.e. by explicit definition in the NoOrders group or not.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Not Specified
 *  <p>    1 - Explicit List Provided
 */
class Tag857EnuAllocNoOrdersTypeTest {
    Tag857EnuAllocNoOrdersType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( "FIX857_ENU_ALLOC_NO_ORDERS_TYPE", tagData.toEnumLabelString());
            assertEquals( "857", tagData.toEnumIDString());
            assertEquals( "ALLOC_NO_ORDERS_TYPE", tagData.toEnumNameString());
            assertEquals( "AllocNoOrdersType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Not Specified
         *  <p>    1 - Explicit List Provided
         */
        tagData = new Tag857EnuAllocNoOrdersType( Enum857AllocNoOrdersType.NOT_SPECIFIED );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag857EnuAllocNoOrdersType( Enum857AllocNoOrdersType.LIST_PROVIDED );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( "Tag857EnuAllocNoOrdersType\n" +
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