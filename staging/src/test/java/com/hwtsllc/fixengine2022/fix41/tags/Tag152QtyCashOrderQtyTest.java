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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  152
 *  CashOrderQty
 *  Qty
 *  <p>
 *  Specifies the approximate order quantity desired in
 *  total monetary units vs. as tradeable units (e.g. number of shares).
 *  The broker or fund manager (for CIV orders) would be responsible for
 *  converting and calculating a tradeable unit (e.g. share) quantity (OrderQty (38))
 *  based upon this amount to be used for the actual order and subsequent messages.
 */
class Tag152QtyCashOrderQtyTest {
    @Test
    void FIX0152Test() {
        FIX41 fixData = FIX41.FIX152_QTY_CASH_ORDER_QTY;
        assertEquals( "152", fixData.toEnumIDString());
        assertEquals( "CASH_ORDER_QTY", fixData.toEnumNameString());
        assertEquals( "CashOrderQty", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0152Test() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY));
        assertEquals( Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        assertEquals( Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        assertEquals( Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        assertEquals( tagData.toEnumIDString() + "=" + Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY));
        assertEquals( String.valueOf(Tag152QtyCashOrderQty.TESTB_QTY_CASH_ORDER_QTY),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag152QtyCashOrderQty tagData;

        tagData = new Tag152QtyCashOrderQty(new MyQtyType(Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY));
        assertEquals( "Tag152QtyCashOrderQty\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag152QtyCashOrderQty.TESTA_QTY_CASH_ORDER_QTY + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}