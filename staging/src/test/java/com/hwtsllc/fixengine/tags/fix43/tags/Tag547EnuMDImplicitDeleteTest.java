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

import com.hwtsllc.fixengine.tags.fix43.enums.Enum547MDImplicitDelete;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag547EnuMDImplicitDeleteTest {
    Tag547EnuMDImplicitDelete tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( "FIX547_ENU_MD_IMPLICIT_DELETE", tagData.toFIXLabelString());
            assertEquals( "547", tagData.toFIXIDString());
            assertEquals( "MD_IMPLICIT_DELETE", tagData.toFIXNameString());
            assertEquals( "MDImplicitDelete", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  547
         *  MDImplicitDelete
         *  Boolean
         *  <p>    N - Server must send an explicit delete for bids or offers
         *          falling outside the requested MarketDepth of the request
         *  <p>    Y - Client has responsibility for implicitly deleting bids
         *          or offers falling outside the MarketDepth of the request
         */
        tagData = new Tag547EnuMDImplicitDelete( Enum547MDImplicitDelete.NO);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag547EnuMDImplicitDelete(Enum547MDImplicitDelete.YES);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( "Tag547EnuMDImplicitDelete\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}