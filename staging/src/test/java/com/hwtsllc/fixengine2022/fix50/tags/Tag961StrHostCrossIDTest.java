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
 *  961
 *  HostCrossID
 *  String
 *  <p>
 *  Host assigned entity ID that can be used to reference all components of a cross;
 *  sides + strategy + legs.
 *  <p>
 *  Used as the primary key with which to refer to the Cross Order for cancellation and replace.
 *  <p>
 *  The HostCrossID will also be used to link together components of the Cross Order.
 *  <p>
 *  i.e. each individual Execution Report associated with the order will carry
 *  HostCrossID in order to tie back to the original cross order.
 */
class Tag961StrHostCrossIDTest {
    @Test
    void FIX0961Test() {
        FIX50 fixData = FIX50.FIX961_STR_HOST_CROSS_ID;
        assertEquals( "961", fixData.toFIXIDString());
        assertEquals( "HOST_CROSS_ID", fixData.toFIXNameString());
        assertEquals( "HostCrossID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0961Test() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = "Chloe Kim";
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag961StrHostCrossID.TESTA_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag961StrHostCrossID.TESTB_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = Tag961StrHostCrossID.TESTA_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag961StrHostCrossID.TESTB_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = Tag961StrHostCrossID.TESTB_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = Tag961StrHostCrossID.TESTB_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = Tag961StrHostCrossID.TESTB_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag961StrHostCrossID tagData;
        String oneElement;

        oneElement = Tag961StrHostCrossID.TESTA_STR_HOST_CROSS_ID;
        tagData = new Tag961StrHostCrossID( new MyStringType( oneElement ) );
        assertEquals( "Tag961StrHostCrossID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}