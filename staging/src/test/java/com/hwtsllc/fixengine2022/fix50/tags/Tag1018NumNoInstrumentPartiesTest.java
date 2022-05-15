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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1018
 *  NoInstrumentParties
 *  NumInGroup
 *  <p>
 *  Identifies the number of parties identified with an instrument
 */
class Tag1018NumNoInstrumentPartiesTest {
    @Test
    void FIX1018Test() {
        FIX50 fixData = FIX50.FIX1018_NUM_NO_INSTRUMENT_PARTIES;
        assertEquals( "1018", fixData.getID());
        assertEquals( "NO_INSTRUMENT_PARTIES", fixData.getName());
        assertEquals( "NoInstrumentParties", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1018Test() {
        Tag1018NumNoInstrumentParties tagData;

        tagData = new Tag1018NumNoInstrumentParties(
                new MyNumInGroupType( Tag1018NumNoInstrumentParties.TESTA_NUM_NO_INSTRUMENT_PARTIES ));
        assertEquals( Tag1018NumNoInstrumentParties.TESTA_NUM_NO_INSTRUMENT_PARTIES, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1018NumNoInstrumentParties(
                new MyNumInGroupType( Tag1018NumNoInstrumentParties.TESTB_NUM_NO_INSTRUMENT_PARTIES ));
        assertEquals( Tag1018NumNoInstrumentParties.TESTB_NUM_NO_INSTRUMENT_PARTIES, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}