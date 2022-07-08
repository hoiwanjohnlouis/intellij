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

import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  51
 *  SendingDate  (no longer used)
 *  LocalMktDate
 *  <p></p>
 *  Deprecated in FIX.4.3
 */
// @Deprecated
class Tag51LmdSendingDateTest {
    @Test
    void PrintFIXTagTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag51LmdSendingDate tagData ) {
        assertEquals( "FIX51_LMD_SENDING_DATE", tagData.toEnumLabelString());
        assertEquals( "SENDING_DATE", tagData.toEnumNameString());
        assertEquals( "51", tagData.toEnumIDString());
        assertEquals( "SendingDate (no longer used)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = "20220319 141400";
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag51LmdSendingDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag51LmdSendingDate tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag51LmdSendingDate tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag51LmdSendingDate tagData;
        String oneElement;

        oneElement = Tag51LmdSendingDate.TESTA_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag51LmdSendingDate.TESTB_LMD_SENDING_DATE;
        tagData = new Tag51LmdSendingDate(new MyLocalMktDateType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag51LmdSendingDate tagData, final String oneElement ) {
        assertEquals( "Tag51LmdSendingDate\n" +
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