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
import com.hwtsllc.fixengine2022.fix43.enums.Enum575OddLot;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  575
 *  OddLot
 *  Boolean
 *  <p>
 *  Deprecated in FIX.5.0 This trade is to be treated as an odd lot
 *  <p>
 *  If this field is not specified, the default will be "N"
 *  <p>
 *  Valid values:
 *  <p>    N - Treat as round lot (default)
 *  <p>    Y - Treat as odd lot
 */
class Tag575EnuOddLotTest {
    @Test
    void FIX0575Test() {
        FIX43 fixData = FIX43.FIX575_ENU_ODD_LOT;
        assertEquals( "575", fixData.toFIXIDString());
        assertEquals( "ODD_LOT", fixData.toFIXNameString());
        assertEquals( "OddLot", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0575Test() {
        Tag575EnuOddLot tagData;

        tagData = new Tag575EnuOddLot( Enum575OddLot.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag575EnuOddLot(Enum575OddLot.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}