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

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  260
 *  BasisFeaturePrice
 *  Price
 *  <p></p>
 *  Price for BasisFeatureDate.
 *  <p></p>
 *  See BasisFeatureDate (259)
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag260PrcBasisFeaturePriceTest {
    @Test
    void PrintTest() {
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
    void FIXTagTest() {
        Tag260PrcBasisFeaturePrice tagData;
        double oneElement;

        oneElement = Tag260PrcBasisFeaturePrice.TESTA_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag260PrcBasisFeaturePrice.TESTB_PRC_BASIS_FEATURE_PRICE;
        tagData = new Tag260PrcBasisFeaturePrice( new MyPriceType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( Tag260PrcBasisFeaturePrice tagData, double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag260PrcBasisFeaturePrice tagData ) {
        assertEquals( "FIX260_PRC_BASIS_FEATURE_PRICE", tagData.toEnumLabelString());
        assertEquals( "260", tagData.toEnumIDString());
        assertEquals( "BASIS_FEATURE_PRICE", tagData.toEnumNameString());
        assertEquals( "BasisFeaturePrice", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag260PrcBasisFeaturePrice tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag260PrcBasisFeaturePrice tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag260PrcBasisFeaturePrice tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag260PrcBasisFeaturePrice tagData ) {
        assertEquals( "Tag260PrcBasisFeaturePrice\n" +
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