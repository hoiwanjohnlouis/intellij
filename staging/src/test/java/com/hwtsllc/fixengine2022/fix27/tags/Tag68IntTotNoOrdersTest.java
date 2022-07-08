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

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  68
 *  TotNoOrders
 *  int
 *  <p></p>
 *  Total number of list order entries across all messages.
 *  <p></p>
 *  Should be the sum of all NoOrders (73) in each message that has
 *  repeating list order entries related to the same ListID (66).
 *  <p></p>
 *  Used to support fragmentation.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was named "ListNoOrds")
 */
class Tag68IntTotNoOrdersTest {
    @Test
    void PrintFIXTagTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag68IntTotNoOrders tagData ) {
        assertEquals( "FIX68_INT_TOT_NO_ORDERS", tagData.toEnumLabelString());
        assertEquals( "TOT_NO_ORDERS", tagData.toEnumNameString());
        assertEquals( "68", tagData.toEnumIDString());
        assertEquals( "TotNoOrders (formerly named: ListNoOrds)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 123;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag68IntTotNoOrders tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag68IntTotNoOrders tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag68IntTotNoOrders tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag68IntTotNoOrders tagData;
        int oneElement;

        oneElement = Tag68IntTotNoOrders.TESTA_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag68IntTotNoOrders.TESTB_INT_TOT_NO_ORDERS;
        tagData = new Tag68IntTotNoOrders(new MyIntType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag68IntTotNoOrders tagData, final int oneElement ) {
        assertEquals( "Tag68IntTotNoOrders\n" +
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