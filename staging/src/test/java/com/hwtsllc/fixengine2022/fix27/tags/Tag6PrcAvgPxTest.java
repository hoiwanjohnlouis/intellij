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
 *  <p>
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
    Tag6PrcAvgPx tagData;
    double [] TestArray = {
            Tag6PrcAvgPx.TESTA_PRC_AVG_PX,
            Tag6PrcAvgPx.TESTB_PRC_AVG_PX
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            assertEquals( "FIX6_PRC_AVG_PX", tagData.toEnumLabelString());
            assertEquals( "AVG_PX", tagData.toEnumNameString());
            assertEquals( "6", tagData.toEnumIDString());
            assertEquals( "AvgPx", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag6PrcAvgPx( new MyPriceType( oneElement ));
            assertEquals( "Tag6PrcAvgPx\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}