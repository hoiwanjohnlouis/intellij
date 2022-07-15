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

import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  191
 *  OfferForwardPoints
 *  PriceOffset
 *  <p></p>
 *  Offer F/X forward points added to spot rate. May be a negative value.
 */
class Tag191PxoOfferForwardPointsTest {
    @Test
    void PrintTest() {
        Tag191PxoOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS;
        tagData = new Tag191PxoOfferForwardPoints( new MyPriceOffsetType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS;
        tagData = new Tag191PxoOfferForwardPoints( new MyPriceOffsetType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag191PxoOfferForwardPoints tagData;
        double oneElement;

        oneElement = Tag191PxoOfferForwardPoints.TESTA_PXO_OFFER_FORWARD_POINTS;
        tagData = new Tag191PxoOfferForwardPoints( new MyPriceOffsetType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );

        oneElement = Tag191PxoOfferForwardPoints.TESTB_PXO_OFFER_FORWARD_POINTS;
        tagData = new Tag191PxoOfferForwardPoints( new MyPriceOffsetType( oneElement ));
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag191PxoOfferForwardPoints tagData ) {
        assertEquals( "FIX191_PXO_OFFER_FORWARD_POINTS", tagData.toEnumLabelString());
        assertEquals( "191", tagData.toEnumIDString());
        assertEquals( "OFFER_FORWARD_POINTS", tagData.toEnumNameString());
        assertEquals( "OfferForwardPoints", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag191PxoOfferForwardPoints tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag191PxoOfferForwardPoints tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag191PxoOfferForwardPoints tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag191PxoOfferForwardPoints tagData ) {
        assertEquals( "Tag191PxoOfferForwardPoints\n" +
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