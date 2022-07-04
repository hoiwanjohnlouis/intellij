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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  73
 *  NoOrders
 *  NumInGroup
 *  <p>
 *  Indicates number of orders to be combined for average pricing and allocation.
 */
class Tag73NumNoOrdersTest {
    @Test
    void FIX0073Test() {
        FIX27 fixData = FIX27.FIX73_NUM_NO_ORDERS;
        assertEquals( "NO_ORDERS", fixData.toEnumNameString());
        assertEquals( "73", fixData.toEnumIDString());
        assertEquals( "NoOrders", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0073Test() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(24601));
        assertEquals( 24601, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(Tag73NumNoOrders.TESTB_NUM_NO_ORDERS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(Tag73NumNoOrders.TESTB_NUM_NO_ORDERS));
        assertEquals( Tag73NumNoOrders.TESTB_NUM_NO_ORDERS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(Tag73NumNoOrders.TESTB_NUM_NO_ORDERS));
        assertEquals( tagData.toEnumIDString() + "=" + Tag73NumNoOrders.TESTB_NUM_NO_ORDERS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(Tag73NumNoOrders.TESTB_NUM_NO_ORDERS));
        assertEquals( String.valueOf(Tag73NumNoOrders.TESTB_NUM_NO_ORDERS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag73NumNoOrders tagData;

        tagData = new Tag73NumNoOrders(new MyNumInGroupType(Tag73NumNoOrders.TESTA_NUM_NO_ORDERS));
        assertEquals( "Tag73NumNoOrders\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag73NumNoOrders.TESTA_NUM_NO_ORDERS + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag73NumNoOrders.TESTA_NUM_NO_ORDERS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}