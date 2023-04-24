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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  643
 *  OfferForwardPoints2
 *  PriceOffset
 *  <p>
 *  Deprecated in FIX.5.0 Offer F/X forward points of the future portion of a F/X swap quote added to spot rate.
 *  <p>
 *  May be negative.
 */
class Tag643PxoOfferForwardPoints2Test {
    Tag643PxoOfferForwardPoints2 tagData;
    double [] TestArray = {
            Tag643PxoOfferForwardPoints2.TESTA_PXO_OFFER_FORWARD_POINTS_2,
            Tag643PxoOfferForwardPoints2.TESTB_PXO_OFFER_FORWARD_POINTS_2
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag643PxoOfferForwardPoints2( new MyPriceOffsetType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag643PxoOfferForwardPoints2( new MyPriceOffsetType( oneElement ));
            assertEquals( "FIX643_PXO_OFFER_FORWARD_POINTS_2", tagData.toFIXLabelString());
            assertEquals( "643", tagData.toFIXIDString());
            assertEquals( "OFFER_FORWARD_POINTS_2", tagData.toFIXNameString());
            assertEquals( "OfferForwardPoints2", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag643PxoOfferForwardPoints2( new MyPriceOffsetType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  641
         *  LastForwardPoints2
         *  PriceOffset
         */

        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag643PxoOfferForwardPoints2( new MyPriceOffsetType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag643PxoOfferForwardPoints2( new MyPriceOffsetType( oneElement ));
            assertEquals( "Tag643PxoOfferForwardPoints2\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}