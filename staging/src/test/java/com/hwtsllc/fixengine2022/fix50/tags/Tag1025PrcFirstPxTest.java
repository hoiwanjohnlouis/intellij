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
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1025
 *  FirstPx
 *  Price
 *  <p>
 *  Indicates the first trade price of the day/session
 */
class Tag1025PrcFirstPxTest {
    @Test
    void FIX1025Test() {
        FIX50 fixData = FIX50.FIX1025_PRC_FIRST_PX;
        assertEquals( "1025", fixData.toEnumIDString());
        assertEquals( "FIRST_PX", fixData.toEnumNameString());
        assertEquals( "FirstPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1025Test() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTA_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag1025PrcFirstPx.TESTB_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTA_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1025PrcFirstPx.TESTB_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTB_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTB_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTB_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1025PrcFirstPx tagData;
        double oneElement;

        oneElement = Tag1025PrcFirstPx.TESTA_PRC_FIRST_PX;
        tagData = new Tag1025PrcFirstPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag1025PrcFirstPx\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}