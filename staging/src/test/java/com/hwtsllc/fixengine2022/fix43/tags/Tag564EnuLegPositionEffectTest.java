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
import com.hwtsllc.fixengine2022.datatypes.MyEnumPositionEffect;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  77 (Same for TAGS 77, 564, 1047, )
 *  PositionEffect
 *  char
 *  <p>
 *  Indicates whether the resulting position after a trade
 *  should be an opening position or closing position.
 *  <p>
 *  Used for omnibus accounting - where accounts are held
 *  on a gross basis instead of being netted together.
 *  <p></p>
 *  564
 *  LegPositionEffect
 *  char
 *  <p>
 *  PositionEffect for leg of a multileg
 *  <p>
 *  See PositionEffect (77) field for description
 *  <p></p>
 *  1047
 *  AllocPositionEffect
 *  char
 *  <p>
 *  Indicates whether the resulting position after a trade should be an opening position or closing position.
 *  <p>
 *  Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.
 *  <p></p>
 *  Valid values:
 *  <p>    C - Close
 *  <p>    F - FIFO
 *  <p>    O - Open
 *  <p>    R - Rolled
 */
class Tag564EnuLegPositionEffectTest {
    @Test
    void FIX0564Test() {
        FIX43 fixData = FIX43.FIX564_ENU_LEG_POSITION_EFFECT;
        assertEquals( "564", fixData.getID());
        assertEquals( "LEG_POSITION_EFFECT", fixData.getName());
        assertEquals( "LegPositionEffect", fixData.getDescription());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Information is the same for TAGS 77, 564
     */
    @Test
    void Tag0564Test() {
        Log564EnuLegPositionEffect tagData;

        /*
         * O, F, C, and R PositionEffect types
         */
        tagData = new Log564EnuLegPositionEffect(MyEnumPositionEffect.OPEN);
        assertEquals( "O", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Log564EnuLegPositionEffect(MyEnumPositionEffect.FIFO);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Log564EnuLegPositionEffect(MyEnumPositionEffect.CLOSE);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Log564EnuLegPositionEffect(MyEnumPositionEffect.ROLLED);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals(MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}