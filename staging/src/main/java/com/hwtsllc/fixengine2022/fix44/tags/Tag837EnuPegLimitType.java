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
import com.hwtsllc.fixengine2022.datatypes.MyEnumLimitType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  837
 *  PegLimitType
 *  int
 *  Type of Peg Limit
 *  843
 *  DiscretionLimitType
 *  int
 *  Type of Discretion Limit
 *  Valid values:
 *      0 - Or better (default) - price improvement allowed
 *      1 - Strict - limit is a strict limit
 *      2 - Or worse - for a buy the peg limit is a minimum
 *                  and for a sell the peg limit is a maximum
 *                  (for use for orders which have a price range)
 */
public class Tag837EnuPegLimitType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumLimitType dataValue;

    public final static MyEnumLimitType TESTA_ENU_PEG_LIMIT_TYPE
            = MyEnumLimitType.OR_BETTER;
    public final static MyEnumLimitType TESTB_ENU_PEG_LIMIT_TYPE
            = MyEnumLimitType.OR_WORSE;

    public Tag837EnuPegLimitType(MyEnumLimitType dataValue) {
        setFixType(FIX44.FIX837_ENU_PEG_LIMIT_TYPE);
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
        Tag837EnuPegLimitType tagData;

        tagData = new Tag837EnuPegLimitType(TESTA_ENU_PEG_LIMIT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag837EnuPegLimitType(TESTB_ENU_PEG_LIMIT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
