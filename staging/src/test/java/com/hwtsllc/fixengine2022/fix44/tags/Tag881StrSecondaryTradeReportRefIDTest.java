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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  881
 *  SecondaryTradeReportRefID
 *  String
 *  <p></p>
 *  Deprecated in FIX.5.0
 *  <p></p>
 *  Used to refer to a previous SecondaryTradeReportRefID when amending the transaction
 *  (cancel, replace, release, or reversal).
 */
class Tag881StrSecondaryTradeReportRefIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX881_STR_SECONDARY_TRADE_REPORT_REF_ID;
        assertEquals( "881", fixData.toEnumIDString());
        assertEquals( "SECONDARY_TRADE_REPORT_REF_ID", fixData.toEnumNameString());
        assertEquals( "SecondaryTradeReportRefID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0881Test() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTA_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "881", tagData.toEnumIDString());
        assertEquals( "SECONDARY_TRADE_REPORT_REF_ID", tagData.toEnumNameString());
        assertEquals( "SecondaryTradeReportRefID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTB_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTA_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTB_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTB_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTB_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTB_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag881StrSecondaryTradeReportRefID tagData;
        String oneElement;

        oneElement = Tag881StrSecondaryTradeReportRefID.TESTA_STR_SECONDARY_TRADE_REPORT_REF_ID;
        tagData = new Tag881StrSecondaryTradeReportRefID( new MyStringType( oneElement ) );
        assertEquals( "Tag881StrSecondaryTradeReportRefID\n" +
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