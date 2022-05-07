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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumMoveType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  835
 *  PegMoveType
 *  int
 *  Describes whether peg is static or floats
 *  841
 *  DiscretionMoveType
 *  int
 *  Describes whether discretionary price is static or floats
 *  Valid values:
 *      0 - Floating (default)
 *      1 - Fixed
 */
public class Tag835EnuPegMoveType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumMoveType dataValue;

    public final static MyEnumMoveType TESTA_ENU_PEG_MOVE_TYPE
            = MyEnumMoveType.FIXED;
    public final static MyEnumMoveType TESTB_ENU_PEG_MOVE_TYPE
            = MyEnumMoveType.FLOATING;

    public Tag835EnuPegMoveType(MyEnumMoveType dataValue) {
        setFixType(FIX44.FIX835_ENU_PEG_MOVE_TYPE);
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
        Tag835EnuPegMoveType tagData;

        tagData = new Tag835EnuPegMoveType(TESTA_ENU_PEG_MOVE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag835EnuPegMoveType(TESTB_ENU_PEG_MOVE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
