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
 *  260
 *  BasisFeaturePrice
 *  Price
 *  <p>
 *  Price for BasisFeatureDate.
 *  <p>
 *  See BasisFeatureDate (259)
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag260PrcBasisFeaturePriceTest {
    @Test
    void FIX0260Test() {
        FIX42 fixData = FIX42.FIX260_PRC_BASIS_FEATURE_PRICE;
        assertEquals( "260", fixData.toEnumIDString());
        assertEquals( "BASIS_FEATURE_PRICE", fixData.toEnumNameString());
        assertEquals( "BasisFeaturePrice", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0260Test() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        tagData = new Tag260PrcBasisFeaturePrice(new MyPriceType(
                Tag260PrcBasisFeaturePrice.TESTA_PRC_BASIS_FEATURE_PRICE));
        assertEquals( Tag260PrcBasisFeaturePrice.TESTA_PRC_BASIS_FEATURE_PRICE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag260PrcBasisFeaturePrice(new MyPriceType(
                Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE));
        assertEquals( Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTA_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTA_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        assertEquals( "Tag260PrcBasisFeaturePrice\n" +
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