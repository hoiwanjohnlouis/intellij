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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  145
 *  DeliverToLocationID
 *  String
 *  <p></p>
 *  Assigned value used to identify specific message recipient’s location
 *  (i.e. geographic location and/or desk, trader) if the message was delivered by a third party
 */
class Tag145StrDeliverToLocationIDTest {
    @Test
    void PrintFIXTagTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void FIXTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag145StrDeliverToLocationID tagData ) {
        assertEquals( "FIX145_STR_DELIVER_TO_LOCATION_ID", tagData.toEnumLabelString());
        assertEquals( "145", tagData.toEnumIDString());
        assertEquals( "DELIVER_TO_LOCATION_ID", tagData.toEnumNameString());
        assertEquals( "DeliverToLocationID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag145StrDeliverToLocationID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag145StrDeliverToLocationID tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag145StrDeliverToLocationID tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag145StrDeliverToLocationID tagData;
        String oneElement;

        oneElement = Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag145StrDeliverToLocationID.TESTB_STR_DELIVER_TO_LOCATION_ID;
        tagData = new Tag145StrDeliverToLocationID( new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag145StrDeliverToLocationID tagData ) {
        assertEquals( "Tag145StrDeliverToLocationID\n" +
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