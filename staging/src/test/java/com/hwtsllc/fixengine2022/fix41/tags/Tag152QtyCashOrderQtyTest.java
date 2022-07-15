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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  152
 *  CashOrderQty
 *  Qty
 *  <p></p>
 *  Specifies the approximate order quantity desired in
 *  total monetary units vs. as tradeable units (e.g. number of shares).
 *  <p></p>
 *  The broker or fund manager (for CIV orders) would be responsible for
 *  converting and calculating a tradeable unit (e.g. share) quantity (OrderQty (38))
 *  based upon this amount to be used for the actual order and subsequent messages.
 */
class Tag152QtyCashOrderQtyTest {
    @Test
    void PrintTest() {
        Tag152QtyCashOrderQty tagData;
        int oneElement;

        oneElement = Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY;
        tagData = new Tag152QtyCashOrderQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY;
        tagData = new Tag152QtyCashOrderQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag152QtyCashOrderQty tagData;
        int oneElement;

        oneElement = Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY;
        tagData = new Tag152QtyCashOrderQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY;
        tagData = new Tag152QtyCashOrderQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag152QtyCashOrderQty tagData ) {
        assertEquals( "FIX152_QTY_CASH_ORDER_QTY", tagData.toEnumLabelString());
        assertEquals( "152", tagData.toEnumIDString());
        assertEquals( "CASH_ORDER_QTY", tagData.toEnumNameString());
        assertEquals( "CashOrderQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag152QtyCashOrderQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag152QtyCashOrderQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag152QtyCashOrderQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag152QtyCashOrderQty tagData ) {
        assertEquals( "Tag152QtyCashOrderQty\n" +
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