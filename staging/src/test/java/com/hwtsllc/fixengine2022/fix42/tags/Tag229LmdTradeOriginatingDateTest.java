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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  229
 *  TradeOriginationDate
 *  LocalMktDate
 *  <p>
 *  Used with Fixed Income for Muncipal New Issue Market.
 *  <p>
 *  Agreement in principal between counter-parties prior to actual trade date.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag229LmdTradeOriginatingDateTest {
    @Test
    void FIX0229Test() {
        FIX42 fixData = FIX42.FIX229_LMD_TRADE_ORIGINATION_DATE;
        assertEquals( "229", fixData.toFIXIDString());
        assertEquals( "TRADE_ORIGINATION_DATE", fixData.toFIXNameString());
        assertEquals( "TradeOriginationDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0229Test() {
        Tag229LmdTradeOriginatingDate tagData;

        tagData = new Tag229LmdTradeOriginatingDate(new MyLocalMktDateType(
                Tag229LmdTradeOriginatingDate.TESTA_LMD_TRADE_ORIGINATION_DATE));
        assertEquals( Tag229LmdTradeOriginatingDate.TESTA_LMD_TRADE_ORIGINATION_DATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag229LmdTradeOriginatingDate(new MyLocalMktDateType(
                Tag229LmdTradeOriginatingDate.TESTB_LMD_TRADE_ORIGINATION_DATE));
        assertEquals( Tag229LmdTradeOriginatingDate.TESTB_LMD_TRADE_ORIGINATION_DATE,
                tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
}