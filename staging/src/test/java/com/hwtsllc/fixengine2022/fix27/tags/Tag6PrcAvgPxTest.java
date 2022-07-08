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

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  6
 *  AvgPx
 *  Price
 *  <p></p>
 *  Calculated average price of all fills on this order.
 *  <p></p>
 *  For Fixed Income trades AvgPx is always expressed as percent-of-par,
 *  regardless of the PriceType (423) of LastPx (31).
 *  <p></p>
 *  i.e., AvgPx will contain an average of percent-of-par values
 *  <p></p>
 *  (see LastParPx (669)) for issues traded in Yield, Spread or Discount.
 */
class Tag6PrcAvgPxTest {
    @Test
    void PrintFIXTagTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag6PrcAvgPx tagData ) {
        assertEquals( "FIX6_PRC_AVG_PX", tagData.toEnumLabelString());
        assertEquals( "AVG_PX", tagData.toEnumNameString());
        assertEquals( "6", tagData.toEnumIDString());
        assertEquals( "AvgPx", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag6PrcAvgPx tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag6PrcAvgPx tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag6PrcAvgPx tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag6PrcAvgPx tagData;
        double oneElement;

        oneElement = Tag6PrcAvgPx.TESTA_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag6PrcAvgPx.TESTB_PRC_AVG_PX;
        tagData = new Tag6PrcAvgPx(new MyPriceType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag6PrcAvgPx tagData, final double oneElement ) {
        assertEquals( "Tag6PrcAvgPx\n" +
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