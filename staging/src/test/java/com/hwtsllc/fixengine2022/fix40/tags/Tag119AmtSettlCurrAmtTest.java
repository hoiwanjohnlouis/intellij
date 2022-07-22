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

import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  119
 *  SettlCurrAmt
 *  Amt
 *  <p></p>
 *  Total amount due expressed in settlement currency
 *  (includes the effect of the forex transaction)
 */
class Tag119AmtSettlCurrAmtTest {
    @Test
    void PrintFIXTagTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag119AmtSettlCurrAmt tagData ) {
        assertEquals( "FIX119_AMT_SETTL_CURR_AMT", tagData.toEnumLabelString());
        assertEquals( "SETTL_CURR_AMT", tagData.toEnumNameString());
        assertEquals( "119", tagData.toEnumIDString());
        assertEquals( "SettlCurrAmt", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag119AmtSettlCurrAmt tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag119AmtSettlCurrAmt tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag119AmtSettlCurrAmt tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag119AmtSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag119AmtSettlCurrAmt.TESTA_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag119AmtSettlCurrAmt.TESTB_AMT_SETTL_CURR_AMT;
        tagData = new Tag119AmtSettlCurrAmt(new MyAmtType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag119AmtSettlCurrAmt tagData ) {
        assertEquals( "Tag119AmtSettlCurrAmt\n" +
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