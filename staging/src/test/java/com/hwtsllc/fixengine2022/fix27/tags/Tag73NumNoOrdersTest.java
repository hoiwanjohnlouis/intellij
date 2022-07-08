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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  73
 *  NoOrders
 *  NumInGroup
 *  <p></p>
 *  Indicates number of orders to be combined for average pricing and allocation.
 */
class Tag73NumNoOrdersTest {
    @Test
    void PrintFIXTagTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag73NumNoOrders tagData ) {
        assertEquals( "FIX73_NUM_NO_ORDERS", tagData.toEnumLabelString());
        assertEquals( "NO_ORDERS", tagData.toEnumNameString());
        assertEquals( "73", tagData.toEnumIDString());
        assertEquals( "NoOrders", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 24601;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag73NumNoOrders tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( Tag73NumNoOrders tagData, int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag73NumNoOrders tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag73NumNoOrders tagData;
        int oneElement;

        oneElement = Tag73NumNoOrders.TESTA_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag73NumNoOrders.TESTB_NUM_NO_ORDERS;
        tagData = new Tag73NumNoOrders(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag73NumNoOrders tagData, final int oneElement ) {
        assertEquals( "Tag73NumNoOrders\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}