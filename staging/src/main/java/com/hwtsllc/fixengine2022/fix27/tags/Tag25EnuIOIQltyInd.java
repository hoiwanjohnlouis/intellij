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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  25
 *  IOIQltyInd
 *  char
 *  Relative quality of indication
 *  Valid values:
 *      H - High
 *      L - Low
 *      M - Medium
 */
public class Tag25EnuIOIQltyInd extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum25IOIQltyInd dataValue;

    public final static Enum25IOIQltyInd TESTA_ENU_IOI_QLTY_IND = Enum25IOIQltyInd.LOW; // fake data
    public final static Enum25IOIQltyInd TESTB_ENU_IOI_QLTY_IND = Enum25IOIQltyInd.HIGH;

    public Tag25EnuIOIQltyInd(Enum25IOIQltyInd dataValue) {
        setFixType(FIX27.FIX25_ENU_IOI_QLTY_IND);
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
        Tag25EnuIOIQltyInd tagData;

        tagData = new Tag25EnuIOIQltyInd(TESTA_ENU_IOI_QLTY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag25EnuIOIQltyInd(TESTB_ENU_IOI_QLTY_IND);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
