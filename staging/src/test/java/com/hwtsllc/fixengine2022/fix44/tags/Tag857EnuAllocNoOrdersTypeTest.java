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
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX857_ENU_ALLOC_NO_ORDERS_TYPE;
        assertEquals( "857", fixData.toEnumIDString());
        assertEquals( "ALLOC_NO_ORDERS_TYPE", fixData.toEnumNameString());
        assertEquals( "AllocNoOrdersType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0857Test() {
        Tag857EnuAllocNoOrdersType tagData;
        Enum857AllocNoOrdersType oneElement;

        oneElement = Enum857AllocNoOrdersType.NOT_SPECIFIED;
        tagData = new Tag857EnuAllocNoOrdersType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "857", tagData.toEnumIDString());
        assertEquals( "ALLOC_NO_ORDERS_TYPE", tagData.toEnumNameString());
        assertEquals( "AllocNoOrdersType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Enum857AllocNoOrdersType.LIST_PROVIDED;
        tagData = new Tag857EnuAllocNoOrdersType( oneElement );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag857EnuAllocNoOrdersType tagData;

        // loop around the ENUM and process
        for ( Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag857EnuAllocNoOrdersType tagData;

        // loop around the ENUM and process
        for (Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag857EnuAllocNoOrdersType tagData;

        // loop around the ENUM and process
        for (Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag857EnuAllocNoOrdersType tagData;

        // loop around the ENUM and process
        for (Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag857EnuAllocNoOrdersType tagData;

        // loop around the ENUM and process
        for (Enum857AllocNoOrdersType oneEnum : Enum857AllocNoOrdersType.values()) {
            tagData = new Tag857EnuAllocNoOrdersType(oneEnum);
            assertEquals( "Tag857EnuAllocNoOrdersType\n" +
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