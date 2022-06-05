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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag534IntNoAffectedOrders;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  534
 *  NoAffectedOrders
 *  int
 *  <p>
 *  Number of affected orders in the repeating group of order ids.
 */
class Tag534IntNoAffectedOrdersTest {
    @Test
    void FIX0534Test() {
        FIX43 fixData = FIX43.FIX534_INT_NO_AFFECTED_ORDERS;
        assertEquals( "534", fixData.toFIXIDString());
        assertEquals( "NO_AFFECTED_ORDERS", fixData.toFIXNameString());
        assertEquals( "NoAffectedOrders", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0534Test() {
        Tag534IntNoAffectedOrders tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag534IntNoAffectedOrders tagData;
        int oneElement;

        oneElement = Tag534IntNoAffectedOrders.TESTA_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag534IntNoAffectedOrders.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag534IntNoAffectedOrders tagData;
        int oneElement;

        oneElement = Tag534IntNoAffectedOrders.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag534IntNoAffectedOrders tagData;
        int oneElement;

        oneElement = Tag534IntNoAffectedOrders.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag534IntNoAffectedOrders tagData;
        int oneElement;

        oneElement = Tag534IntNoAffectedOrders.TESTB_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag534IntNoAffectedOrders tagData;
        int oneElement;

        oneElement = Tag534IntNoAffectedOrders.TESTA_INT_LIQUIDITY_NUM_SECURITIES;
        tagData = new Tag534IntNoAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( "Tag534IntNoAffectedOrders\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}