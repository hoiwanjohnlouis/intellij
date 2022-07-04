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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  533
 *  TotalAffectedOrders
 *  int
 *  <p>
 *  Total number of orders affected by mass cancel request.
 */
class Tag533IntTotalAffectedOrdersTest {
    @Test
    void FIX0533Test() {
        FIX43 fixData = FIX43.FIX533_INT_TOTAL_AFFECTED_ORDERS;
        assertEquals( "533", fixData.toEnumIDString());
        assertEquals( "TOTAL_AFFECTED_ORDERS", fixData.toEnumNameString());
        assertEquals( "TotalAffectedOrders", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0533Test() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTA_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag533IntTotalAffectedOrders.TESTB_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTA_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag533IntTotalAffectedOrders.TESTB_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTB_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTB_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTB_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag533IntTotalAffectedOrders tagData;
        int oneElement;

        oneElement = Tag533IntTotalAffectedOrders.TESTA_INT_TOTAL_AFFECTED_ORDERS;
        tagData = new Tag533IntTotalAffectedOrders( new MyIntType( oneElement ) );
        assertEquals( "Tag533IntTotalAffectedOrders\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}