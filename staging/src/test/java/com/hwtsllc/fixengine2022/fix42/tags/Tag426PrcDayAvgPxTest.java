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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  426
 *  DayAvgPx
 *  Price
 *  <p>
 *  The average price for quantity on a GT order that has traded today.
 */
class Tag426PrcDayAvgPxTest {
    @Test
    void FIX0426Test() {
        FIX42 fixData = FIX42.FIX426_PRC_DAY_AVG_PX;
        assertEquals( "426", fixData.toEnumIDString());
        assertEquals( "DAY_AVG_PX", fixData.toEnumNameString());
        assertEquals( "DayAvgPx", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0426Test() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTA_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTA_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTB_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag426PrcDayAvgPx tagData;
        double oneElement;

        oneElement = Tag426PrcDayAvgPx.TESTA_PRC_DAY_AVG_PX;
        tagData = new Tag426PrcDayAvgPx( new MyPriceType( oneElement ) );
        assertEquals( "Tag426PrcDayAvgPx\n" +
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