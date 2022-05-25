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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  228
 *  Factor
 *  float
 *  <p></p>
 *  For Fixed Income: Amorization Factor for deriving Current face from Original face for
 *  ABS or MBS securities, note the fraction may be greater than, equal to or less than .
 *  <p></p>
 *  In TIPS securities this is the Inflation index.
 *  <p>
 *  Qty * Factor * Price = Gross Trade Amount
 *  <p></p>
 *  For Derivatives: Contract Value Factor by which price must be adjusted
 *  to determine the true nominal value of one futures/options contract.
 *  <p>
 *  (Qty * Price) * Factor = Nominal Value
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag228FloFactorTest {
    @Test
    void FIX0228Test() {
        FIX42 fixData = FIX42.FIX228_FLO_FACTOR;
        assertEquals( "228", fixData.toFIXIDString());
        assertEquals( "FACTOR", fixData.toFIXNameString());
        assertEquals( "Factor", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0228Test() {
        Tag228FloFactor tagData;

        tagData = new Tag228FloFactor(new MyFloatType(
                Tag228FloFactor.TESTA_FLO_FACTOR));
        assertEquals( Tag228FloFactor.TESTA_FLO_FACTOR,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag228FloFactor(new MyFloatType(
                Tag228FloFactor.TESTB_FLO_FACTOR));
        assertEquals( Tag228FloFactor.TESTB_FLO_FACTOR,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
    }
}