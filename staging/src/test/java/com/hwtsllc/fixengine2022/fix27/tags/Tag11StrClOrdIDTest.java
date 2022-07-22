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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  11
 *  ClOrdID
 *  String
 *  <p></p>
 *  Unique identifier for Order as assigned by the buy-side
 *  <p></p>
 *  (institution, broker, intermediary  etc.)
 *  <p></p>
 *  (identified by SenderCompID (49) or OnBehalfOfCompID (5) as appropriate).
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day.
 *  <p></p>
 *  Firms, particularly those  which electronically submit multi-day orders,
 *  trade globally or throughout market close periods, should ensure uniqueness
 *  across days, for example by embedding a date within the ClOrdID field.
 */
class Tag11StrClOrdIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyFIXData( tagData );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag11StrClOrdID tagData ) {
        assertEquals( "FIX11_STR_CL_ORD_ID", tagData.toEnumLabelString());
        assertEquals( "CL_ORD_ID", tagData.toEnumNameString());
        assertEquals( "11", tagData.toEnumIDString());
        assertEquals( "ClOrdID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag11StrClOrdID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag11StrClOrdID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag11StrClOrdID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag11StrClOrdID tagData;
        String oneElement;

        oneElement = Tag11StrClOrdID.TESTA_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag11StrClOrdID.TESTB_STR_CL_ORD_ID;
        tagData = new Tag11StrClOrdID(new MyStringType( oneElement ) );
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag11StrClOrdID tagData, final String oneElement ) {
        assertEquals( "Tag11StrClOrdID\n" +
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