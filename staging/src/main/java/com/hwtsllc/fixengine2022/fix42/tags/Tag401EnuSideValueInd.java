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
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum401SideValueInd;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  Tag401
 *  Enu
 *  SideValueInd
 *
 *      1-2 msg types
 *      SIDE_VALUE_1( "1", "SIDE_VALUE_1", "1 - Side Value 1" ),
 *      SIDE_VALUE_2( "2", "SIDE_VALUE_2", "2 - Side Value 2" ),
 */
public class Tag401EnuSideValueInd extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum401SideValueInd dataValue;

    public final static Enum401SideValueInd TESTA_ENU_SIDE_VALUE_IND = Enum401SideValueInd.SIDE_VALUE_1;
    public final static Enum401SideValueInd TESTB_ENU_SIDE_VALUE_IND = Enum401SideValueInd.SIDE_VALUE_2;

    public Tag401EnuSideValueInd(Enum401SideValueInd dataValue) {
        setFixType(FIX42.FIX401_ENU_SIDE_VALUE_IND);
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
        Tag401EnuSideValueInd tagData;

        tagData = new Tag401EnuSideValueInd(TESTA_ENU_SIDE_VALUE_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag401EnuSideValueInd(TESTB_ENU_SIDE_VALUE_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
