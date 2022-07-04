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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  631
 *  MidPx
 *  Price
 *  <p>
 *  Mid price/rate
 */
class Tag631PrcMidPxTest {
    @Test
    void FIX0631Test() {
        FIX43 fixData = FIX43.FIX631_PRC_MID_PX;
        assertEquals( "631", fixData.toEnumIDString());
        assertEquals( "MID_PX", fixData.toEnumNameString());
        assertEquals( "MidPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0631Test() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTA_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag631PrcMidPx.TESTB_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTA_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag631PrcMidPx.TESTB_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTB_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTB_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTB_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag631PrcMidPx tagData;
        double oneElement;

        oneElement = Tag631PrcMidPx.TESTA_PRC_MID_PX;
        tagData = new Tag631PrcMidPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag631PrcMidPx\n" +
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