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

import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  193
 *  SettlDate2
 *  LocalMktDate
 *  <p></p>
 *  Deprecated in FIX.5.0 SettDate (64) of the future part of a F/X swap order.
 */
// @Deprecated
class Tag193LmdSettlDate2Test {
    @Test
    void PrintTest() {
        Tag193LmdSettlDate2 tagData;
        String oneElement;

        oneElement = Tag193LmdSettlDate2.TESTA_LMD_SETTL_DATE_2;
        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag193LmdSettlDate2.TESTB_LMD_SETTL_DATE_2;
        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag193LmdSettlDate2 tagData;
        String oneElement;

        oneElement = Tag193LmdSettlDate2.TESTA_LMD_SETTL_DATE_2;
        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag193LmdSettlDate2.TESTB_LMD_SETTL_DATE_2;
        tagData = new Tag193LmdSettlDate2(new MyLocalMktDateType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag193LmdSettlDate2 tagData ) {
        assertEquals( "FIX193_LMD_SETTL_DATE_2", tagData.toEnumLabelString());
        assertEquals( "193", tagData.toEnumIDString());
        assertEquals( "SETTL_DATE_2", tagData.toEnumNameString());
        assertEquals( "SettlDate2", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag193LmdSettlDate2 tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag193LmdSettlDate2 tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag193LmdSettlDate2 tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag193LmdSettlDate2 tagData ) {
        assertEquals( "Tag193LmdSettlDate2\n" +
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