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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1040
 *  SecondaryTradeID
 *  String
 *  <p>
 *  Used to carry  an internal trade entity ID which may or may not be reported to the firm
 */
class Tag1040StrSecondaryTradeIDTest {
    @Test
    void FIX1040Test() {
        FIX50 fixData = FIX50.FIX1040_STR_SECONDARY_TRADE_ID;
        assertEquals( "1040", fixData.toEnumIDString());
        assertEquals( "SECONDARY_TRADE_ID", fixData.toEnumNameString());
        assertEquals( "SecondaryTradeID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1040Test() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType(oneElement) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1040StrSecondaryTradeID.TESTA_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1040StrSecondaryTradeID.TESTB_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = Tag1040StrSecondaryTradeID.TESTA_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1040StrSecondaryTradeID.TESTB_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = Tag1040StrSecondaryTradeID.TESTB_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = Tag1040StrSecondaryTradeID.TESTB_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = Tag1040StrSecondaryTradeID.TESTB_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1040StrSecondaryTradeID tagData;
        String oneElement;

        oneElement = Tag1040StrSecondaryTradeID.TESTA_STR_SECONDARY_TRADE_ID;
        tagData = new Tag1040StrSecondaryTradeID( new MyStringType( oneElement ) );
        assertEquals( "Tag1040StrSecondaryTradeID\n" +
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