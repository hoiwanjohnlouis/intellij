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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  37
 *  OrderID
 *  String
 *  Unique identifier for Order as assigned by sell-side (broker, exchange, ECN).
 *  Uniqueness must be guaranteed within a single trading day.
 *  Firms which accept multi-day orders should consider
 *  embedding a date within the OrderID field to assure uniqueness across days.
 */
class Tag37StrOrderIDTest {
    @Test
    void FIX0037Test() {
        FIX27 fixData = FIX27.FIX37_STR_ORDER_ID;
        assertEquals( "ORDER_ID", fixData.toFIXNameString());
        assertEquals( "37", fixData.toFIXIDString());
        assertEquals( "OrderID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0037Test() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType("ORD-24601") );
        assertEquals( "ORD-24601", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType(Tag37StrOrderID.TESTB_STR_ORDER_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType(Tag37StrOrderID.TESTB_STR_ORDER_ID));
        assertEquals( Tag37StrOrderID.TESTB_STR_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType(Tag37StrOrderID.TESTB_STR_ORDER_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag37StrOrderID.TESTB_STR_ORDER_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType(Tag37StrOrderID.TESTB_STR_ORDER_ID));
        assertEquals( Tag37StrOrderID.TESTB_STR_ORDER_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag37StrOrderID tagData;

        tagData = new Tag37StrOrderID(new MyStringType(Tag37StrOrderID.TESTA_STR_ORDER_ID));
        assertEquals( "Tag37StrOrderID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag37StrOrderID.TESTA_STR_ORDER_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag37StrOrderID.TESTA_STR_ORDER_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}