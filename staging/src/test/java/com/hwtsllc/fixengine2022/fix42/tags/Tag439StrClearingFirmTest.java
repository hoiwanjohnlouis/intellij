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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  439
 *  ClearingFirm
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.2 Firm that will clear the trade.
 *  <p></p>
 *  Used if different from the executing firm.
 */
// @Deprecated
class Tag439StrClearingFirmTest {
    @Test
    void PrintTest() {
        Tag439StrClearingFirm tagData;
        String oneElement;

        oneElement = Tag439StrClearingFirm.TESTA_STR_CLEARING_FIRM;
        tagData = new Tag439StrClearingFirm( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag439StrClearingFirm.TESTB_STR_CLEARING_FIRM;
        tagData = new Tag439StrClearingFirm( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag439StrClearingFirm tagData;
        String oneElement;

        oneElement = Tag439StrClearingFirm.TESTA_STR_CLEARING_FIRM;
        tagData = new Tag439StrClearingFirm( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag439StrClearingFirm.TESTB_STR_CLEARING_FIRM;
        tagData = new Tag439StrClearingFirm( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag439StrClearingFirm tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag439StrClearingFirm tagData ) {
        assertEquals( "FIX439_STR_CLEARING_FIRM", tagData.toEnumLabelString());
        assertEquals( "439", tagData.toEnumIDString());
        assertEquals( "CLEARING_FIRM", tagData.toEnumNameString());
        assertEquals( "ClearingFirm", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag439StrClearingFirm tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag439StrClearingFirm tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag439StrClearingFirm tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag439StrClearingFirm tagData ) {
        assertEquals( "Tag439StrClearingFirm\n" +
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