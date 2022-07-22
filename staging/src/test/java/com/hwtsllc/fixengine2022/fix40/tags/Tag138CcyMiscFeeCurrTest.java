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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  138
 *  MiscFeeCurr
 *  Currency
 *  <p></p>
 *  Currency of miscellaneous fee
 */
class Tag138CcyMiscFeeCurrTest {
    @Test
    void PrintTest() {
        Tag138CcyMiscFeeCurr tagData;
        String oneElement;

        oneElement = Tag138CcyMiscFeeCurr.TESTA_CCY_MISC_FEE_CURR;
        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR;
        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag138CcyMiscFeeCurr tagData;
        String oneElement;

        oneElement = Tag138CcyMiscFeeCurr.TESTA_CCY_MISC_FEE_CURR;
        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType( oneElement ));
        verifyAll( tagData, oneElement );

        oneElement = Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR;
        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag138CcyMiscFeeCurr tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag138CcyMiscFeeCurr tagData ) {
        assertEquals( "FIX138_CCY_MISC_FEE_CURR", tagData.toEnumLabelString());
        assertEquals( "MISC_FEE_CURR", tagData.toEnumNameString());
        assertEquals( "138", tagData.toEnumIDString());
        assertEquals( "MiscFeeCurr", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag138CcyMiscFeeCurr tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag138CcyMiscFeeCurr tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag138CcyMiscFeeCurr tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag138CcyMiscFeeCurr tagData ) {
        assertEquals( "Tag138CcyMiscFeeCurr\n" +
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