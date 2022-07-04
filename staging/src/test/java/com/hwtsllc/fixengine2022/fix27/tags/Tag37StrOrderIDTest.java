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
 *  <p></p>
 *  Unique identifier for Order as assigned by sell-side (broker, exchange, ECN).
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day.
 *  <p></p>
 *  Firms which accept multi-day orders should consider
 *  embedding a date within the OrderID field to assure uniqueness across days.
 */
class Tag37StrOrderIDTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX37_STR_ORDER_ID;
        assertEquals( "ORDER_ID", fixData.toEnumNameString());
        assertEquals( "37", fixData.toEnumIDString());
        assertEquals( "OrderID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0037Test() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = "ORD-24601";
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag37StrOrderID.TESTA_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );

        oneElement = Tag37StrOrderID.TESTB_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        verifyTagInformation( oneElement, tagData );
    }

    private void verifyTagInformation( String oneElement, Tag37StrOrderID tagData ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "ORDER_ID", tagData.toEnumNameString());
        assertEquals( "37", tagData.toEnumIDString());
        assertEquals( "OrderID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = Tag37StrOrderID.TESTA_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag37StrOrderID.TESTB_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = Tag37StrOrderID.TESTB_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = Tag37StrOrderID.TESTB_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = Tag37StrOrderID.TESTB_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag37StrOrderID tagData;
        String oneElement;

        oneElement = Tag37StrOrderID.TESTA_STR_ORDER_ID;
        tagData = new Tag37StrOrderID(new MyStringType( oneElement ) );
        assertEquals( "Tag37StrOrderID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}