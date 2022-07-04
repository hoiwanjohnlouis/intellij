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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  535
 *  AffectedOrderID
 *  String
 *  <p>
 *  OrderID (37) of an order affected by a mass cancel request.
 */
class Tag535StrAffectedOrderIDTest {
    @Test
    void FIX0535Test() {
        FIX43 fixData = FIX43.FIX535_STR_AFFECTED_ORDER_ID;
        assertEquals( "535", fixData.toEnumIDString());
        assertEquals( "AFFECTED_ORDER_ID", fixData.toEnumNameString());
        assertEquals( "AffectedOrderID", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0535Test() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTA_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag535StrAffectedOrderID.TESTB_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTA_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag535StrAffectedOrderID.TESTB_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTB_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTB_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTB_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag535StrAffectedOrderID tagData;
        String oneElement;

        oneElement = Tag535StrAffectedOrderID.TESTA_STR_AFFECTED_ORDER_ID;
        tagData = new Tag535StrAffectedOrderID( new MyStringType( oneElement ) );
        assertEquals( "Tag535StrAffectedOrderID\n" +
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