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
import com.hwtsllc.fixengine2022.fix43.enums.Enum547MDImplicitDelete;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  547
 *  MDImplicitDelete
 *  Boolean
 *  <p>
 *  Defines how a server handles distribution of a truncated book.  Defaults to broker option.
 *  <p>
 *  Valid values:
 *  <p>    N - Server must send an explicit delete for bids or offers
 *          falling outside the requested MarketDepth of the request
 *  <p>    Y - Client has responsibility for implicitly deleting bids
 *          or offers falling outside the MarketDepth of the request
 */
class Tag547EnuMDImplicitDeleteTest {
    @Test
    void FIX0547Test() {
        FIX43 fixData = FIX43.FIX547_ENU_MD_IMPLICIT_DELETE;
        assertEquals( "547", fixData.toFIXIDString());
        assertEquals( "MD_IMPLICIT_DELETE", fixData.toFIXNameString());
        assertEquals( "MDImplicitDelete", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0547Test() {
        Tag547EnuMDImplicitDelete tagData;

        tagData = new Tag547EnuMDImplicitDelete( Enum547MDImplicitDelete.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag547EnuMDImplicitDelete(Enum547MDImplicitDelete.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag547EnuMDImplicitDelete tagData;

        // loop around the ENUM and process
        for ( Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag547EnuMDImplicitDelete tagData;

        // loop around the ENUM and process
        for (Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag547EnuMDImplicitDelete tagData;

        // loop around the ENUM and process
        for (Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag547EnuMDImplicitDelete tagData;

        // loop around the ENUM and process
        for (Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag547EnuMDImplicitDelete tagData;

        // loop around the ENUM and process
        for (Enum547MDImplicitDelete oneEnum : Enum547MDImplicitDelete.values()) {
            tagData = new Tag547EnuMDImplicitDelete(oneEnum);
            assertEquals( "Tag547EnuMDImplicitDelete\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}