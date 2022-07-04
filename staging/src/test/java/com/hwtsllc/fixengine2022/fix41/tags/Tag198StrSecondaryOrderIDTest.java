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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  198
 *  SecondaryOrderID
 *  String
 *  <p>
 *  Assigned by the party which accepts the order.
 *  Can be used to provide the OrderID (37) used by an exchange or executing system.
 */
class Tag198StrSecondaryOrderIDTest {
    @Test
    void FIX0198Test() {
        FIX41 fixData = FIX41.FIX198_STR_SECONDARY_ORDER_ID;
        assertEquals( "198", fixData.toEnumIDString());
        assertEquals( "SECONDARY_ORDER_ID", fixData.toEnumNameString());
        assertEquals( "SecondaryOrderID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0198Test() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID));
        assertEquals( "Tag198StrSecondaryOrderID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}