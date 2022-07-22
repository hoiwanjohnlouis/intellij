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

import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  213
 *  XmlData
 *  data
 *  <p></p>
 *  Actual XML data stream (e.g. FIXML).
 *  <p></p>
 *  See appropriate XML reference (e.g. FIXML).
 *  <p></p>
 *  Note: may contain embedded SOH characters.
 */
class Tag213DatXmlDataTest {
    @Test
    void PrintTest() {
        Tag213DatXmlData tagData;
        String oneElement;

        oneElement = Tag213DatXmlData.TESTA_DAT_XML_DATA;
        tagData = new Tag213DatXmlData( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag213DatXmlData.TESTB_DAT_XML_DATA;
        tagData = new Tag213DatXmlData( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag213DatXmlData tagData;
        String oneElement;

        oneElement = Tag213DatXmlData.TESTA_DAT_XML_DATA;
        tagData = new Tag213DatXmlData( new MyDataType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag213DatXmlData.TESTB_DAT_XML_DATA;
        tagData = new Tag213DatXmlData( new MyDataType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag213DatXmlData tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag213DatXmlData tagData ) {
        assertEquals( "FIX213_DAT_XML_DATA", tagData.toEnumLabelString());
        assertEquals( "213", tagData.toEnumIDString());
        assertEquals( "XML_DATA", tagData.toEnumNameString());
        assertEquals( "XmlData", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag213DatXmlData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag213DatXmlData tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag213DatXmlData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag213DatXmlData tagData ) {
        assertEquals( "Tag213DatXmlData\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}