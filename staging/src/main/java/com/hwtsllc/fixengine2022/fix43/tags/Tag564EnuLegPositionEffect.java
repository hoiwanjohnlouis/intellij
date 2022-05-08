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
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPositionEffect;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  77 (Same for TAGS 77, 564,)
 *  PositionEffect
 *  char
 *  Indicates whether the resulting position after a trade
 *  should be an opening position or closing position.
 *  Used for omnibus accounting - where accounts are held
 *  on a gross basis instead of being netted together.
 *
 *  564
 *  LegPositionEffect
 *  char
 *  PositionEffect for leg of a multileg
 *          See PositionEffect (77) field for description
 *
 *  Valid values:
 *      C - Close
 *      F - FIFO
 *      O - Open
 *      R - Rolled
 */
public class Tag564EnuLegPositionEffect extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumPositionEffect dataValue;

    public final static MyEnumPositionEffect TESTA_ENU_LEG_POSITION_EFFECT
            = MyEnumPositionEffect.CLOSE;
    public final static MyEnumPositionEffect TESTB_ENU_LEG_POSITION_EFFECT
            = MyEnumPositionEffect.FIFO;

    public Tag564EnuLegPositionEffect(MyEnumPositionEffect dataValue) {
        setFixType(FIX43.FIX564_ENU_LEG_POSITION_EFFECT);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag564EnuLegPositionEffect tagData;

        tagData = new Tag564EnuLegPositionEffect(TESTA_ENU_LEG_POSITION_EFFECT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag564EnuLegPositionEffect(TESTB_ENU_LEG_POSITION_EFFECT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
