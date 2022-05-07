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
import com.hwtsllc.fixengine2022.fix44.enums.Enum875CPProgram;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  875
 *  CPProgram
 *  int
 *  The program under which a commercial paper is issued
 *  Valid values:
 *      1 - 3(a)(3)
 *      2 - 4(2)
 *      99 - Other
 *
 *  or any value conforming to the data type Reserved100Plus
 */
public class Tag875EnuCPProgram extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum875CPProgram dataValue;

    public final static Enum875CPProgram TESTA_ENU_CP_PROGRAM
            = Enum875CPProgram.FOUR;
    public final static Enum875CPProgram TESTB_ENU_CP_PROGRAM
            = Enum875CPProgram.OTHER;

    public Tag875EnuCPProgram(Enum875CPProgram dataValue) {
        setFixType(FIX44.FIX875_ENU_CP_PROGRAM);
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
        Tag875EnuCPProgram tagData;

        tagData = new Tag875EnuCPProgram(TESTA_ENU_CP_PROGRAM);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag875EnuCPProgram(TESTB_ENU_CP_PROGRAM);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
