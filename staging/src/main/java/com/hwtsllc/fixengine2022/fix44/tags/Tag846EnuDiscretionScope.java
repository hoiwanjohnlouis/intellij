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
import com.hwtsllc.fixengine2022.datatypes.MyEnumScope;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  840 (same as 840, 846,)
 *  PegScope
 *  int
 *  <p>
 *  The scope of the peg
 *  <p></p>
 *  846
 *  DiscretionScope
 *  int
 *  <p>
 *  The scope of the discretion
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 *  <p>    4 - National excluding local
 */
public class Tag846EnuDiscretionScope extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumScope dataValue;

    public final static MyEnumScope TESTA_ENU_DISCRETION_SCOPE
            = MyEnumScope.NATIONAL;
    public final static MyEnumScope TESTB_ENU_DISCRETION_SCOPE
            = MyEnumScope.NATIONAL_EXCLUDING_LOCAL;

    public Tag846EnuDiscretionScope(MyEnumScope dataValue) {
        setFixType(FIX44.FIX846_ENU_DISCRETION_SCOPE);
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
        Tag846EnuDiscretionScope tagData;

        tagData = new Tag846EnuDiscretionScope(TESTA_ENU_DISCRETION_SCOPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag846EnuDiscretionScope(TESTB_ENU_DISCRETION_SCOPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
